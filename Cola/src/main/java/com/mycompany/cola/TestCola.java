package com.mycompany.cola;
import java.util.Scanner;
public class TestCola {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int capacidad, opcion, elemento;
        
        System.out.println("Capacidad de la cola: ");
        capacidad = s.nextInt();
        
        Cola cola = new Cola(capacidad);
        
        do{
            System.out.println("\n1. Encolar\n2. Desencolar\n3. Obtener frente\n4. Mostrar\n5. Salir");
            opcion =s.nextInt();
            switch(opcion){
                case 1: System.out.println("Elemento: ");
                        elemento = s.nextInt();
                        cola.encolar(elemento);
                        break;
                case 2: cola.desencolar();
                        break;
                case 3: cola.obtenerFrente();
                        break;
                case 4: cola.mostrar();
                        break;
                case 5: System.out.println("Finalizando...");
                        break;
                default: System.out.println("Opcion invalida.");
                        break;
            }
        }while(opcion != 5);
    }
    
}
