package com.utad.inso.tema2.entregas.patronTemplate.ejercicio40;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salirDeMenu = 1;

        DoctorServiceStrategy doctor = new FongDoctorStrategy();

       /* do{
            System.out.println("\n============Bienvenido a secretaría de la Guardería!============");
            System.out.println("Día [15] Revisión de oculista.\nDía [28] Revisión de logopeda.\n    [0] Salir.");
            System.out.print("Por favor, elija el día que quiera realizar la revisión: ");

            switch(sc.nextInt()){
                case 15:
                    System.out.println("HA ELEGIDO: día 15, revisión oculista con el Dr.Wang.\n");
                    doctor.setContextStrategy(new Oculista());
                    doctor.actividadesConjuntas();
                break;
                case 28:
                    System.out.println("HA ELEGIDO: día 28, revisión oculista con el Dr.Fong.\n");
                    doctor.setContextStrategy(new Logopeda());
                    doctor.actividadesConjuntas();
                break;
                case 0:
                    System.out.println("Saliendo...");
                    salirDeMenu=0;
                break;
                default:
                    System.out.println("Elija una opción válida. Este día no se realizan revisiones.\n");
                break;
            }

        }while(salirDeMenu!=0);

        sc.close();*/
    } 
}
