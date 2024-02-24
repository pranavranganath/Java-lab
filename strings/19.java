

abstract class Bird {
 
    public abstract void fly();

    // Abstract method for making sound
    public abstract void makeSound();
}
d
class Eagle extends Bird {
    
   
    public void fly() {
        System.out.println("Eagle flies high in the sky.");
    }

   
    public void makeSound() {
        System.out.println("Eagle screeches loudly.");
    }
}


class Hawk extends Bird {
   
    public void fly() {
        System.out.println("Hawk soars gracefully through the air.");
    }

 
    public void makeSound() {
        System.out.println("Hawk emits a piercing cry.");
    }
}

// Main class
public class Animal{
    public static void main(String[] args) {
        // Creating instances of Eagle and Hawk
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();

       
        System.out.println("Eagle:");
        eagle.fly();
        eagle.makeSound();

     
        System.out.println("\nHawk:");
        hawk.fly();
        hawk.makeSound();
    }
}


