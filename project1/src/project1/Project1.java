
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.util.Scanner;
/**
 *
 * @author NAMRATA
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Theater t = new Theater();
        System.out.println("Enter the theater ID : (101,102,103)");
        int theaterID = in.nextInt();
        int theaterRating = t.rating(theaterID);
        Movie m = new Movie();
        int screen=m.movieMethod();
       int ticket;
       System.out.println("Enter the number of tickets : ");
       ticket=in.nextInt();
       PriceCalculation p=new PriceCalculation();
      double price = p.priceCalculation(screen,theaterRating,ticket);
        System.out.println("The total price of the tickets is="+price);
    }
    
}

