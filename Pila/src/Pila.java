public class Pila {
       private int capacidad;
    private int cima;
    private int vector[];
    
    public Pila(int capacidad){
        this.capacidad = capacidad;
        vector = new int[capacidad];
        cima = -1;
    }
    
    public boolean esVacia(){
        if(cima == -1)
            return true;
        else
            return false;
    }
    
    public boolean esLlena(){
        if(cima == capacidad-1)
            return true;
        else 
            return false;
    }
    
    public void apilar(int elemento){
        if(!esLlena()){   // if(esLlena()== false)
            cima = cima+1;
            vector[cima]= elemento;
        }
        else
            System.out.println("Pila llena. ");
    }
    
    public void desapilar(){
        if(!esVacia())
            cima = cima-1;
        else
            System.out.println("Pila vacia.");
    }
    
    public void obtenerCima(){
        if(!esVacia())
            System.out.println("Cima: "+vector[cima]);
        else
            System.out.println("Pila vacia.");
    }
    
    public void mostrar(){
        if(!esVacia()){
            System.out.println("------- PILA --------");
            for(int i=cima; i>=0; i--)
                System.out.println(vector[i]);
        }
        else
           System.out.println("Pila vacia.");        
    } 
}
