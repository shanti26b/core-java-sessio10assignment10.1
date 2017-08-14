/*
 *if we use packagename.* then all the classes and interface of this package  
 * will be accessible .
 * the import keyword is used to make the classes and interfaces of another package 
 * accessible to the current package  
 * 
 * if we import packagename.classname then only  declared the class of this package will be accessible
 * 3. If we use fully qualified name then only we can declare  the class of this package will be 
 * accessible.
 * here there is no need to import. but we have to use fully qualified name every time when  access the class or interface
 */


package package2;   // here creating package name as package2

import package1.Car;

 // here if we use this import packagename.* we can accessible all the classes in the the mypackage

public class Vehicle {     // taking class name as vehicle 
	
	public static void main (String []args){   // and the main method
		
		
		System.out.println("the class vechile is called  in different package");
		
		
		Car car=new Car();   // here i creating the object for Car in two method as speed and model
            car.speed();
            car.model();
		}

}
