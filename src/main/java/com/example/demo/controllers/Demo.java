package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo { 
    public static void main(String[] args) 
    { 
  
        // Get the Array 
        int intArr[] = { 10, 20, 15, 22, 35 }; 
  
        Arrays.sort(intArr); 
  
        int intKey = 22; 
  
        System.out.println( 
            intKey 
            + " found at index = "
            + Arrays 
                  .binarySearch(intArr,intKey)); 
        
      Integer intA[] = { 10, 20, 15, 22, 35 }; 
        
      List<Integer> list = Arrays.asList(intA);
      System.out.println();
      List<Integer> list1 = list.stream().map(Integer::new).collect(Collectors.toList());
      System.out.println("list1====="+list1);
      
        
        
    } 
} 