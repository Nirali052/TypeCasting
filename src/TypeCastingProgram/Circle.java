package TypeCastingProgram;

public class Circle extends Shape {

	
	 double pi=3.14;
	int r;
	double Area;
	@Override
	public void calArea() {
		Area=pi*r*r;
		System.out.println("Circle Area:"+Area);
		
	}
	public void display() {
		System.out.println("Circle display method call");
	}

}
