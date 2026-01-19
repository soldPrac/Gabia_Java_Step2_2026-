package chapter20;

import java.util.*;

class Sol1 {
    public int solution(int[] array) {
        Map<Integer, Integer> valMap = new HashMap<Integer, Integer>();
        List<Integer> keyList = new ArrayList<Integer>();
        List<Integer> valList = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            if(valMap.containsKey(array[i])){
                int num = valMap.get(array[i]) + 1;
                valMap.put(array[i], num);
            }
            else{
                valMap.put(array[i], 1);   
            }
        }
        valMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEach(entry -> {
                        keyList.add(entry.getKey());
                        valList.add(entry.getValue());
                    });
        if(valList.size() == 1) return keyList.get(0);
        else if(valList.get(0) == valList.get(1)) {
        	System.out.println(valList.get(0));
        	System.out.println(valList.get(1));
        	return -1;
        }
        else return keyList.get(0);

    }
}
