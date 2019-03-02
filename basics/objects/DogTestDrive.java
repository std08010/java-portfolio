/*******************************************************************************
 * Copyright (c) 2019 Cipitech, S.A. or its affiliates. All rights reserved.
 *
 * Contributors:
 *     Altin Cipi (haris.tsipis@gmail.com)
 *******************************************************************************/
package objects;

public class DogTestDrive {

    public static void main(String[] args) {
	
	// make an object of type "Dog" and name it "ragnar"
	Dog ragnar = new Dog(); 

	// use the dot operator to access the instance variable "size"
	// of our "ragnar" object which is of type "Dog" and set its value
	ragnar.size = 30;
	
	// call (aka invoke) the "bark" method as defined in class "Dog"
	// on our "ragnar" object
	ragnar.bark(); 
    }

}
