package com.awen.information.service.impl;

import com.awen.information.dao.ICustomerDao;
import com.awen.information.domain.Customer;
import com.awen.information.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by llw on 2017/4/19.
 */
@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {
    @Resource
    private ICustomerDao customerDao;

    @Override
    public Customer getCustomerById(Long id) {
        return this.customerDao.selectByPrimaryKey(id);
    }

    @Override
    public List<Customer> getCustomerList() {
        return this.customerDao.selectAll();
    }

    @Override
    public int createCustomer(Customer customer) {
        return customerDao.insert(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerDao.deleteByPrimaryKey(id);
    }

    @Override
    public void editCusomer(Customer customer) {

       this.customerDao.updateByPrimaryKey(customer);

    }
}
