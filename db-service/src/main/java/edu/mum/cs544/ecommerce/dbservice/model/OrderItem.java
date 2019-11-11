package edu.mum.cs544.ecommerce.dbservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {
	private int productId;
	private int quantity;
}
