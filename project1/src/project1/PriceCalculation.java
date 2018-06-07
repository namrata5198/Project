/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author AKSHATA
 */
public class PriceCalculation {
     public double price;
    /**
     * calculates to the total price of the tickets which is dependent on theaterRating and screen
     * @param screen gives the screen number of the movie
     * @param theaterRating gives the rating of the theater which decides the price of the tickets
     * @param ticket gives number of tickets
     * @return returns total price of the tickets
     */
    public double priceCalculation(int screen,int theaterRating,int ticket){
        if(screen==1&&theaterRating==5)
        {   
             price= ticket * 400;
        }
       else if(screen==2&&theaterRating==5){
             price= ticket * 375;
        }
       else if(screen==3&&theaterRating==5){
           price = ticket * 320;
        }
       else if(screen==1&&theaterRating==4){
             price= ticket * 350;
        }
       else if(screen==2&&theaterRating==4){
           price = ticket * 300;
        }
       else if(screen==3&&theaterRating==4){
             price= ticket * 275;
        }
       else if(screen==1&&theaterRating==3){
             price= ticket * 290;
        }
       else if(screen==2&&theaterRating==3){
             price= ticket * 275;
        }
       else if(screen==3&&theaterRating==3){
             price= ticket * 250;
        }
        else{
            System.out.println("Wrong Entry");
            return 0;
        }
         return price;
    
    
}
}
    

