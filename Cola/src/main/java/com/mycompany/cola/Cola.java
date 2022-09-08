package com.mycompany.cola;
public class Cola {
    private int capacidad;
    private int fin;
    private int vector[];
    
    public Cola(int capacidad){
        this.capacidad = capacidad;
        vector = new int[capacidad];
        fin = -1;
    }
    
    public boolean esVacia(){
        if(fin == -1)
            return true;
        else
            return false;
    }
    
    public boolean esLlena(){
        if(fin == capacidad-1)
            return true;
        else
            return false;
    }
    
    public void encolar(int elemento){
        if(!esLlena()){
            fin ++;
            vector[fin]=elemento;
        }
        else
            System.out.println("Cola llena.");
    }
    
    public void desencolar(){
        if(!esVacia()){
            for(int i=1; i<=fin; i++){
                vector[i-1]= vector[i];
            }
            fin--;
        }
        else
            System.out.println("Cola vacia.");
    }
    
    public void obtenerFrente(){
        if(!esVacia())
            System.out.println("Elemento del frente es: "+vector[0]);
        else
            System.out.println("Cola vacia.");
    }
    
    public void mostrar(){
        if(!esVacia()){
            System.out.println("--------- COLA ---------");
            for(int i=0; i<=fin; i++)
                System.out.print(vector[i]+" - ");
        }
        else
            System.out.println("Cola vacia.");
    }
}