/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
/**
 *
 * @author NAMRATA
 */
class Theater {
    /**
     * takes in an integer parameter i.e. theater id and returns the rating of the theater
     * @param theaterId an id number assigned to each theater
     * @return rating of the theater
     */
    int rating(int theaterId) {
        if(theaterId==101){
            
            System.out.println("The rating of this theater is 5");
            return 5;
        }
            
        if(theaterId==102){
            System.out.println("The rating of this theater is 4");
            return 4;
        }
            
        if(theaterId==103){
            System.out.println("The rating of this theater is 3");
            return 3;
        }
        else{
            System.out.println("Invalid theaterId");
            return 0;
        }
            
    }
}