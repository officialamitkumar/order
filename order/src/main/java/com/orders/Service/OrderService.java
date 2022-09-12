package com.orders.Service;

import com.orders.Entity.Orders;
import com.orders.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderService implements IOrderService {

    @Autowired
    OrderRepository OrderRepo;

    @Override
    public List<Orders> getAllOrderItems() {
        return OrderRepo.findAll();
    }

    @Override
    public List<Orders> updateStatusByOrderId(Long orderId) {
        return null;
    }

    @Override
    public List<Orders> searchByOrderId(Long orderId) {
        return OrderRepo.findAllByOrderId(orderId);
    }

    @Override
    public List<Orders> deleteByOrderId(Long orderId){
        OrderRepo.deleteByOrderId(orderId);
        return OrderRepo.findAll();
        }

    }
