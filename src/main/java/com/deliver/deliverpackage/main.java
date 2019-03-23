/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.deliver.deliverpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

/**
 *
 * @author Denis
 */
public class main {
    public List<List<Integer>> routeDeliver(List<List<Integer>> routes, Integer packages, Integer deliveries){
        if(deliveries <= packages){
            Double routeSqrt = 0.0;
            Double routePow = 0.0;
            Integer countDeliveries = 0;
            List<Entry<List<Integer>, Double>> list = new LinkedList<>();
            List<List<Integer>> returnValue = new ArrayList<>();
            HashMap<List<Integer>, Double> calcRoutes = new HashMap<>();
            
            for (List<Integer> route : routes){
                routePow = calculatePow(route);
                routeSqrt = calculateSquareRoot(routePow);
                calcRoutes.put(route, routeSqrt);
            }
            
            list.addAll(orderValues(calcRoutes));
            for(Entry<List<Integer>, Double> value: list) {
                if(countDeliveries < deliveries){
                    returnValue.add(value.getKey());
                    countDeliveries++;
                }
            }
            return returnValue;
        }
        return null;
    }
    
    public Double calculatePow(List<Integer> values){
        Double valueCalculated = 0.0;
        valueCalculated = values.stream().map((value) -> Math.pow(value, 2)).reduce(valueCalculated, (accumulator, _item) -> accumulator + _item);
        return valueCalculated;
    }
    
    public Double calculateSquareRoot(Double value){
        return Math.sqrt(value);
    }
    
    public List<Entry<List<Integer>,Double>> orderValues(HashMap<List<Integer>, Double> routes){
        List<Entry<List<Integer>, Double>> list = new LinkedList<>(routes.entrySet());
        Collections.sort(list, (Entry<List<Integer>, Double> m1, Entry<List<Integer>, Double> m2) -> m1.getValue().compareTo(m2.getValue()));
        return list;
    }
}
