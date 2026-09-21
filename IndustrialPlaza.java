/**
 * Program Name:IndustrialPlaza.java
 * Purpose:
 * Coder: Santiago, 1324781
 * Date: Mar 5, 2026
 */

public class IndustrialPlaza extends Warehouse
{
	private int numUnits;
	private String usage;
	
	/**
	* Method Name: IndustrialPlaza <br>
	* Purpose: a public class method      <br>
	* Accepts: double, int, String    <br>
	* Returns:     <br>
	* Date: March 5, 2026         <br>
	*/
	
	public IndustrialPlaza(double length, double width, int numFloors, double pStorage, int rooms, int units, String usage) {
		super("Industrial Plaza", length, width, numFloors, pStorage, rooms);
    this.numUnits = units;
    this.usage = usage;

	}
	
	/**
	* Method Name: getNumUnits <br>
	* Purpose: a public class method      <br>
	* Accepts:  int    <br>
	* Returns:  int   <br>
	* Date: March 5, 2026         <br>
	*/
	
	public int getNumUnits() {
		return numUnits;
	}
	
	/**
	* Method Name: getUsage <br>
	* Purpose: a public class method      <br>
	* Accepts:  String    <br>
	* Returns:  String   <br>
	* Date: March 5, 2026         <br>
	*/
	
	public String getUsage() {
		return usage;
	}
	
	/**
	* Method Name: setNumUnits <br>
	* Purpose: a public class method      <br>
	* Accepts:  int    <br>
	* Returns:  void   <br>
	* Date: March 5, 2026         <br>
	*/
	
	public void setNumUnits(int units) {
		this.numUnits = units;
	}
	
	/**
	* Method Name: setUsage <br>
	* Purpose: a public class method      <br>
	* Accepts:  String    <br>
	* Returns:  void   <br>
	* Date: March 5, 2026         <br>
	*/
	
	public void setUsage(String usage) {
		this.usage = usage;
	}
	
	/**
	* Method Name: getBuildingDetails <br>
	* Purpose: a public class method      <br>
	* Accepts:      <br>
	* Returns:  void   <br>
	* Date: March 5, 2026         <br>
	*/
	
	@Override
	public void getBuildingDetails() {
		System.out.println("Building Type: " + getType() + ".");
		System.out.println("Area: " + getArea() + " square feet on " + getNumFloors() + " floors.");
		System.out.println("Number of Rooms in each unit: " + getRooms() + " rooms with storage accounting for " + getPercentStorage() + " percent of the space." );
		System.out.println("We have " + numUnits + " units with a combined total area of " + (Math.round(getArea() * numUnits * 10.0) / 10.0) + " square feet.");
    System.out.println("This Industrial Plaza is designated for " + usage + " only.\n");

		
	}
	
}
//end class