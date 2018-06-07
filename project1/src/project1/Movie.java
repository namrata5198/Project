/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Movie {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

   int choice,time;
   Scanner in = new Scanner(System.in);
   /**
    * A user selects a Movie and timings of the Movie and the screen number in which the Movie is running is returned
    * @return integer for screen of the Movie
    */
   public int movieMethod(){
       System.out.println("Which movie would you like to watch");
       System.out.println("1.Raazi\n2.Paramanu\n3.Deadpool \nEnter your choice :");
       choice = in.nextInt();
       switch(choice){
           case 1:
               System.out.println("This movie runs from 1)3-6 and 2)9-12");
               System.out.println("Enter your choice of timings : ");
               time = in.nextInt();
               System.out.println("The movie runs on screen 1");
               return 1;
               
           case 2:
               System.out.println("This movie runs from 1)12-3 and 2)9-12");
               System.out.println("Enter your choice of timings : ");
               time = in.nextInt();
               System.out.println("The movie runs on screen 2");
               return 2;
               
           case 3:  
               System.out.println("This movie runs from 1)3-6 and 2)6-9");
               System.out.println("Enter your choice of timings : ");
               time = in.nextInt();
               System.out.println("The movie runs on screen 3");
               return 3;
       }return 0;
   } 

 
}


