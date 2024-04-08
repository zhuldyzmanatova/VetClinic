import java.util.ArrayList;
import java.util.List;

class Pair<T, U> {
    private T name;
    private U age;

    private String text;

    public Pair(T name, U age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {

        return name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getAge() {
        return age;
    }

    public void setAge(U age) {
        this.age = age;
    }
}

class Box<T extends Cat> {
    private T guest;

    public Box(T guest) {
        this.guest = guest;
    }

    public void SaySmth() {
        guest.voice();
    }

    public T getGuest() {
        return guest;
    }

    public void setGuest(T guest) {
        this.guest = guest;
    }
}

class GenericArray<T> {
    List<T> list;

    public GenericArray(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }
}


public class Main {
    // public static void main(String[] args) {
    //     Pair<Integer, String> pair = new Pair<>(6, "name");
    //     pair.setText("java is a programming language");
    //     System.out.println(pair.getAge());
    //     System.out.println(pair.getName());
    //     Box<HouseCat> cat = new Box<>(new HouseCat());
    //     cat.SaySmth();
    //     GenericArray<HouseCat> genericArray = new HouseCat()<>(new ArrayList<>(List.of("hello", "world")));
    //     System.out.println(genericArray.getList());
    // }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Murzik");
        Dog dog1 = new Dog("Sharik");
        Dog dog2 = new Dog("Bobik");

        List <Animal> animalList = new ArrayList<>(List.of(cat1, cat2, dog1, dog2));

        VetClinic <Animal> clinic = new VetClinic<>(animalList);

        clinic.healAnimal(0);
        clinic.checkAnimal(0);
        System.out.println(clinic.getAnimal(0).getName()); 


    }
}
