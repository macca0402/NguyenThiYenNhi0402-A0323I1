package SS7_ABSTRACT_INTERFACE.TH.LopAnimal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : cuckoo cuckoooooo";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
