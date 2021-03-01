/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapartments;


public class Apartments {
    
    
    //Variables
    
    private int ApartmentNum; //int variable 
    private int NumberOfBedrooms; //int variable 
    private int NumberOfBathrooms; //int variable 
    private double RentAmount; //double variable 
    
    //Constructor 
    public Apartments(int apartment, int bedrooms, int bathrooms, double rent){
       
        ApartmentNum = apartment; //calculates the ApartmentNum
        NumberOfBedrooms = bedrooms; //calculates the NumberOfBedrooms
        NumberOfBathrooms = bathrooms; //calculates the NumberOfBathrooms
        RentAmount = rent; //calculates the RentAmount
    }   

    public int getApartmentNum() { //getApartmentNum vaule
        return ApartmentNum; //returning the apartment number
    }

    public void setApartmentNum(int ApartmentNum) { //setApartmentNum vaule
        this.ApartmentNum = ApartmentNum; //setting the apartment number as an int
    }

    public int getNumberOfBedrooms() { //getNumberOfBedrooms vaule
        return NumberOfBedrooms; //returning the number of bedrooms
    }

    public void setNumberOfBedrooms(int NumberOfBedrooms) {
        this.NumberOfBedrooms = NumberOfBedrooms; //setting the number of bedrooms
    }

    public int getNumberOfBathrooms() { //getNumberOfBathrooms vaule
        return NumberOfBathrooms; //returning the number of bathrooms
    }

    public void setNumberOfBathrooms(int NumberOfBathrooms) { //setNumberOfBathrooms vaule
        this.NumberOfBathrooms = NumberOfBathrooms; //setting the number of bathrooms as an int
    }

    public double getRentAmount() { //getRentAmount vaule
        return RentAmount; //returning the rent amount as a double
    }

    public void setRentAmount(double RentAmount) { //setRentAmount vaule
        this.RentAmount = RentAmount; //setting the number of rent amount as an double 
    }
    
    
   
    
    
    
}
