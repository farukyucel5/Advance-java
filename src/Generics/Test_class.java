package Generics;

public class Test_class {
    public static void main(String[] args) {
        Gen1<String> list1=new Gen1<>();

        list1.add("Ankara");
        list1.add("Istanbul");

        Gen1<Integer> list2=new Gen1<>();//olusturduğumuz generic sınıfın integer ile çalısmasını istediğim
        //için sadece integer eklerim yukarıda ise string dediğim için sadece strin ekleyebilirim.
        list2.add(1);
        list2.add(2);


    }
}
