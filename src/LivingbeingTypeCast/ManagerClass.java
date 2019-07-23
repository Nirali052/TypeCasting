package LivingbeingTypeCast;

public class ManagerClass {
	
	public void mangeobject(Livingbeing lb) {
		
		
		if(lb instanceof Human) {
			((Human)lb).display();
			((Human)lb).Eatinghabit();
			
			
		}
		
	}

}
