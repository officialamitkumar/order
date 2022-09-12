package com.orders.Service;

import com.orders.Entity.Orders;

import java.util.List;

public interface IOrderService {
    public List<Orders> getAllOrderItems();

   // public Orders addToCart(Cart cartItem);

    public List<Orders> updateStatusByOrderId(Long orderId);

    public List<Orders> searchByOrderId(Long orderId);

    public List<Orders> deleteByOrderId(Long orderId);
}
