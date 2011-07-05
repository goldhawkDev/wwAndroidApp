package Concrete;

import Abstract.AFood;

public class UKProPointFood extends AFood {

	public UKProPointFood(String name, double protein, double carbs, double fat, double fibre) {
		super(name,protein, carbs, fat, fibre);
	}

	@Override
	protected int calculatePoints(double fat, double protein, double carbs,
			double fibre, double quanity) {
		
		double calculation = (protein/10.9375)+(carbs/9.2105)+(fat/3.8889)+(fibre/35);
		
		int results = (int)Math.ceil(calculation * quanity);
		
		return results;
	}

}
