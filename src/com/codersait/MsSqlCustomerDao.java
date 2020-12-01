package com.codersait;

public class MsSqlCustomerDao implements ICustomerDao{
    @Override
    public void add() {
        System.out.println("MsSql veritabanina eklendi");
    }
}
