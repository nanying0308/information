package com.awen.information.test;

import com.awen.information.model.Customer;
import com.awen.information.service.CustomerService;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * CustomerService Unit testing
 * Created by llw on 2017/3/30.
 */

public class CustomerServiceTest {
    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void init() {

    }

//    @Test
//    public void getCustomerListTest() throws Exception {
//        List<Customer> customerList = customerService.getCustomerList();
//        Assert.assertEquals(2, customerList.size());
//    }

    @Test
    public void getCustomerTest() throws Exception {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception {
        Map<String, Object> filedMap = new HashMap<String, Object>();
        filedMap.put("name", "customer100");
        filedMap.put("contact", "John");
        filedMap.put("telephone", "15811435313");
        filedMap.put("email", "617117975@qq.com");
        filedMap.put("remark", "vip");
        boolean result = customerService.createCustomer(filedMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() throws Exception {
        long id = 1;
        Map<String, Object> filedMap = new HashMap<String, Object>();
        filedMap.put("contact", "Eric");
        boolean result = customerService.updateCustomer(id, filedMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception {
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}
