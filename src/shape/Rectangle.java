package shape;

public class Rectangle extends Shape{
	private double a;
	private double b;
	
	public Rectangle(int id, double a, double b){
		super(id);
		this.a = a;
		this.b = b;
	}
	
	public Rectangle(double a, double b){
		super(0);
		this.a = a;
		this.b = b;
	}
	
	public void set_a(double a){
		this.a = a;
	}
	
	public void set_b(double b){
		this.b = b;
	}
	
	public double get_a(){
		return a;
	}
	
	public double get_b(){
		return b;
	}
	
	public double area(){
		System.out.println("The area of the Rectangular is: ");
		return a*b;
	}
	
	public double perimeter(){
		System.out.println("The perimeter of the Rectangular is: ");
		return 2*(a+b);
	}

}
