package com.sai.algorithms;

import java.util.HashSet;

public class UniqueName {
    public static String firstUniqueName(String[] names) {
        HashSet<String> set=new HashSet<String>();
        String s2= null;
        for(String s1 : names){
            if(set.contains(s1)){
                continue;
            }else{
            	set.add(s1);
            	s2=s1;
            }
        }
        return s2;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueName(new String[] { "Abbi", "Adeline", "Abbi", "Adalia" }));
    }
}