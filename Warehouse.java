/**
 * Program Name:Warehouse.java
 * Purpose:
 * Coder: Santiago, 1324781
 * Date: Mar 5, 2026
 */

public class Warehouse extends Building
{
	private double percentStorage;
	private int numRooms;
	
	/**
	* Method Name: constructor method Warehouse <br>
	* Purpose: a public class method      <br>
	* Accepts: double, int     <br>
	* Returns:     <br>
	* Date: March 5, 2026         <br>
	*/
	
	public Warehouse(double length, double width, int numFloors, double pStorage, int rooms) {
		super("Warehouse", length, width, numFloors);
    this.percentStorage = pStorage;
    this.numRooms = rooms;

	}
	
	/**
	* Method Name: constructor method Warehouse <br>
	* Purpose: a public class method      <br>
	* Accepts: double, int, String     <br>
	* Returns:     <br>
	* Date: March 5, 2026         <br>
	*/
	
	public Warehouse(String type, double length, double width, int numFloors, double pStorage, int rooms) {
		super(type, length, width, numFloors);
    this.percentStorage = pStorage;
    this.numRooms = rooms;
}

	/**
	* Method Name: getPercentStorage <br>
	* Purpose: a public class method      <br>
	* Accepts: double     <br>
	* Returns: double    <br>
	* Date: March 5, 2026         <br>
	*/
	
	public double getPercentStorage() {
		return percentStorage;
	}
	
	/**
	* Method Name: getRooms <br>
	* Purpose: a public class method      <br>
	* Accepts: int     <br>
	* Returns: int    <br>
	* Date: March 5, 2026         <br>
	*/
	
	public int getRooms() {
		return numRooms;
	}
	
	/**
	* Method Name: setPercentStorage <br>
	* Purpose: a public class method      <br>
	* Accepts: double     <br>
	* Returns: void    <br>
	* Date: March 5, 2026         <br>
	*/
	
	public void setPercentStorage(double pStorage) {
		this.percentStorage = pStorage;
	}
	
	/**
	* Method Name: setNumRooms <br>
	* Purpose: a public class method      <br>
	* Accepts: int     <br>
	* Returns: void    <br>
	* Date: March 5, 2026         <br>
	*/
	
	public void setNumRooms(int rooms) {
		this.numRooms = rooms;
	}
	
	/**
	* Method Name: getBuildingDetails <br>
	* Purpose: a public class method      <br>
	* Accepts:      <br>
	* Returns: void    <br>
	* Date: March 5, 2026         <br>
	*/
	
	@Override
	public void getBuildingDetails() {
		System.out.println("Building Type: " + getType() + ".");
		System.out.println("Unit area: " + getArea() + " square feet on " + getNumFloors() + " floors.");
		System.out.println("Number of Rooms: " + getRooms() + " rooms with storage accounting for " + percentStorage + " percent of the space.\n" );
		
		}
}
//end class