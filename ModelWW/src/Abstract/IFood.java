package Abstract;

public interface IFood {
	
	//byte caluclateFood(double fat, double protein, double carbs, double fibre);
	
	String getName();
	void setName(String name);
	
	
	double getFat();
	void setFat(double fat);
	
	double getFibre();
	void setFibre(double fibre);
	
	double getProtein();
	void setProtein(double protein);
	
	double getCarbs();
	void setCarbs(double carbs);
	
	int calculatePoints();
	int calculatePoints(double quantity);
	
}
