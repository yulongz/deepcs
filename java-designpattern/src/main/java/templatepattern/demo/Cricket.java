package templatepattern.demo;

public class Cricket extends Game {

	@Override
	void initialize() {
		// TODO Auto-generated method stub
	      System.out.println("Cricket Game Finished!");
	}

	@Override
	void startPlay() {
		// TODO Auto-generated method stub
	      System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	void endPlay() {
		// TODO Auto-generated method stub
	      System.out.println("Cricket Game Started. Enjoy the game!");
	}

}
