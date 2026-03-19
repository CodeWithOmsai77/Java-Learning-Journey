package Introduction;

class Fresher {
    String name;
    int age;

    // Parameterized constructor
    Fresher(String n, int a){
        name = n;
        age = a;
    }
    void display() {
        System.out.println("name: "+name+".age: "+age);
    }
}
public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        Fresher f1 = new Fresher("omsai", 20);
        Fresher f2 = new Fresher("rahul", 19);
        Fresher f3 = new Fresher("om", 21);

        f1.display();
        f2.display();
        f3.display();

    }
}
