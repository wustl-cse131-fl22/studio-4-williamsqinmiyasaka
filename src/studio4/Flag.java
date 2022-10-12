package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	  	StdDraw.clear();
	  	
	  	StdDraw.setPenColor(30, 150, 30);
	  	StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.25);
	  	
	  	StdDraw.setPenColor(10, 250, 30);
	  	StdDraw.rectangle(0.5, 0.5, 0.5, 0.25);
	  	
	  	StdDraw.setPenColor(Color.white);  	
	  	StdDraw.filledCircle(0.20, 0.60, 0.10);
	  	
	  	StdDraw.setPenColor(Color.black);  	
	  	StdDraw.filledCircle(0.20, 0.60, 0.05);
	  	
	  	StdDraw.setPenColor(Color.white);  	
	  	StdDraw.filledCircle(0.80, 0.60, 0.10);
	  	
	  	StdDraw.setPenColor(Color.black);  	
	  	StdDraw.filledCircle(0.80, 0.60, 0.05);
	  	
	  	StdDraw.setPenColor(200, 200, 30);
	  	StdDraw.filledEllipse(0.5, 0.5, 0.3, 0.1);
	  	
	  	StdDraw.setPenColor(Color.red);
	  	StdDraw.filledEllipse(0.5, 0.37, 0.1, 0.05);
	  	
	  	StdDraw.setPenColor(Color.black);
	  	StdDraw.filledRectangle(0.2, 0.5, 0.18, 0.01);
	  	
	  	StdDraw.setPenColor(Color.black);
	  	StdDraw.filledRectangle(0.8, 0.5, 0.18, 0.01);
	  	
	  	StdDraw.setPenColor(Color.black);
	  	StdDraw.filledRectangle(0.2, 0.44, 0.18, 0.01);
	  	
	  	StdDraw.setPenColor(Color.black);
	  	StdDraw.filledRectangle(0.8, 0.44, 0.18, 0.01);

	}
}