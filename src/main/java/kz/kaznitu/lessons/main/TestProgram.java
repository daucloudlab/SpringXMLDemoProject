package kz.kaznitu.lessons.main;

import kz.kaznitu.lessons.beans.Animal;
import kz.kaznitu.lessons.beans.AnimalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProgram {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-context.xml") ;

        AnimalService animal = (AnimalService)context.getBean("animalService1") ;
        animal.getAnimal().printName();
        System.out.println(animal.getZoo().getZooName()) ;

    }
}
