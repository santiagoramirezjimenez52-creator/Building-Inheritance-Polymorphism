/**
 * Program Name:RowHouse.java
 * Purpose:
 * Coder: Santiago, 1324781
 * Date: Mar 5, 2026
 */

public class RowHouse extends Building
{
	private int numUnits;
	private int numBeds;
	private int numBaths;
	
	/**
	* Method Name: constructor method RowHouse <br>
	* Purpose: a public class method      <br>
	* Accepts: double, int    <br>
	* Returns:     <br>
	* Date: March 5, 2026         <br>
	*/
	
	public RowHouse(double length, double width, int floors, int units, int beds, int baths) {
		super("RowHouse", length, width, floors);
    this.numUnits = units;
    this.numBeds = beds;
    this.numBaths = baths;

	}
	
	/**
	* Method Name: constructor method RowHouse <br>
	* Purpose: a public class method      <br>
	* Accepts: double, int, String    <br>
	* Returns:     <br>
	* Date: March 5, 2026         <br>
	*/
	
	public RowHouse(String type, double length, double width, int floors, int units, int beds, int baths) {
		super(type, length, width, floors);
    this.numUnits = units;
    this.numBeds = beds;
    this.numBaths = baths;

	}
	
	/**
	* Method Name: getNumUnits <br>
	* Purpose: a public class method      <br>
	* Accepts: int    <br>
	* Returns:  int   <br>
	* Date: March 5, 2026         <br>
	*/
	
	public int getNumUnits() {
		return numUnits;
	}
	
	/**
	* Method Name: getNumBeds <br>
	* Purpose: a public class method      <br>
	* Accepts: int    <br>
	* Returns:  int   <br>
	* Date: March 5, 2026         <br>
	*/
	
	public int getNumBeds() {
		return numBeds;
	}
	
	/**
	* Method Name: getNumBaths <br>
	* Purpose: a public class method      <br>
	* Accepts: int    <br>
	* Returns:  int   <br>
	* Date: March 5, 2026         <br>
	*/
	
	public int getNumBaths() {
		return numBaths;
	}
	
	/**
	* Method Name: setNumUnits <br>
	* Purpose: a public class method      <br>
	* Accepts: int    <br>
	* Returns: void   <br>
	* Date: March 5, 2026         <br>
	*/
	
	public void setNumUnits(int units) {
		this.numUnits = units;
	}
	
	/**
	* Method Name: setNumBeds <br>
	* Purpose: a public class method      <br>
	* Accepts: int    <br>
	* Returns: void   <br>
	* Date: March 5, 2026         <br>
	*/
	
	public void setNumBeds(int beds) {
		this.numBeds = beds;
	}
	
	/**
	* Method Name: setNumBaths <br>
	* Purpose: a public class method      <br>
	* Accepts: int    <br>
	* Returns: void   <br>
	* Date: March 5, 2026         <br>
	*/
	
	public void setNumBaths(int baths) {
		this.numBaths = baths;
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
		System.out.println("Building Type: RowHouse which has " + numUnits + " living units on one level.");
    System.out.println("Unit Area: " + getArea() + " square feet on " + getNumFloors() + " floor(s).");
    System.out.println("Total area of all units on one floor is " + (Math.round(getArea() * numUnits * 10.0) / 10.0) + " square feet.");
    System.out.println("Number of bedrooms: " + numBeds + ". Number of bathrooms: " + numBaths + ".\n");

	}
	}
//end class