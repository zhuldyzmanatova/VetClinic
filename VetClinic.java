import java.util.List;

public class VetClinic <U extends Animal> {
    private List <U> animal;

    public VetClinic (List <U> animalList){
        animal = animalList;
    }

    public void healAnimal (int index){
        System.out.println("животное" + index + "было вылечено");
    }

    public void checkAnimal (int index){
        System.out.println("животное" + animal.get(index).getName() + "было осмотрено");
    }

    public U getAnimal (int index){
        return animal.get(index);
    }
}
