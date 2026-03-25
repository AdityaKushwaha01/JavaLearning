package com.CollectionsLearning;
import java.util.*;

public class SortMapBasedOnValues {

	public static void main(String[] args) {
        String str ="my name is aditya. is aditya, my is  aditya".toLowerCase().replaceAll("[^a-zA-Z]"," ");
        String[] arr= str.split("\\s+");
        Map<String,Integer> mp = new HashMap<>();
        for(String st:arr){
            mp.put(st,mp.getOrDefault(st,0)+1);
        }
        
        List<Map.Entry<String,Integer>> mpList= new ArrayList<>(mp.entrySet());
        mpList.sort((e1,e2)->e2.getValue().compareTo(e1.getValue()));
        //to change from DESC to ASC just change the order of comparison
        Map<String,Integer> sortedMap= new LinkedHashMap<>();
        for(Map.Entry<String,Integer> ent:mpList){
            sortedMap.put(ent.getKey(),ent.getValue());
        }
       
        for(Map.Entry<String,Integer> ent2:sortedMap.entrySet()){
            System.out.println(ent2.getKey()+"-->"+ent2.getValue());
        }   
        
    }

}
