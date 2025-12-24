package core;

public class Card implements Payment {
	@Override
	public void pay() {
		System.out.println("Make payment through card.");
	}
}
