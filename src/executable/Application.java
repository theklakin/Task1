package executable;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Triangle;


public class Application {

	public static void main(String[] args) {
		Shape s = new Shape(0);
		Rectangle r = new Rectangle(2.5,3.5);
		Triangle t = new Triangle(1.0,3.5,1.5,1.5);
		Circle c = new Circle(4.5);
		
		Rectangle r2 = new Rectangle(1,2.5,3.5);
		Triangle t2 = new Triangle(2,1.0,3.5,1.5,1.5);
		Circle c2 = new Circle(3,4.5);
		
		
		//superclass
		s.area();
		s.perimeter();
		
		//rectangle
		System.out.println(r.area());
		System.out.println(r.perimeter());
		
		//triangle
		System.out.println(t.area());
		System.out.println(t.perimeter());
		
		//circle
		System.out.println(c.area());
		System.out.println(c.perimeter());
		
		//////change results///////
		r.set_a(1.5);
		r.set_b(2.5);
		System.out.println(r.area());
		System.out.println(r.perimeter());
		
		t.set_b(4.5);
		t.set_h(2.0);
		System.out.println(t.area());
		System.out.println(t.perimeter());
		
		c.set_r(5.5);
		System.out.println(c.area());
		System.out.println(c.perimeter());
		
		//part2/////////////
		
		//rectangle
		System.out.println(r2.area());
		System.out.println(r2.perimeter());
		System.out.println(r2.get_shapeId());
		
		//triangle
		System.out.println(t2.area());
		System.out.println(t2.perimeter());
		System.out.println(t2.get_shapeId());

		
		//circle
		System.out.println(c2.area());
		System.out.println(c2.perimeter());
		System.out.println(c2.get_shapeId());
		
		r2.set_shapeId(4);
		System.out.println(r2.get_shapeId());

	}

}
