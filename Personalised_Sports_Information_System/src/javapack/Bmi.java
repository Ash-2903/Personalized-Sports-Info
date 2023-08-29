package javapack;

import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Bmi {

	public double getBmi( double w , double h ) {
		
		DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);
		
		double bmi = w/(h*h) ;
		
		bmi = Double.parseDouble(df.format(bmi));
		
		return bmi;
		
	}
	
}
