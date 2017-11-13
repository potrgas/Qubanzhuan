package com.qubanzhuan.mapper;

import com.qubanzhuan.bean.Order;

import java.util.List;

/**
 * Created by ning on 2017/11/13.
 */
public interface OrderMapper {

    public List<Order> getOrders(String machineCode);
}
