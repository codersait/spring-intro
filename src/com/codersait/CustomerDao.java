package com.codersait;

public class CustomerDao implements ICustomerDao{
    @Override
    public void add() {
        System.out.println("Oracle veri tabanina eklendi");
    }

//    public void add(int type) {
//        if (type==1){
//            System.out.println("oracle veritabanina eklendi");
//        } else{
//            System.out.println("mysql veritabanina eklendi");
//        }
//
//    }

}
