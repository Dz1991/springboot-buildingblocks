package com.stacksimplify.restservices.conrollers;

import com.stacksimplify.restservices.entities.Order;
import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.exceptions.OrderNotFoundException;
import com.stacksimplify.restservices.exceptions.UserNotFoundException;
import com.stacksimplify.restservices.repositories.OrderRepository;
import com.stacksimplify.restservices.repositories.UserRepository;
import com.stacksimplify.restservices.services.OrderService;
import com.stacksimplify.restservices.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class OrderController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderService orderService;


    @GetMapping("/{userid}/orders")
    public List<Order> getAllOrders(@PathVariable(name = "userid") Long userid) throws UserNotFoundException {
        return orderService.getAllOrders(userid);
    }

    @GetMapping("/{userid}/orders/{orderid}")
    public Order getOrderByOrderId(@PathVariable(name = "userid") Long userid, @PathVariable(name = "orderid") Long orderid) throws OrderNotFoundException, UserNotFoundException {
        return orderService.getOrderByOrderId(userid, orderid);
    }

    @PostMapping("{userid}/orders")
    public Order createOrder(@PathVariable(name = "userid") Long userid, @RequestBody Order order) throws UserNotFoundException {
        return orderService.createOrder(userid, order);
    }
}
