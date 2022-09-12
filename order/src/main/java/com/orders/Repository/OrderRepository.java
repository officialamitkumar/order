package com.orders.Repository;

import com.orders.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders,Long> {

    public List<Orders> findAllByOrderId(Long orderId);
    public void deleteByOrderId(Long orderId);
}
