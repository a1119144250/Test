package com.xynu.service;

import com.xynu.dao.CustomerDao;

public class CustomerServiceImpl implements CustomerService{

    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }


    public void insert() {
        this.customerDao.insertCust();
    }


    public void select() {
        this.customerDao.selectCust();
    }


    public void edit() {
        this.customerDao.editCust();
    }


    public void delete() {
        this.customerDao.deleteCust();
    }
}
