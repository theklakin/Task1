package shape;

public class Triangle extends Shape{
	private double h;
	private double b;
	private double s1;
	private double s2;
	
	public Triangle(int id, double h, double b, double s1, double s2){
		super(id);
		this.h = h;
		this.b = b;
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public Triangle(double h, double b, double s1, double s2){
		super(0);
		this.h = h;
		this.b = b;
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void set_h(double h){
		this.h = h;
	}
	
	public void set_b(double b){
		this.b = b;
	}
	
	public void set_s1(double s1){
		this.s1 = s1;
	}
	
	public void set_s2(double s2){
		this.s2 = s2;
	}
	
	public double get_h(){
		return h;
	}
	
	public double get_b(){
		return b;
	}
	
	public double get_s1(){
		return s1;
	}
	
	public double get_s2(){
		return s2;
	}
	
	public double area(){
		System.out.println("The area of the Triangle is: ");
		return (b*h)/2;
	}
	
	public double perimeter(){
		System.out.println("The perimeter of the Triangle is: ");
		return (s1+s2+b);
	}

}
