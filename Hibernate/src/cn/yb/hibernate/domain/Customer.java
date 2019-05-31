package cn.yb.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

public class Customer {
    private Integer id;
    private String name;//客户名称

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    //一对多，一个客户有多个订单
    private Set<Order> orders = new HashSet<Order>();
}
