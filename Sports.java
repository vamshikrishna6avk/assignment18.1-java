package arrayListIterator;//created package as arrayListIterator
/*
 * Creating an object of ArrayList and adding 5 String elements inside ArrayList object.
 * Iterate the elements using an Iterator
 */
/**iterator is java cursor used to iterate a collection of objects.
 * it is used to traverse a collection of object elements one by one
 *  displaying each element,the easiest way is to employ an iterator
 */


import java.util.ArrayList;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
import java.util.Iterator;//iterator is an interface in collection framework in java.util package

public class Sports { // Creating Class as Sports
	                   //classes are the basics of oops(objected oriented programming langague)

	public static void main(String[] args) { // Main method
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter

		// Creating ArrayList Object
		ArrayList<String> sportname = new ArrayList<String>();

		// Adding elements into the array list
		sportname.add("Hockey");//adding 5 sportname
		sportname.add("Cricket");
		sportname.add("Football");
		sportname.add("Golf");
		sportname.add("Tennis");


		/**Creating iterator object using iterator method() which Returns an iterator over 
		   the elements in this list in proper sequence.
         **/
		 Iterator<String> iterate = sportname.iterator();
		
		 // Looping Array List using Iterator
		while (iterate.hasNext()){ //hasNext() method returns true if iterator have more elements.
								
      //next() method returns the next element and also moves cursor pointer to the next element.
			String sport=(String)iterate.next();
			if(sport.equals("Golf")){//if is used to decides whether this statement will executes or not
				iterate.remove();//removing
				System.out.println("Golf is removed");//system is used to return code
		        //out is a static member
			  	//Println is used to print text  and gives output
				//golf is removed and it prints this statement
			}
			
		System.out.println(sport);//system is used to return code
        //out is a static member
	  	//Println is used to print text  and gives output 

	}
}
}