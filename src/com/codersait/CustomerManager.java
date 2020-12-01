package com.codersait;

public class CustomerManager {
    private ICustomerDao customerDao;

    public CustomerManager(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void add() {
        // is kurallari gectiyse veri erisimini cagir.
        customerDao.add();
    }
}
