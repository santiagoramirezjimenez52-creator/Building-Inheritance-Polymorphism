# Building-Inheritance-Polymorphism
Modeling a real world building hierarchy using Java inheritance and polymorphism. This project implements an abstract Building superclass and multiple subclasses (Warehouse, IndustrialPlaza, RowHouse, Apartment) following UML specifications from INFO3134 (Fanshawe College).

# Building Inheritance & Polymorphism (INFO3134 Project)

This Java project models a hierarchy of building types using inheritance and polymorphism. 
It follows the UML specifications provided in INFO3134 (Fanshawe College).

## Classes Implemented
### Building (abstract)
- Base class containing common attributes: type, length, width, floors.
- Includes getArea() method and abstract getBuildingDetails().

### Warehouse (extends Building)
- Adds percentStorage and number of rooms.
- Implements its own getBuildingDetails().

### IndustrialPlaza (extends Warehouse)
- Adds number of units and usage type.
- Overrides getBuildingDetails() to include combined unit area.

### RowHouse (extends Building)
- Adds units, bedrooms, bathrooms.
- Overrides getBuildingDetails().

### Apartment (extends RowHouse)
- Adds levels and parking spaces.
- Parking spaces calculated based on units and levels.

### ConstructBuilding (driver)
- Instantiates one object of each subclass.
- Stores them in a Building[] array to demonstrate polymorphism.
- Mutates the Apartment object and reprints details.
- Uses instanceof to identify object types and print all attributes.

## Concepts Demonstrated
- Abstract classes
- Method overriding
- Multi-level inheritance
- Polymorphism with Building[]
- Encapsulation (getters/setters)
- Area calculations
- Object mutation
- instanceof type checking

## How to Run
Compile all '.java' files and run 'ConstructBuilding.java'.

## Course
INFO3134 – Object-Oriented Programming  
Fanshawe College
