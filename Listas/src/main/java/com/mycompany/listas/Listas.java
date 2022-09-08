package com.mycompany.listas;
public class Listas {
    private int capacidad;
    private int tamaño;
    private int vector[];
    
    public Listas(int capacidad){
        this.capacidad = capacidad;
        vector = new int[capacidad];
        tamaño = -1;
    }
    
    public boolean esVacia(){
        if(tamaño == -1)
            return true;        //else
        return false; 
    }
    
    public boolean esLlena(){
        if(tamaño == capacidad-1)
            return true;
        else
            return false;
    }
    
    public void insertarInicio(int elemento){
        if(!esLlena()){
            for(int i=tamaño; i>=0; i=i-1){
                vector[i+1]=vector[i];
            }
            vector[0]=elemento; 
            tamaño ++;
        }
        else
            System.out.println("Lista llena.");
    }
    
    public void insertarFinal(int elemento){
        if(!esLlena()){
            tamaño++;
            vector[tamaño]=elemento;
        }
        else
            System.out.println("Lista llena.");
    }
    
    public void eliminarInicio(){
        if(!esVacia()){
            for(int i=1; i<=tamaño; i++){
                vector[i-1]=vector[i];
            }
            tamaño--;
        }
        else
            System.out.println("Lista vacia.");
    }
    
    public void eliminarFinal(){
        if(!esVacia())
            tamaño--;
        else
            System.out.println("Lista vacia.");
    
    }
    
    public void mostrar(){
        if(!esVacia()){
            System.out.println("\n-----LISTA------");
            for(int i=0; i<=tamaño; i++)
                System.out.print(vector[i]+" ");
        }
        else
            System.out.println("Lista vacia.");
    }
    
}
