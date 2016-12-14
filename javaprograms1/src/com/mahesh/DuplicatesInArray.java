package com.mahesh;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicatesInArray 
{   
    public static void main(String[] args) 
    {
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
 
        HashSet<String> set = new HashSet<String>();
 
        for (String arrayElement : strArray)
        {
        
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
    	
        	Iterator<String> itr = set.iterator();
        	while(itr.hasNext()){
        		System.out.println("Unique elements: "+ itr.next());
        	}
        	
    }   
    
}