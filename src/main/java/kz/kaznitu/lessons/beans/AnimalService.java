package kz.kaznitu.lessons.beans;


public class AnimalService {
    private Animal animal ;
    private Zoo zoo ;


    public AnimalService() {
    }

    public AnimalService(Animal animal, Zoo zoo) {
        this.animal = animal;
        this.zoo = zoo;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Zoo getZoo() {
        return zoo;
    }
}
