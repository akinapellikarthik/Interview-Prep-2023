package com.karthik.demo.java17;

import java.util.Stack;

public class MonotonicIncreasingStack {

    public static void main(String[] args) {
        MonotonicIncreasingStack monotonicIncreasingStack = new MonotonicIncreasingStack();
        monotonicIncreasingStack.monotonicIncreasingStack(new int[]{1,7,9,5});
        monotonicIncreasingStack.monotonicDecreasingStack(new int[]{1,7,9,5});
    }

    //Increasing monotonic stack
    public void monotonicIncreasingStack(int[] nums){
        //1,7,9,5
        //1,5
        Stack<Integer> monotonicStackEx = new Stack<>();
        for(int i: nums){
            while (!monotonicStackEx.isEmpty() && i < monotonicStackEx.peek()){
                monotonicStackEx.pop();
            }
            monotonicStackEx.push(i);
        }
        System.out.println(monotonicStackEx);
    }

    //Decreasing monotonic stack
    //Need to fix this code
    public void monotonicDecreasingStack(int[] nums){
        //1,7,9,5
        //1,5
        Stack<Integer> monotonicStackEx = new Stack<>();
        for(int i: nums){
            while (!monotonicStackEx.isEmpty() && i > monotonicStackEx.peek()){
                monotonicStackEx.pop();
            }
            monotonicStackEx.push(i);
        }
        System.out.println(monotonicStackEx);
    }
}
