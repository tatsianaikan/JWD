package by.epamtc.main;

import by.epamtc.enums.Color;
import by.epamtc.logic.Logic;
import by.epamtc.pojos.Basket;

public class Main {

	public static void main(String[] args) {
		
		Logic logic = new Logic();
		Basket basket = new Basket();	
		
		logic.fillBasket(basket);	
		
		System.out.printf("The backet contains: %s \n", basket.getListBalls());
		System.out.printf("Total weight of balls: %.2f \n", logic.totalBallsWeight(basket));
		System.out.printf("Number of %s balls: %d", Color.BLUE, logic.countBollsByColor(basket, Color.BLUE));

	}
}

	


