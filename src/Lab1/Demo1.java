package Lab1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author sendres1
 */
public class Demo1 {
    public static void main(String[] args) {
           
        Employee2 e1 = new Employee2("Jones", "Sally", "333-333-3333");
        Employee2 e2 = new Employee2("Jones", "Sally", "333-333-3333");
        
        System.out.println("e1 tostring()" + e1);  // this will do the same
        System.out.println("e1 tostring()" + e1.toString());   
        
    // default equals method doesn't work
        // overide equals in employee code added and it works
        if(e1.equals(e2))
            System.out.println("equal");
        else
            System.out.println("not equal");
        
        
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
