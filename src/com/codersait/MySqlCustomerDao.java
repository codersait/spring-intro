package com.codersait;

public class MySqlCustomerDao implements ICustomerDao {

    @Override
    public void add() {
        System.out.println("MySql veri tabanina eklendi");
    }
}
