package shape;

public class Circle extends Shape{
	private double r;
	
	
	public Circle(int id, double r){
		super(id);
		this.r = r;
	}
	
	public Circle(double r){
		super(0);
		this.r = r;
	}
	
	public void set_r(double r){
		this.r = r;
	}
	
	public double get_r(){
		return r;
	}
	
	public double area(){
		System.out.println("The area of the Circle is: ");
		return (3.14 * r*r);
	}
	
	public double perimeter(){
		System.out.println("The perimeter of the Circle is: ");
		return 2*3.14*r;
	}

}
