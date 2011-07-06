package com.goldhawk.WWAndroid.Model.Abstract;


public abstract class AFood implements IFood {

	private String name;
	private double fat;
	private double fibre;
	private double protein;
	private double carbs;
	
	//Abstract Methods
	protected abstract int calculatePoints(double fat, double protein, double carbs, double fibre, double quanity);

	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public  void setName(String name) {
		this.name = name;
	}
	
	@Override
	public final double getFat() {
		return this.fat;
	}
	@Override
	public final void setFat(double fat) {
		this.fat = fat;
	}
	
	@Override
	public final double getFibre() {
		return this.fibre;
	}
	@Override
	public final void setFibre(double fibre) {
		this.fibre = fibre;
	}

	@Override
	public final double getProtein() {
		return this.protein;
	}
	@Override
	public final void setProtein(double protein) {
		this.protein = protein;
	}

	@Override
	public final double getCarbs() {
		return this.carbs;
	}
	@Override
	public final void setCarbs(double carbs) {
		this.carbs = carbs;
	}
	
	@Override
	public final int calculatePoints()
	{
		return this.calculatePoints(1);
	}
	@Override
	public final int calculatePoints(double d)
	{
		return this.calculatePoints(this.fat, this.protein, this.carbs, this.fibre, d);
	}

	
	//constructors
	public AFood(String name, double protein, double carbs, double fat, double fibre)
	{
		this.protein = protein;
		this.fat = fat;
		this.fibre = fibre;
		this.carbs = carbs;
		this.name = name;
	}
}
