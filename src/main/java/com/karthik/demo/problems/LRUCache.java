package com.karthik.demo.problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

  public static void main(String[] args) {
    LRUCache lRUCache = new LRUCache(2);
    lRUCache.put(1, 1); // cache is {1=1}
    lRUCache.put(2, 2); // cache is {1=1, 2=2}
    System.out.println(lRUCache.get(1)); // return 1
    lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
    System.out.println(lRUCache.get(2)); // returns -1 (not found)
    lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
    System.out.println(lRUCache.get(1)); // return -1 (not found)
    System.out.println(lRUCache.get(3)); // return 3
    System.out.println(lRUCache.get(4)); // return 4
  }

  private HashMap<Integer, Integer> lruCacheMap = null;

  public LRUCache(int capacity) {
    lruCacheMap =
        new LinkedHashMap<>(capacity, 1f, true) {
          @Override
          public boolean removeEldestEntry(Map.Entry<Integer, Integer> entry) {
            return lruCacheMap.size() > capacity;
          }
        };
  }

  public int get(int key) {
    return lruCacheMap.get(key) != null ? lruCacheMap.get(key) : -1;
  }

  public void put(int key, int value) {
    lruCacheMap.put(key, value);
  }
}
