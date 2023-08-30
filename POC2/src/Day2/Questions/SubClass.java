package Day2.Questions;

public class SubClass {
	private int choice;
	
	public SubClass(int choice) {
		this.choice=choice;
	}
	
	public void start() {
		switch(choice) {
		case 1:
			E1Square e1s = new E1Square();
			e1s.draw();
			break;
		case 2:
			E1Circle e1c = new E1Circle();
			e1c.draw();
			break;
		case 3:
			E1Hexagon e1h = new E1Hexagon();
			e1h.draw();
			break;
		}
		
	}
}
