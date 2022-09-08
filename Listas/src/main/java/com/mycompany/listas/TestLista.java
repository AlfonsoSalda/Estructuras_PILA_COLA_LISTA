package com.mycompany.listas;
public class TestLista {
    public static void main(String[] args) {
        Listas miLista = new Listas(10);
        
        miLista.insertarInicio(40);
        miLista.insertarInicio(30);
        miLista.insertarInicio(20);
        miLista.insertarInicio(10);
        miLista.insertarFinal(50);
        miLista.insertarFinal(60);
        miLista.mostrar();
        
        miLista.eliminarInicio();
        miLista.mostrar();
        
        miLista.eliminarFinal();
        miLista.mostrar();
    }
    
}
