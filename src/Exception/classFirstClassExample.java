package Exception;

class Person{
    String name;
    int age;
    int phonenumber;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }


}

public class classFirstClassExample {
    public static void main(String[] args) {
        Person aizhan = new Person("aizhan", 16);
        Person dana = new Person("dana", 19);
        Person sezim = new Person("sezim",  19);


        printObjectData(aizhan);
        printObjectData(dana);
        printObjectData(sezim);





    }

    public static void printObjectData(Person p){
        System.out.println(p.name);
        System.out.println(p.phonenumber);
        System.out.println(p.age);
    }

}
