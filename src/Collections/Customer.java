package Collections;

public class Customer {
    int id;
    String name;
    String surname;


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Customer(int id, String name, String surname)
    {
        this.id=id;
        this.name=name;
        this.surname=surname;
    }
}
