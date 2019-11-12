package edu.mum.cs544.ecommerce.ordersservice.repos;

import edu.mum.ea2.orders_service.entities.OrderItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrdersItemsRepo extends CrudRepository<OrderItemEntity, Integer> {

//	@Query("select x from OrderItemEntity x where x.order.id = :id")
//	List<OrderItemEntity> findAllByOrderId(int id);

}
