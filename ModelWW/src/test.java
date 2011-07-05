import Abstract.IFood;
import Concrete.UKProPointFood;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IFood oats = new UKProPointFood("oats so simple porridge oats", 9.4, 54.3, 28.2, 1.3);
				
		System.out.println(oats.getName() + " pp valuel = " + oats.calculatePoints(1));
				
		double test = Math.ceil(0.1);
		
		System.out.print(test);

	}

}
