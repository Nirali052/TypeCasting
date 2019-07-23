package TypeCastingProgram;

public class MainClass {
public static void main(String[] args) {
	Rectangle rec1 = new Rectangle(12, 13);
	Rectangle rec2 = new Rectangle(12, 13);
	
	if(rec1.equals(rec2)){
	System.out.println("Objects are equal");
	}else{
	System.out.println("Objects are not equal");
	}
	
	/*
	Shape s = new Rectangle(10,10);
	((Circle)s).display();
	
	*/
	
	
}
}
