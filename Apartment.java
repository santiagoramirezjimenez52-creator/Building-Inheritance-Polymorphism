/**
 * Program Name:Apartment.java
 * Purpose:
 * Coder: Santiago, 1324781
 * Date: Mar 5, 2026
 */

public class Apartment extends RowHouse
{
	private int numLevels;
	private int parkingSpaces;
	
	/**
	* Method Name: constructor method Apartment <br>
	* Purpose: a public class method      <br>
	* Accepts: int, double    <br>
	* Returns:    <br>
	* Date: March 5, 2026         <br>
	*/
	
	public Apartment(double length, double width, int  floors, int units, int beds, int baths, int levels) {
		super("Apartment", length, width, floors, units, beds, baths);
    this.numLevels = levels;
    this.parkingSpaces = (units * levels) + (units / 4);

	}
	
	/**
	* Method Name: getNumLevels <br>
	* Purpose: a public class method      <br>
	* Accepts: int    <br>
	* Returns: int   <br>
	* Date: March 5, 2026         <br>
	*/
	
	public int getNumLevels() {
		return numLevels;
	}
	
	/**
	* Method Name: getParkingSpaces <br>
	* Purpose: a public class method      <br>
	* Accepts: int    <br>
	* Returns: int   <br>
	* Date: March 5, 2026         <br>
	*/
	
	public int getParkingSpaces() {
		return parkingSpaces;
	}
	
	/**
	* Method Name: setNumLevels <br>
	* Purpose: a public class method      <br>
	* Accepts: int    <br>
	* Returns: void   <br>
	* Date: March 5, 2026         <br>
	*/
	
	public void setNumLevels(int levels) {
		this.numLevels = levels;
	}
	
	/**
	* Method Name: setNumParkingSpaces <br>
	* Purpose: a public class method      <br>
	* Accepts: int    <br>
	* Returns: void   <br>
	* Date: March 5, 2026         <br>
	*/
	
	public void setNumParkingSpaces(int spaces) {
		this.parkingSpaces = spaces;
	}
	
	/**
	* Method Name: getBuildingDetails <br>
	* Purpose: a public class method      <br>
	* Accepts:     <br>
	* Returns: void   <br>
	* Date: March 5, 2026         <br>
	*/
	
	@Override
	public void getBuildingDetails() {
		System.out.println("Building Type: Apartment which has " + getNumUnits() + " living units on one level.");
    System.out.println("Unit Area: " + getArea() + " square feet on " + getNumFloors() + " floor(s).");
    System.out.println("Total area of all units on one floor is " + (Math.round(getArea() * getNumUnits() * 10.0) / 10.0) + " square feet.");
    System.out.println("Number of bedrooms: " + getNumBeds() + ". Number of bathrooms: " + getNumBaths() + ".");
    System.out.println("This Apartment building has " + numLevels + " levels for a total number of " + (numLevels * getNumUnits()) + " units.");
    System.out.println("This complex has " + parkingSpaces + " parking spaces available.\n");

	}
}
//end class