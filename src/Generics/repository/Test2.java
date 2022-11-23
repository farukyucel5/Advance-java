package Generics.repository;

public class Test2 {
    public static void main(String[] args) {
        Customer_Dal scan =new Customer_Dal();
        scan.add(new Customer());//nesnenin içine sadece customer cinsi nesneleri ekler.
        scan.delete(new Customer());

        Product_Dal scan1=new Product_Dal();

        scan1.add(new Product());//nesnenin içine sadece product cinsi nesneleri ekler.
        scan1.delete(new Product());
    }


}
