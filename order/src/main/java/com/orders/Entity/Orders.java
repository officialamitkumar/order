package com.orders.Entity;

import org.hibernate.mapping.Value;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long orderId;
    private Long amount;
    private String status;
    private  Long CustomerId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long customerId) {
        CustomerId = customerId;
    }

    public Orders() {
    }

    public Orders(Long orderId, Long amount, String status, Long customerId) {
        this.orderId = orderId;
        this.amount = amount;
        this.status = status;
        CustomerId = customerId;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", CustomerId=" + CustomerId +
                '}';
    }
}
