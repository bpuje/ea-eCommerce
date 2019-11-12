package edu.mum.cs544.ecommerce.ordersservice.repos;

import edu.mum.ea2.orders_service.entities.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepo extends CrudRepository<OrderEntity, Integer> {

	OrderEntity findById(int id);

}
