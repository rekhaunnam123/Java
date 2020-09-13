/*Create an abstract class named Card with the following protected attributes / member variables.
 String holderName;
 String cardNumber;
 String expiryDate;
 Include appropriate getters and setters.
 Include appropriate constructors. In the 3-argument constructor, the order of the arguments is holderName, cardNumber, expiryDate.
 Create a class named MembershipCard. The class MembershipCard is a derived class of Card. Include the following private attributes / member variables.
 Integer rating
 Include appropriate getters and setters.
 Include appropriate constructors. In the 4-argument constructor, the order of the arguments is holderName, cardNumber, expiryDate, rating.
 Create a class named PaybackCard. The class PaybackCard is a derived class of Card. Include the following private attributes / member variables.
 Integer pointsEarned;
 Double totalAmount;
 Include appropriate getters and setters.
 Include appropriate constructors. In the 5-argument constructor, the order of the arguments is holderName, cardNumber, expiryDate, pointsEarned, totalAmount.
 Create another class called Main. In the method, create instances of the above classes and test the above classes. The card details are entered separated by a ‘|’.
*/

package abt.main;

import java.util.Scanner;

import abt.subclass.MembershipCard;
import abt.subclass.PaybackCard;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the choice to select ");
		int number=scanner.nextInt();
		switch(number)
		{
		case 1:
			PaybackCard membership=new PaybackCard("Anandhi" ,"12345","14/01/2020",100,20000.00);
			System.out.println("Enter points");
			int points=scanner.nextInt();
			membership.setPointsEarned(points);
			System.out.println("Enter total amount");
			double amount=scanner.nextDouble();
			membership.setTotalAmount(amount);
			System.out.println("Points Earned ="+membership.getPointsEarned());
			System.out.println("Total Amount ="+membership.getTotalAmount());
			break;
		case 2:
			MembershipCard card=new MembershipCard("sumathi","12367","17/05/2021",67);
			String holdername=scanner.nextLine();
			System.out.println("Enter rating");
			int rating=scanner.nextInt();
			card.setRating(rating);
			System.out.println("Enter details");
			System.out.println("Rating= "+card.getRating());
			break;
		default:
			System.out.println("no holder found");
		}

	}
	

}
