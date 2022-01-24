package headFirstDesignPatterns.chapter01.cliente;

import headFirstDesignPatterns.chapter01.flyBehavior.FlyBehavior;
import headFirstDesignPatterns.chapter01.quackBehavior.QuackBehavior;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
		// TODO Auto-generated constructor stub
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
