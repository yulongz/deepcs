package visitorpattern.demo;

public class Keyboard implements ComputerPart{

	public void accept(ComputerPartVisitor computerPartVisitor) {
		// TODO Auto-generated method stub
	      computerPartVisitor.visit(this);
	}

}
