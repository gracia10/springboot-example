package com.rest.hateoas.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.hateoas.domain.Customer;
import com.rest.hateoas.domain.Order;

@Service
public class OrderServiceImpl implements OrderService{

    private HashMap<String, Customer> customerMap;
    private HashMap<String, Order> customerOneOrderMap;
    private HashMap<String, Order> customerTwoOrderMap;
    private HashMap<String, Order> customerThreeOrderMap;
	
	OrderServiceImpl(){

        customerOneOrderMap = new HashMap<>();
        customerTwoOrderMap = new HashMap<>();
        customerThreeOrderMap = new HashMap<>();

        customerOneOrderMap.put("001A", new Order("001A", 150.00, 25));
        customerOneOrderMap.put("002A", new Order("002A", 250.00, 15));
        customerTwoOrderMap.put("002B", new Order("002B", 550.00, 325));
        customerTwoOrderMap.put("002B", new Order("002B", 450.00, 525));
        
        final Customer customerOne = new Customer("10A", "Jane", "ABC Company");
        final Customer customerTwo = new Customer("20B", "Bob", "XYZ Company");
        final Customer customerThree = new Customer("30C", "Tim", "CKV Company");

        customerOne.setOrders(customerOneOrderMap);
        customerTwo.setOrders(customerTwoOrderMap);
        customerThree.setOrders(customerThreeOrderMap);
        
        customerMap = new HashMap<>();
        customerMap.put("10A", customerOne);
        customerMap.put("20B", customerTwo);
        customerMap.put("30C", customerThree);
	}
	
	
	@Override
    public List<Order> getAllOrdersForCustomer(final String customerId) {
        return new ArrayList<Order>(customerMap.get(customerId).getOrders().values());
    }

    @Override
    public Order getOrderByIdForCustomer(final String customerId, final String orderId) {
        return customerMap.get(customerId).getOrders().get(orderId);
    }
	

}
