package visitorpattern.demo;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	public void visit(Computer computer) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Computer.");

	}

	public void visit(Mouse mouse) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Mouse.");

	}

	public void visit(Keyboard keyboard) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Keyboard.");

	}

	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Monitor.");

	}

}
