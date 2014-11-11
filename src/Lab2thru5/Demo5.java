/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab2thru5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author sendres1
 */

public class Demo5 {
    public static void main(String[] args) {
        String employeeVar;
        
        Employee2 e1 = new Employee2("Jones", "Sally", "111-333-3333");
        Employee2 e2 = new Employee2("Jones", "Sally", "111-333-3333");
        Employee2 e3 = new Employee2("Hill", "Mary", "333-333-3333");
        Employee2 e4 = new Employee2("Lau", "Allan", "444-333-3333");
        
        //use sssn as key
        Map<String,Employee2> empMap = new HashMap<>();
 //       Set<Employee2> removeDupes = new HashSet<>(Employee2);
        
        empMap.put("333-333-3333", e1);
        // e2 replaces e1 at this key
        empMap.put(e2.getSsn(), e2);
        empMap.put(e2.getSsn(), e3);
        empMap.put(e2.getSsn(), e4);
        
        Employee e = empMap.get("444-333-3333");
        System.out.println("e1" + e1);
        
        
        Set<String> keys = employeeMap.keySet();
        
        for(String key:keys){
            Employee emp = employeeMap.get(key);
            System.out.println(emp);
        }
        
      Collection<Employee> values = employeeMap.values();
      List<Employee> list = new ArrayList<>(values);
      for(int i=0 ; i< list.size(); i++){
          Employee emp = list.get(i);
      /// or use new styp format
      // two ways to retieve map or keys
      }
        
        
      
        
        
             
     
       
//    // print out size of list
//        System.out.println("size of list " + empList.size());
//        
//        
//           // lenght doesn't work, it is 26
//        for(int i = 0; i < empList.size(); i++){
//            System.out.println("employeeVar tostring()" + employeeVar); 
//             }
//     
//        
//        
//        
//    
//        // 2nd entry to variable
//        // need to cast AND use the toString
//        employeeVar = (String) empList.get(1).toString();
//                
//        
//        System.out.println("employeeVar tostring()" + employeeVar);   
//        System.out.println("length" + employeeVar.length());
//        
//        // lenght doesn't work, it is 26
//        for(int i = 0; i < empList.size(); i++){
//            System.out.println("employeeVar tostring()" + employeeVar); 
//             }
//        
//        boolean equals = empList.equals(e4);
//        System.out.println("equals " + equals);
//        
//        System.out.println(" " + empList.lastIndexOf(e4));
//        
//       // empList.set(2 e4);
//        for(int i = 0; i < empList.size(); i++){
//            System.out.println("employeeVar tostring()" + employeeVar); 
//             }
//        
        
    // default equals method doesn't work
        // overide equals in employee code added and it works
        if(e1.equals(e2))
            System.out.println("equal");
        else
            System.out.println("not equal");
        
        
        
    }
    
}


