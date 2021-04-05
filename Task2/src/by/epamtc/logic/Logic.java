package by.epamtc.logic;

import java.util.ArrayList;
import java.util.List;

import by.epamtc.data.ListBalls;
import by.epamtc.enums.Color;
import by.epamtc.pojos.Ball;
import by.epamtc.pojos.Basket;

public class Logic {

	/**
	 * Filling basket by balls. Values were received from data.ListBalls
	 *
	 * @param basket, object of Basket
	 *
	 * @return basket object filled with listBalls values
	 *
	 */
	public Basket fillBasket(Basket basket) {	
		List<Ball> listBolls = new ArrayList<>();
		
		listBolls.addAll(ListBalls.stockBalls());
		basket.setListBolls(listBolls);	
		
		return basket;
	}

	/**
	 * Get total weight off all balls in basket.
	 *
	 * @param basket, object of Basket
	 *
	 * @return totalWeight double, total sum of weight for all balls;
	 *
	 */
	public double totalBallsWeight(Basket basket) {
		double totalWeight = 0;
		if(!basket.isBasketEmpty()) {
			for(Ball boll : basket.getListBalls())
				totalWeight += boll.getWeight() ;
		}
		return totalWeight;
	}
	
	/**
	 * Get count of balls if basket by specific color.
	 *
	 * @param basket, object of Basket
	 * @param color, type of Color
	 *
	 * @return count int, number of balls;
	 *
	 */
	public int countBollsByColor(Basket basket, Color color) {
		int count = 0;
		if(!basket.isBasketEmpty())
			for(Ball ball : basket.getListBalls()) {
				if(ball.getColor().equals(color)){
					count ++;
				}
			}
		return count;
	}
	
	
}
