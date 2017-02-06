package shape;

public class Shape {
	
	private int shapeId;
	
	public Shape(int shapeId){
		this.shapeId = shapeId;
	}
	
	public void set_shapeId(int shapeId){
		this.shapeId = shapeId;
	}
	
	public int get_shapeId(){
		return shapeId;
	}

	public double area(){
		//double a;
		System.out.println("I am the area method of the parent class");
		return 1;
	}
	
	public double perimeter(){
		//double p;
		//System.out.println("I am the area method of the parent class");
		return 0;
	}
}
