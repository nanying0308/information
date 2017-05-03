package com.awen.information.service;

import com.awen.information.domain.Customer;

import java.util.List;
import java.util.Map;

/**
 * Created by llw on 2017/4/19.
 */
public interface ICustomerService {
    public Customer getCustomerById(Long id);

    public List<Customer> getCustomerList();


    public int createCustomer(Customer customer);

    public void deleteCustomer(Long id);

    public void editCusomer(Customer customer);
}
