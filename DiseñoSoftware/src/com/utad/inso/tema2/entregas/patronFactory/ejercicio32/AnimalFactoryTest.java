package com.utad.inso.tema2.entregas.patronFactory.ejercicio32;

public class AnimalFactoryTest {
    public static void main(String[] args) {
        Integer maxAnimals = 100;
        Animal[] animals = new Animal[maxAnimals];
        AnimalFactory animalFactory = new RandomAnimalFactory();

        int countDogs=0;
        int countCats=0;

        for(int i=0; i< maxAnimals;i++){
            animals[i] = animalFactory.factoryAnimalMethod();
            if(animals[i] instanceof Cat){
               countCats++;
            }
            else if(animals[i] instanceof Dog){
               countDogs++;
            }
        }

        //TODO Impresión del número de Dogs y Cats y la proporción de cada uno
        //TODO proporcion
        System.out.println("Dogs (" + countDogs + "), Cats(" + countCats + ").");

        countCats = 0;
        countDogs = 0;
       
        AnimalFactory overCatsPopulatedAnimalFactory = new OverCatsPopulatedAnimalFactory();

        for(int i=0; i< maxAnimals;i++){
            animals[i] = overCatsPopulatedAnimalFactory.factoryAnimalMethod();
            
            if(animals[i] instanceof Cat){
                countCats++;
            }
            else if(animals[i] instanceof Dog){
                countDogs++;
            }
        }
        

        //TODO Impresión del número de Dogs y Cats y la proporción de cada uno
        System.out.println("Dogs (" + countDogs + "), Cats(" + countCats + ").");
    }
}
