import java.util.Scanner;
public class TestPila {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int capacidad, opcion, e;
        
        System.out.println("Capacidad de la pila: ");
        capacidad = s.nextInt();
        
        Pila miPila = new Pila(capacidad);
        
        do{
            System.out.println("1. Apilar\n2. Desapilar\n3. Mostrar\n4. Obtener cima\n5. Salir");
            opcion = s.nextInt();
            switch(opcion){
                case 1: System.out.println("Elemento: ");
                        e = s.nextInt();
                        miPila.apilar(e);
                        break;
                case 2: miPila.desapilar();
                        break;
                case 3: miPila.mostrar();
                        break;
                case 4: miPila.obtenerCima();
                        break;
                case 5: break;
                default: System.out.println("Opcion invalida");
                        break;
            }
        }while(opcion != 5);
    }
        
    
}
