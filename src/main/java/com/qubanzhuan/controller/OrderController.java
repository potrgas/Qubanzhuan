package com.qubanzhuan.controller;

import com.qubanzhuan.bean.Order;
import com.qubanzhuan.service.OrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 订单管理
 * Created by ning on 2017/11/13.
 */
@Controller
public class OrderController {
    private Logger logger = Logger.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    @RequestMapping("/getOrders")
    @ResponseBody
    public List<Order> getOrders(@RequestParam(value = "machineCode", required = false, defaultValue = "%") String machineCode) {

        try {
            List<Order> orders = orderService.getOrders(machineCode);
            return orders;
        } catch (Exception e) {
            logger.error("错误信息： " + e.getMessage());
        }


        return null;
    }
}
