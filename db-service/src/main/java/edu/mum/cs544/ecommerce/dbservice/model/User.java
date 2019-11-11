package edu.mum.cs544.ecommerce.dbservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
	private int id;

	private String firstName;
	private String lastName;
	private String email;

	// shipping address
	private String adrStreet;
	private String adrCity;
	private String adrState;
	private String adrZip;

	UserPaymentMethod paymentCreditCard;
	UserPaymentMethod paymentBankAccount;
	UserPaymentMethod paymentPayPal;

	String preferredPaymentMethod;

	public Payment getPaymentModel() {
		if (preferredPaymentMethod.equals("cc")) return paymentCreditCard.toPaymentModel();
		if (preferredPaymentMethod.equals("ba")) return paymentBankAccount.toPaymentModel();
		if (preferredPaymentMethod.equals("pp")) return paymentPayPal.toPaymentModel();

		return null;
	}
}
