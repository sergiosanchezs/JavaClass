/**
 * 
 */
package assignment5_6;

/**
 * @author Sergio Sanchez
 *
 */
public class Quote {
	public String firstName;
	public String lastName;
	public double packageAPrice = 100.55;		//$100.55/hr
	public int packageAHours;
	public double packageBPrice = 150.00;		//$150/hr
	public int packageBHours;
	public double storageSmallPrice = 8.00;		//$8/day
	public int storageSmallDays;
	public double storageLargePrice = 20.01;	//$20.01/day
	public int storageLargeDays;
	public double smallBoxesPrice;				//$2.50
	public int smallBoxesNumber;
	public double LargeBoxesPrice;				//$4.50
	public int LargeBoxesNumber;
	
	public Quote() {
		this.smallBoxesPrice = 2.50;
		this.LargeBoxesPrice = 4.50;
	}
	
	public Quote(double boxSmall, double boxLarge) {
		this.smallBoxesPrice = boxSmall;
		this.LargeBoxesPrice = boxLarge;
	}
	
	public double serviceCost () {
		double result = 0;
		result += this.packageAPrice * this.packageAHours;
		result += this.packageBPrice * this.packageBHours;
		result += this.storageSmallPrice * this.storageSmallDays;
		result += this.storageLargePrice * this.storageLargeDays;
		return result;
	}
	
	public double itemCost() {
		double result = 0;
		result += this.smallBoxesPrice * this.smallBoxesNumber;
		result += this.LargeBoxesPrice * this.LargeBoxesNumber;
		return result;
	}
	
	public double totalCost() {
		double result = 0;
		result += serviceCost ();
		result += itemCost();
		return result;
	}
	

}
