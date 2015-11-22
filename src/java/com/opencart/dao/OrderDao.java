/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.Order;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Aashish
 */
@Repository
public class OrderDao {
    
    public static ArrayList<Order> getAllOrders()
    {
        return new ArrayList<Order>();
    }
    
}
