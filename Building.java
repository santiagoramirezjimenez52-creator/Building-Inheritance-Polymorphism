/**
 * Program Name:Building.java
 * Purpose:
 * Coder: Santiago, 1324781
 * Date: Mar 5, 2026
 */

public abstract class Building
{
	private String type;
	private double length;
	private double width;
	private int numFloors;
	
	/**
	* Method Name: Constructor Method Building <br>
	* Purpose: a public class method      <br>
	* Accepts: String, double, int     <br>
	* Returns:       <br>
	* Date: March 5, 2026         <br>
	*/
	
	public Building(String type, double length, double width, int numFloors) {
		this.type = type;
    this.length = length;
    this.width = width;
    this.numFloors = numFloors;

	}
	
	/**
	* Method Name: getType <br>
	* Purpose: a public class method      <br>
	* Accepts: string     <br>
	* Returns: string     <br>
	* Date: March 5, 2026         <br>
	*/
	
	public String getType() {
		return type;
	}
	
	/**
	* Method Name: getLength <br>
	* Purpose: a public class method      <br>
	* Accepts: double     <br>
	* Returns: double     <br>
	* Date: March 5, 2026         <br>
	*/
	
	public double getLength() {
		return length;
	}
	
	/**
	* Method Name: getWidth <br>
	* Purpose: a public class method      <br>
	* Accepts: double     <br>
	* Returns: double     <br>
	* Date: March 5, 2026         <br>
	*/
	
	public double getWidth() {
		return width;
	}
	
	/**
	* Method Name: getNumFloors <br>
	* Purpose: a public class method      <br>
	* Accepts: int     <br>
	* Returns: int     <br>
	* Date: March 5, 2026         <br>
	*/
	
	public int getNumFloors() {
		return numFloors;
	}
	
	/**
	* Method Name: setLength <br>
	* Purpose: a public class method      <br>
	* Accepts: double     <br>
	* Returns: void    <br>
	* Date: March 5, 2026         <br>
	*/
	
	public void setLength(double length) {
		this.length = length;
	}
	
	
	/**
	* Method Name: setWidth <br>
	* Purpose: a public class method      <br>
	* Accepts: double     <br>
	* Returns: void    <br>
	* Date: March 5, 2026         <br>
	*/
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**
	* Method Name: setNumFloors <br>
	* Purpose: a public class method      <br>
	* Accepts: int     <br>
	* Returns: void    <br>
	* Date: March 5, 2026         <br>
	*/
	
	public void setNumfloors(int numFloors) {
		this.numFloors = numFloors;
	}
	
	/**
	* Method Name: getArea <br>
	* Purpose: a public class method      <br>
	* Accepts: double     <br>
	* Returns: double    <br>
	* Date: March 5, 2026         <br>
	*/
	
	public double getArea() {
		double area = length * width * numFloors;
		area = Math.round(area*10.0)/10.0;
		return area;
	}
	
	/**
	* Method Name: getBuildingDetails <br>
	* Purpose: a public class method      <br>
	* Accepts:      <br>
	* Returns: void    <br>
	* Date: March 5, 2026         <br>
	*/
	
	public abstract void getBuildingDetails();
	
	
	
	
}
//end class