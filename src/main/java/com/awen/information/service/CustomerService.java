package com.awen.information.service;

import com.awen.information.helper.DatabaseHelper;
import com.awen.information.model.Customer;
import com.awen.information.utils.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.NamingEnumeration;
import java.sql.*;
import java.util.*;

/**
 * Provide customer data service
 * Created by llw on 2017/3/30.
 */
public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * Get customer list
     */


    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * Get customer
     *
     * @param id
     */
    public Customer getCustomer(long id) {
        return null;
    }

    /**
     * Create customer
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * Update customer
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * Delete customer
     */
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }


}
