package com.awen.information.dao.impl;

import com.awen.information.dao.ICustomerDao;
import com.awen.information.domain.Customer;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by llw on 2017/4/19.
 */
@Repository
public class CustomerDaoImpl implements ICustomerDao {
    @Autowired
    private SqlSession sqlSession;


    @Override
    public void deleteByPrimaryKey(Long id) {

        this.sqlSession.delete("com.awen.information.dao.CustomerMapper.deleteByPrimaryKey",id);
    }

    @Override
    public int insert(Customer customer) {
        return this.sqlSession.insert("com.awen.information.dao.CustomerMapper.insert",customer);
    }

    @Override
    public int insertSelective(Customer record) {
        return 0;
    }

    @Override
    public Customer selectByPrimaryKey(Long id) {
        return this.sqlSession.selectOne("com.awen.information.dao.CustomerMapper.selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Customer record) {
        return 0;
    }

    @Override
    public void updateByPrimaryKey(Customer customer) {
        this.sqlSession.update("com.awen.information.dao.CustomerMapper.updateByPrimaryKeyWithBLOBs",customer);
    }

    @Override
    public List<Customer> selectAll() {
        return this.sqlSession.selectList("com.awen.information.dao.CustomerMapper.selectAll");
    }
}
