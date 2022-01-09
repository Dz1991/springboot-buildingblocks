package com.stacksimplify.restservices.services;

import com.stacksimplify.restservices.entities.Order;
import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.exceptions.OrderNotFoundException;
import com.stacksimplify.restservices.exceptions.UserNotFoundException;
import com.stacksimplify.restservices.repositories.OrderRepository;
import com.stacksimplify.restservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    private User isUseridPresent(Long userid) throws UserNotFoundException {
        Optional<User> userOptional = userRepository.findById(userid);
        if(!userOptional.isPresent())
            throw new UserNotFoundException("User Not Found");
        return userOptional.get();
    }

    public List<Order> getAllOrders(Long userid) throws UserNotFoundException {
        User user = isUseridPresent(userid);
        return user.getOrders();
    }

    public Order getOrderByOrderId(Long userid, Long orderid) throws UserNotFoundException, OrderNotFoundException {
        User user = isUseridPresent(userid);
        Optional<Order> optionalOrder = user.
                getOrders().
                stream().
                filter(order -> orderid.equals(order.getOrderid())).
                findAny();
        if(!optionalOrder.isPresent())
            throw new OrderNotFoundException("Order id not Found");
        return optionalOrder.get();
    }

    public Order createOrder(Long userid, Order order) throws UserNotFoundException {
        User user = isUseridPresent(userid);
        order.setUser(user);
        return orderRepository.save(order);
    }


}
