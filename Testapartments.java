/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapartments;


public class Testapartments {
    
    public static void main(String[] args) {
     
    //Creating objects 
    
 Apartments Apartments1 = new Apartments (5, 2, 1, 400.00);  //creating new object with different information
 Apartments Apartments2 = new Apartments (7, 3, 2, 650.00);  //creating new object with different information
 Apartments Apartments3 = new Apartments (8, 4, 3, 725.00);  //creating new object with different information  
 Apartments Apartments4 = new Apartments (3, 5, 4, 800.00);  //creating new object with different information   
 Apartments Apartments5 = new Apartments (15, 6, 5, 950.00); //creating new object with different information    
        
 
 //String printing out the information for each object
System.out.println("\n" + "This will be the information regarding Apartment Number " + Apartments1.getApartmentNum() + "\n" 
 + "The Apartment has " + Apartments1.getNumberOfBathrooms() + " bathrooms, and " + Apartments1.getNumberOfBedrooms() +
   " bedrooms. " + "\n" + "The rent for this apartment will cost " + Apartments1.getRentAmount() + " per month."); 

 //String printing out the information for each object
System.out.println("\n" + "This will be the information regarding Apartment Number " + Apartments2.getApartmentNum() + "\n" 
 + "The Apartment has " + Apartments2.getNumberOfBathrooms() + " bathrooms, and " + Apartments2.getNumberOfBedrooms() +
   " bedrooms. " + "\n" + "The rent for this apartment will cost " + Apartments2.getRentAmount()+ " per month."); 
  
 //String printing out the information for each object
System.out.println("\n" + "This will be the information regarding Apartment Number " + Apartments3.getApartmentNum() + "\n" 
 + "The Apartment has " + Apartments3.getNumberOfBathrooms() + " bathrooms, and " + Apartments3.getNumberOfBedrooms() +
   " bedrooms. " + "\n" + "The rent for this apartment will cost " + Apartments3.getRentAmount()+ " per month."); 

 //String printing out the information for each object
System.out.println("\n" + "This will be the information regarding Apartment Number " + Apartments4.getApartmentNum() + "\n" 
 + "The Apartment has " + Apartments4.getNumberOfBathrooms() + " bathrooms, and " + Apartments4.getNumberOfBedrooms() +
   " bedrooms. " + "\n" + "The rent for this apartment will cost " + Apartments4.getRentAmount()+ " per month."); 

 //String printing out the information for each object
System.out.println("\n" + "This will be the information regarding Apartment Number " + Apartments5.getApartmentNum() + "\n" 
 + "The Apartment has " + Apartments5.getNumberOfBathrooms() + " bathrooms, and " + Apartments5.getNumberOfBedrooms() +
   " bedrooms. " + "\n" + "The rent for this apartment will cost " + Apartments5.getRentAmount()+ " per month.");         
    }
    
}
