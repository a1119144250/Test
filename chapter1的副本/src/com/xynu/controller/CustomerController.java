package com.xynu.controller;

import com.xynu.service.CustomerService;

public class CustomerController {

    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void insertC() {
        this.customerService.insert();
    }

    public void selectC() {
        this.customerService.select();
    }

    public void editC() {
        this.customerService.edit();
    }
    public void deleteC() {
        this.customerService.delete();
    }
}
