package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoDecorator;

public class KinderGardenDecoratorTest {
    public static void main(String[] args) {
        KinderGarden kinderGarden = new KinderGarden();
        Book book = new Book("Design patterns","Gang of four", BookSate.GOOD);

        KinderGardenBaby ines = new KinderGardenBaby("Inés",1);
        KinderGardenBaby kike = new KinderGardenBaby("Enrique","Kike",1);

        kinderGarden.getBabies().add(kike);
        kinderGarden.getBabies().add(ines);
        kinderGarden.checkBabies(); //pasamos lista

        //TODO Inés recibe el certificado de buena conducta

        kinderGarden.checkBabies(); //pasamos lista
        //TODO Inés vuelve a recibir el premio de la semana
        
        kinderGarden.checkBabies(); //pasamos lista
        //TODO Tiene Inés un libro por haber conseguido el premio de la semana?
        //muestra por consola el título del libro
    }
}
