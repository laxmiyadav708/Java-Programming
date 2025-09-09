class Dog {
    String name;
    Dog(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Dog's name is: " + name);
    }
}

public class DogArrayExample {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog("tommy");
        dogs[1] = new Dog("blacky");
        dogs[2] = new Dog("Rocky");
        dogs[3] = new Dog("kallo");
        dogs[4] = new Dog("sheru"); 

       
        for (Dog d : dogs) {
            d.display();
        }
    }
}
