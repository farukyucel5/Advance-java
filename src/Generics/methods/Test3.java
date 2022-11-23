package Generics.methods;

import Generics.repository.Customer;
import Generics.repository.Product;

public class Test3 {

    public static void main(String[] args) {
        Validator validate1=new Validator();
        Customer  customer=new Customer();
        Product  product=new Product();

        validate1.validate(product);
        validate1.validate(customer);


    }
}
