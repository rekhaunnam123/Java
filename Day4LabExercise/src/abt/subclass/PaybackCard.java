package abt.subclass;

import abt.entry.Card;

public class PaybackCard extends Card {
	int pointsEarned;
	double totalAmount;
	public PaybackCard(String holderName, String cardNumber, String expiryDate,int pointsEarned,double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned=pointsEarned;
		this.totalAmount=totalAmount;
		// TODO Auto-generated constructor stub
	}
	
	public int getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


}
