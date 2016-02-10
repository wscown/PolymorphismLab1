/**
 * Created by wscown on 2/7/16.
 */
import java.util.ArrayList;
import java.util.Scanner;

class Pet{
    private String type;
    private String name;

    Pet(String type, String name){
        this.type = type;
        this.name = name;
    }

    Pet(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "Mleuh!";
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class Dog extends Pet{
    Dog(String name){
        super("Dog", name);
    }

    Dog(){}

    public String speak(){
        return "Bark!";
    }
}

class Snake extends Pet{
    Snake(String name){
        super("Snake", name);
    }

    Snake(){}

    public String speak(){
        return "Hiss!";
    }
}

class Bird extends Pet{
    Bird(String name){
        super("Bird", name);
    }

    Bird(){}

    public String speak(){
        return "Tweet!";
    }
}

class Cat extends Pet{
    Cat(String name){
        super("Cat", name);
    }

    Cat(){}

    public String speak(){
        return "Meow!";
    }
}


public class PetHolder {

    private ArrayList<Pet> pets;

    PetHolder(){
        pets = new ArrayList<>();
        userinterface();
    }

    public static void main(String[] args) {
        PetHolder petHolder = new PetHolder();
    }

    public void userinterface(){
        Scanner sc = new Scanner(System.in);
        int entries;
        String type;
        String name;

        System.out.println("Welcome to the pet storage program. How many pets do you have?");

        entries = sc.nextInt();

        System.out.println("You have elected to enter " + entries + " pets.");

        for(int i = 0; i < entries; i++){
            System.out.println("Please enter the type of pet, hit return, then enter the pet name and hit return");
            type = sc.next();
            name = sc.next();

            switch (type){
                case "dog": pets.add(new Dog(name));
                    break;
                case "cat": pets.add(new Cat(name));
                    break;
                case "snake": pets.add(new Snake(name));
                    break;
                case "bird": pets.add(new Bird(name));
                    break;
                default: pets.add(new Pet(type, name));
            }
        }

        System.out.println("\nThe following pets were entered into the database:");

        for(int i = 0; i < entries; i++){
            System.out.println(pets.get(i) + " " +  pets.get(i).speak());
        }
    }
}
