package Lab2thru5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Lab2thru5.Employee2;
import java.util.*;

/**
 *
 * @author sendres1
 */
public class Demo2 {
    public static void main(String[] args) {
        String employeeVar;
        
        Employee2 e1 = new Employee2("Jones", "Sally", "111-333-3333");
        Employee2 e2 = new Employee2("Jones", "Shelly", "111-333-3333");
        Employee2 e3 = new Employee2("Hill", "Mary", "333-333-3333");
        Employee2 e4 = new Employee2("Lau", "Allan", "444-333-3333");
        
        //empList [];
        List empList = new ArrayList();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        
        // this doesn't work
        //System.out.println("last entry" + empList.lastIndexOf(e4));
       
    // print out size of list
        System.out.println("size of list " + empList.size());
    
        // 2nd entry to variable
        // need to cast AND use the toString
        employeeVar = (String) empList.get(1).toString();
                
        
        System.out.println("employeeVar tostring()" + employeeVar);   
        System.out.println("length" + employeeVar.length());
        
        // lenght doesn't work, it is 26
        for(int i = 0; i < empList.size(); i++){
            System.out.println("employeeVar tostring()" + employeeVar); 
             }
        
        Employee2 e5 = (Employee2)empList.get(1);
        System.out.println("e5" + e5);
        
        boolean equals = empList.equals(e4);
        System.out.println("equals " + equals);
        
        System.out.println(" " + empList.lastIndexOf(e4));
        
       // empList.set(2 e4);
        for(int i = 0; i < empList.size(); i++){
            System.out.println("employeeVar tostring()" + employeeVar); 
           
            System.out.println(empList.get(i));  // don't need to cast as print 
            // uses the to-string 
             }
        
        
    // default equals method doesn't work
        // overide equals in employee code added and it works
        if(e1.equals(e2))
            System.out.println("equal");
        else
            System.out.println("not equal");
        
        empList.remove(e2);
        empList.set(2, empList);
        
//        /// List shoppingList = new ArrayList() use cast
//        // HashSet<>() doesn't allow duplicates or entry order
//        
////  //      List <String>shoppingList = new ArrayList<>();  /// dont use 10
////        shoppingList.add("cookies");
////         shoppingList.add("ice cream");
////          shoppingList.add("cookies");
////          
////      //    shoppingList.remove("cookies");
////          shoppingList.add(1, "done");
////      //   shoppingList.addAll(args);
//          
//          
//      //    String r = shoppingList.get(1); // not a string but an generi object
//          String r = shoppingList.get(1); // need to cast
//       // or 
//        //    String r = (String)shoppingList.get(1).toString(); // not the best
//          
//          System.out.println("  ");
//          // legacy technique  pre jdk 5
//          for (int i = 0; i<shoppingList.size(); i++){
//              String item = shoppingList.get(i);
//              System.out.println(item);
//          }
//          
//          // new way  only jdk 5 and above
//          // for each in this list
//          // need this if not using <>
//          for(Object obj : shoppingList){
//              String item = (String)obj;
//              System.out.println(item);
//              
//          }
//           // new way  only jdk 5 and above
          // for each in this list
          // this will only work the the <> operator
//          for(String item : shoppingList){
//             System.out.println(item);
//              
//          }
//          
//          List<Employee> shoppingList2 = new ArrayList<>();
//          shoppingList2.add(e1);
//          shoppingList2.add(e1);
//          
//          Set<Employee> removeDupes = new HashSet<>(shoppingList2);
//       //   shoppingList = new.......
          //move
         // one more line here 
        
        
    }
    
}
