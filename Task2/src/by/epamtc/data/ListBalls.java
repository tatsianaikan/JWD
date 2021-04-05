package by.epamtc.data;

import java.util.ArrayList;
import java.util.List;

import by.epamtc.enums.Color;
import by.epamtc.pojos.Ball;

public class ListBalls {

	public static List<Ball> stockBalls(){ 
        List<Ball> balls = new ArrayList<Ball>();	
	
        balls.add(new Ball(5, Color.RED));
        balls.add(new Ball(6, Color.BLUE));
        balls.add(new Ball(2, Color.RED));
        balls.add(new Ball(2, Color.GREEN));
        balls.add(new Ball(5, Color.RED));
        balls.add(new Ball(7.3, Color.BLUE));
        balls.add(new Ball(10, Color.BLUE));
        balls.add(new Ball(3, Color.RED));
        balls.add(new Ball(3, Color.GREEN));
        balls.add(new Ball(4, Color.GREEN));
        balls.add(new Ball(6, Color.RED));
        balls.add(new Ball(3.5, Color.RED));
        	    
	    return balls;
	}

}
