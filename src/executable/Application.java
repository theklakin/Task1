package executable;

import java.util.Scanner;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Triangle;


public class Application {

	public static void main(String[] args) {
		
		
		/////Part4/////
		while (true) {
			Shape pointer = null;
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("What kind of shape do you want?");
			String s = reader.nextLine();
			System.out.println(s);
			if (s.equals("Rectangle")){
				pointer = new Rectangle(1.5,2.5);
				System.out.println(pointer.area());
				System.out.println(pointer.perimeter());
			} 
			else if (s.equals("Triangle")){
				pointer = new Triangle(1.0,2.5,3.5,4.0);
				System.out.println(pointer.area());
				System.out.println(pointer.perimeter());
			}
			else if (s.equals("Circle")){
				pointer = new Circle(1.5);
				System.out.println(pointer.area());
				System.out.println(pointer.perimeter());
			}
			else 
				System.out.println("Wrong input. Try again!");

		}
		
		///////Part3/////////////
		///Shape pointer = null;
		//pointer = new Rectangle(1.5,2.5);
		//System.out.println(pointer.area());
		//System.out.println(pointer.perimeter());
		
		//pointer = new Triangle(1.0,2.5,3.5,4.0);
		//System.out.println(pointer.area());
		//System.out.println(pointer.perimeter());
		
		//pointer = new Circle(1.5);
		//System.out.println(pointer.area());
		//System.out.println(pointer.perimeter());

	}

}
