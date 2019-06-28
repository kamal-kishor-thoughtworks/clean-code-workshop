package com.movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;

public class CustomerTest {
	
	private Customer customer;

    @Before
    public void setup(){
        customer = new Customer("Barack");
        customer.addRental(new Rental(new Movie("Godfather", Movie.REGULAR), 3));
        customer.addRental(new Rental(new Movie("Toy Story", Movie.CHILDRENS), 2));
        customer.addRental(new Rental(new Movie("Avengers", Movie.NEW_RELEASE), 4));

    }

    @Test
    public void verifyThatTheGeneratedStatementIsCorrect(){

        assertEquals("Rental Record for Barack\n" +
                "\tGodfather\t3.5\n" +
                "\tToy Story\t1.5\n" +
                "\tAvengers\t12.0\n" +
                "Amount owed is 17.0\n" +
                "You earned 4 frequent renter points", customer.statement());
    }
    
    
    @Test
    public void test(){
    	customer = new Customer("Barack");
        customer.addRental(new Rental(new Movie("Godfather", Movie.REGULAR), 10));
        customer.addRental(new Rental(new Movie("Toy Story", Movie.CHILDRENS), 20));
        customer.addRental(new Rental(new Movie("Avengers", Movie.NEW_RELEASE), 40));
        
        assertEquals("Rental Record for Barack\n" + 
        		"	Godfather	14.0\n" + 
        		"	Toy Story	27.0\n" + 
        		"	Avengers	120.0\n" + 
        		"Amount owed is 161.0\n" + 
        		"You earned 4 frequent renter points", customer.statement());
        
    }

}