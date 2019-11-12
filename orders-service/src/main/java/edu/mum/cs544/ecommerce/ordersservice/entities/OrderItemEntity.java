package edu.mum.cs544.ecommerce.ordersservice.entities;

import edu.mum.shared.models.OrderItem;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "OrdersItems")
public class OrderItemEntity {

	public OrderItemEntity() {
	}

	public OrderItemEntity(OrderItem model) {
		if (model == null) return;

		this.productId = model.getProductId();
		this.quantity = model.getQuantity();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	private OrderEntity order;

	private int productId;

	private int quantity;

	public OrderItem toOrderItemModel() {
		OrderItem model = new OrderItem();
		model.setProductId(this.productId);
		model.setQuantity(this.quantity);

		return model;
	}
}
