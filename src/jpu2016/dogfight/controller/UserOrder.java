package jpu2016.dogfight.controller;


public class UserOrder implements IUserOrder {

	private int player;
	private Order order;
	
	public UserOrder( int player,Order order) {
		this.player = player;
		this.order = order;
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPlayer() {
		// TODO Auto-generated method stub
		return 1;
	}
	
}
