package com.qubanzhuan.service;

import com.qubanzhuan.bean.Order;
import com.qubanzhuan.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ning on 2017/11/13.
 */
@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public List<Order> getOrders(String machineCode) {
        return orderMapper.getOrders(machineCode);
    }
}
