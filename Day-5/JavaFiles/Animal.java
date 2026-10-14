import java.util.*;
class Animal {
    void sound(){
        System.out.println("Animals sound");
    }
    
}
class Dog extends Animal {
     void sound(){
        System.out.println("Bark");
     }
}
class Cat extends Animal {
    void sound(){
        System.out.println("Meow");
    }
}