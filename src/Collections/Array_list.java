package Collections;

import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        ArrayList sayılar=new ArrayList();

        sayılar.add(1);
        sayılar.add(4);
        sayılar.add("faruk");

        System.out.println(sayılar.size());

        System.out.println(sayılar.get(2));

        sayılar.set(1,"ismail");

        System.out.println(sayılar.get(1));

        System.out.println("----------------------------------");

        for(Object each:sayılar)
        {
            System.out.println(each);
        }
        System.out.println("----------------------------------");
        ArrayList<Customer> customers=new ArrayList<>();
        customers.add(new Customer(1,"Faruk","Yucel"));
        customers.add(new Customer(2,"Harun","Yucel"));
        customers.add(new Customer(3,"ismail","demir"));

      for(Customer each:customers)
      {
          System.out.println(each);
      }
        System.out.println("---------------------------------");

      for(Customer each:customers)
      {
          System.out.println(each.name);
      }
    }
}
