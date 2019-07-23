package TypeCastingProgram;

public class Rectangle extends Shape {
	int len, bred;
	int Area;

	//method 
	
	public Rectangle(int len,int bred) {
		this.bred=bred;
		this.len=len;
		
	}
	

	@Override
	public void calArea() {
		Area=2*(len+bred);
		System.out.println("Rectangle area:"+Area);
		
	}

}
