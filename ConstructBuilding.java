/**
 * Program Name:ConstructBuilding.java
 * Purpose:
 * Coder: Santiago, 1324781
 * Date: Mar 6, 2026
 */

public class ConstructBuilding
{
	public static void main(String[] args) {
		Building[] buildingArray = new Building[4];
		
		buildingArray[0] = new Warehouse(130.3, 67.2, 3, 76.5, 5);
    buildingArray[1] = new IndustrialPlaza(125.7, 50.2, 2, 82.5, 4, 16, "manufacturing");
    buildingArray[2] = new RowHouse(28.5, 21.0, 3, 7, 3, 2);
    buildingArray[3] = new Apartment(29.5, 22.0, 2, 18, 1, 1, 25);


		for(Building b: buildingArray) {
			b.getBuildingDetails();
		}
		
		
		System.out.println("\nMutating the Apartment object:");
		
		Apartment apt = (Apartment) buildingArray[3];
    apt.setNumUnits(18);
    apt.setNumBeds(1);
    apt.setNumBaths(1);
    apt.setNumLevels(25);
    apt.setNumParkingSpaces(560);

    apt.getBuildingDetails();
    
    
    Warehouse tempWarehouse = null;
    IndustrialPlaza tempPlaza = null;
    RowHouse tempRowHouse = null;
    Apartment tempApartment = null;
    
    System.out.println ("\nAnalyzing each element of the buildingArray. ");
    for (Building b : buildingArray) {
      if (b instanceof Apartment) {
          tempApartment = (Apartment) b;
          System.out.println("Type of building: Apartment");
          System.out.println("Unit length: " + tempApartment.getLength());
          System.out.println("Unit width: " + tempApartment.getWidth());
          System.out.println("Number of floors in each unit: " + tempApartment.getNumFloors());
          System.out.println("Area of each unit: " + tempApartment.getArea());
          System.out.println("Number of bathrooms in each unit: " + tempApartment.getNumBaths());
          System.out.println("Number of bedrooms in each unit: " + tempApartment.getNumBeds());
          System.out.println("Number of levels in this apartment: " + tempApartment.getNumLevels());
          System.out.println("Number of units on each level: " + tempApartment.getNumUnits());
          System.out.println("Number of parking spaces available: " + tempApartment.getParkingSpaces() + "\n");
      }

      else if (b instanceof IndustrialPlaza) {
          tempPlaza = (IndustrialPlaza) b;
          System.out.println("Type of building: Industrial Plaza");
          System.out.println("Unit length: " + tempPlaza.getLength());
          System.out.println("Unit width: " + tempPlaza.getWidth());
          System.out.println("Number of floors in each unit: " + tempPlaza.getNumFloors());
          System.out.println("Area of each unit: " + tempPlaza.getArea());
          System.out.println("Number of rooms in each unit: " + tempPlaza.getRooms());
          System.out.println("Storage space in each unit: " + tempPlaza.getPercentStorage());
          System.out.println("Number of units in this industrial plaza: " + tempPlaza.getNumUnits());
          System.out.println("This industrial plaza is designated for " + tempPlaza.getUsage() + " usage.\n");
      }

      else if (b instanceof RowHouse) {
          tempRowHouse = (RowHouse) b;
          System.out.println("Type of building: RowHouse");
          System.out.println("Unit length: " + tempRowHouse.getLength());
          System.out.println("Unit width: " + tempRowHouse.getWidth());
          System.out.println("Number of floors in each unit: " + tempRowHouse.getNumFloors());
          System.out.println("Area of each unit: " + tempRowHouse.getArea());
          System.out.println("Number of bathrooms in each unit: " + tempRowHouse.getNumBaths());
          System.out.println("Number of bedrooms in each unit: " + tempRowHouse.getNumBeds());
          System.out.println("Number of units: " + tempRowHouse.getNumUnits() + "\n");
      }

      else if (b instanceof Warehouse) {
          tempWarehouse = (Warehouse) b;
          System.out.println("Type of building: Warehouse");
          System.out.println("Unit length: " + tempWarehouse.getLength());
          System.out.println("Unit width: " + tempWarehouse.getWidth());
          System.out.println("Number of floors: " + tempWarehouse.getNumFloors());
          System.out.println("Area of this unit: " + tempWarehouse.getArea());
          System.out.println("Number of rooms in this unit: " + tempWarehouse.getRooms());
          System.out.println("Storage space in this unit: " + tempWarehouse.getPercentStorage() + "\n");
      }
  }

    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end main
}
//end class