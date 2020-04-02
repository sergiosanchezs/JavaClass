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
	public double packageBPrice = 150.00;		//$150/hr
	public double storageSmallPrice = 8.00;		//$8/day
	public double storageLargePrice = 20.01;	//$20.01/day
	public double smallBoxesPrice = 2.50;				//$2.50
	public double LargeBoxesPrice = 4.50;				//$4.50
	public int packageAHours;
	public int packageBHours;
	public int storageSmallDays;
	public int storageLargeDays;
	public String boxType;
	public double serviceCostValue;
	public double itemCostValue;
	public double totalCostValue;
	
	/**
	 * This constructor with no parameters accepted.
	 * Default values:
	 * Small boxes = $2.50
	 * Large boxes = $4.50
	 * 
	 * @return a double with the value of service cost.
	 */
	public Quote() {
		this.smallBoxesPrice = 2.50;
		this.LargeBoxesPrice = 4.50;
	}
	
	public Quote(double boxPrice, String typeOfBox) {
		if (typeOfBox.equalsIgnoreCase("S"))
			this.smallBoxesPrice = boxPrice;
		if (typeOfBox.equalsIgnoreCase("L"))
		this.LargeBoxesPrice = boxPrice;
	}
	
	public Quote(double boxSmall, double boxLarge) {
		this.smallBoxesPrice = boxSmall;
		this.LargeBoxesPrice = boxLarge;
	}
	
	/**
	 * This method calculates the service cost when the user doesn't select any package.
	 * This method assign the result to serviceCostValue field.
	 */
	public void serviceCost() {
		serviceCostValue = 0;
	}
	
	/**
	 * This method calculates the service cost when the user select only one package.
	 * This method assign the result to serviceCostValue field.
	 * 
	 * @param hoursPackage This is the hours of selected package by the user.
	 * @param packageType This is the package user selection A or B.
	 */
	public void serviceCost(int hoursPackage, String packageType) {
		serviceCostValue = 0;
		if (packageType.equalsIgnoreCase("A"))
			serviceCostValue += this.packageAPrice * hoursPackage;
		else if (packageType.equalsIgnoreCase("B"))
			serviceCostValue += this.packageBPrice * hoursPackage;
	}
	
	/**
	 * This method calculates the service cost when the user select both packages.
	 * This method assign the result to serviceCostValue field.
	 * 
	 * @param hoursPackageA This is the hours of package A by the user.
	 * @param hoursPackageB This is the hours of package B by the user.
	 */
	public void serviceCost(int hoursPackageA, int hoursPackageB) {
		serviceCostValue = 0;
		serviceCostValue += this.packageAPrice * hoursPackageA;
		serviceCostValue += this.packageBPrice * hoursPackageB;
	}
	
	/**
	 * This method calculates the item cost when the user just select one of the two boxes.
	 * This method assign the result to itemCostValue field.
	 * 
	 * @param isOneSmallOrLargeBox This is a String if the user want a small box (s or S) or a large box (l or L).
	 */
	public void itemCost( String isOneSmallOrLargeBox ) {
		itemCostValue = 0;
		if (isOneSmallOrLargeBox.equalsIgnoreCase("S"))
			itemCostValue += this.smallBoxesPrice;
		if (isOneSmallOrLargeBox.equalsIgnoreCase("L"))
			itemCostValue += this.LargeBoxesPrice;
	}
	

	/**
	 * This method calculates the item cost when you want to define all the parameters taking 
	 * into account of item cost.
	 * This method assign the result to itemCostValue field.
	 * 
	 * @param storageDays This is a integer to define the days for one storage.
	 * @param storageType This is a String to define the type of the storage small (s or S) and large (l or L).
	 * @param isOneSmallOrLargeBox This is a String if the user want a small box (s or S) or a large box (l or L).
	 */
	public void itemCost( int storageDays, String storageType, String isOneSmallOrLargeBox ) {
		itemCostValue = 0;
		if (storageType.equalsIgnoreCase("S"))
			itemCostValue += this.storageSmallPrice * storageDays;
		if (storageType.equalsIgnoreCase("L"))
			itemCostValue += this.storageLargePrice * storageDays;
		if (isOneSmallOrLargeBox.equalsIgnoreCase("S"))
			itemCostValue += this.smallBoxesPrice;
		if (isOneSmallOrLargeBox.equalsIgnoreCase("L"))
			itemCostValue += this.LargeBoxesPrice;
	}
	
	/**
	 * This method calculates the item cost when you want to define all the parameters 
	 * taking into account of item cost.
	 * This method assign the result to itemCostValue field.
	 * 
	 * @param smallStorageDays This is a integer to define the days for a small storage.
	 * @param largeStorageDays This is a integer to define the days for a large storage.
	 * @param isOneSmallOrLargeBox This is a String if the user want a small box (s or S) or a large box (l or L).
	 */
	public void itemCost( int smallStorageDays, int largeStorageDays, String isOneSmallOrLargeBox ) {
		itemCostValue = 0;
		itemCostValue += this.storageSmallPrice * smallStorageDays;
		itemCostValue += this.storageLargePrice * largeStorageDays;
		if (isOneSmallOrLargeBox.equalsIgnoreCase("S"))
			itemCostValue += this.smallBoxesPrice;
		if (isOneSmallOrLargeBox.equalsIgnoreCase("L"))
			itemCostValue += this.LargeBoxesPrice;
	}
	
	/**
	 * This method calculates the sum of service cost and item cost.
	 * This method assign the result to totalCostValue field.
	 */
	public void totalCost() {
		totalCostValue = 0;
		totalCostValue += serviceCostValue;
		totalCostValue += itemCostValue;
	}
	

}
