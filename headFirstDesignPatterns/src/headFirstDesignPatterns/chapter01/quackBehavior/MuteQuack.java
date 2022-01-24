package headFirstDesignPatterns.chapter01.quackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<<silence>>");
		
	}

}
