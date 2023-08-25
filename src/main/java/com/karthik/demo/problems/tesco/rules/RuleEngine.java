package com.karthik.demo.problems.tesco.rules;

import com.karthik.demo.problems.tesco.dto.Item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RuleEngine {


    

    public List<Rule> fetchRules() {

        return List.of(new Rule("BulkBuyLimit","*",10),
                new Rule("BulkBuyLimitCategory","paracetamol",5)

        );
    }

    public String checkRules(List<Item> basketItems){
        //line item level check
        //aggregation for p
        List<Rule> rules = fetchRules();
        Map<String, Integer> pMap = new HashMap<>();

        Rule lineItemCheckRule = rules.get(0);

        long count = basketItems.stream().filter(item -> item.getQuantity() > lineItemCheckRule.getCategoryQty()).count();

        if(count > 0)
            return "BREACHED";

        //p check

        Rule pCheck = rules.get(1);

        for (Item item:basketItems) {
                pMap.put(item.getCategory(),pMap.getOrDefault(item.getCategory(),0)+item.getQuantity());
        }

        if(pMap.get(pCheck.getCategory()) > pCheck.getCategoryQty()){
            return "BREACHED";
        }

        return "MET";


    }
}
