package com.awen.information.controller;

import com.awen.information.domain.Customer;
import com.awen.information.service.ICustomerService;
import com.awen.information.service.impl.CustomerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by llw on 2017/4/19.
 */
@Controller
public class CustomerController {
    private static Logger logger = LoggerFactory.getLogger(CustomerController.class);
    @Resource
    private ICustomerService customerService;

    /**
     * 查询客户
     *
     *
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "/customer_search", method = RequestMethod.GET)
    public String search(HttpServletRequest request, Model model) {
        Long id = Long.valueOf(request.getParameter("id"));
        logger.info("获取查询客户id，id:" + id);
        Customer customer = this.customerService.getCustomerById(id);
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(customer);
        model.addAttribute("customerList", customerList);
        return "customer";
    }

    /**
     * 查询客户列表
     *
     * @return
     */
    @RequestMapping(value = "/customer_list", method = RequestMethod.GET)
    public ModelAndView searchList() {
        List<Customer> customerList = customerService.getCustomerList();
        return new ModelAndView("customer").addObject("customerList", customerList);
    }

    /**
     * 进入创建客户页面
     *
     * @return
     */
    @RequestMapping(value = "/customer_create", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("customer_create");
    }

    /**
     * 创建客户
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView insertSubmit(Customer customer) {
        customerService.createCustomer(customer);
        logger.info("获取客户信息，customer:" + customer);
        return this.searchList();
    }

    /**
     * 删除客户
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/customer_delete", method = RequestMethod.GET)
    public ModelAndView delete(Long id) {
        customerService.deleteCustomer(id);
        logger.info("被删除客户ID，id:" + id);
        return this.searchList();
    }

    /**
     * 进入客户编辑页面
     *
     * @param request
     * @return
     */

    @RequestMapping(value = "/customer_edit", method = RequestMethod.GET)
    public void edit(HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        logger.info("获取客户id，id:" + id);
        Customer customer = this.customerService.getCustomerById(id);
        request.setAttribute("customer", customer);
    }

    /**
     * 编辑确认
     * @param customer
     * @return
     */
    @RequestMapping(value = "customer_edit", method = RequestMethod.POST)
    public ModelAndView editSubmit(Customer customer) {
        this.customerService.editCusomer(customer);
        logger.info("获取客户信息，customer:" + customer);
        return this.searchList();
    }

}


