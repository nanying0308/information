package com.awen.information.dao;

import com.awen.information.domain.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ICustomerDao {
    void deleteByPrimaryKey(Long id);

    int insert(Customer customer);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Customer record);//只更新某一字段

    int updateByPrimaryKeyWithBLOBs(Customer record);

    void updateByPrimaryKey(Customer customer);


    List<Customer> selectAll();

}