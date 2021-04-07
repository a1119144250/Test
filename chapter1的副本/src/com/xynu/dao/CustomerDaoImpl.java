package com.xynu.dao;

public class CustomerDaoImpl implements CustomerDao {


    @Override
    public void insertCust() {
        System.out.println("插入！");
    }

    @Override
    public void selectCust() {
        System.out.println("查询！");
    }

    @Override
    public void editCust() {
        System.out.println("修改！");
    }

    @Override
    public void deleteCust() {
        System.out.println("删除！");
    }
}
