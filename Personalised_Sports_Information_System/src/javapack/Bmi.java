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
	
	public String getRecommendations(double bmi) {
        StringBuilder recommendations = new StringBuilder("Recommendations based on BMI:\n");

        if (bmi < 18.5) {
            recommendations.append("BMI Category: Underweight\n")
                          .append("Diet Recommendation: Consume nutrient-rich foods and increase calorie intake.\n")
                          .append("Exercise Recommendation: Focus on strength-building exercises and balanced cardio.");
        } else if (bmi < 24.9) {
            recommendations.append("BMI Category: Normal Weight\n")
                          .append("Diet Recommendation: Maintain a balanced diet with adequate nutrients.\n")
                          .append("Exercise Recommendation: Engage in regular cardiovascular exercises and strength training.");
        } else if (bmi < 29.9) {
            recommendations.append("BMI Category: Overweight\n")
                          .append("Diet Recommendation: Opt for portion control and nutrient-dense foods.\n")
                          .append("Exercise Recommendation: Prioritize cardiovascular activities and moderate-intensity workouts.");
        } else {
            recommendations.append("BMI Category: Obese\n")
                          .append("Diet Recommendation: Focus on portion control, whole foods, and a balanced diet.\n")
                          .append("Exercise Recommendation: Incorporate regular exercise, including both cardio and strength training.");
        }

        return recommendations.toString();
    }
	
}
