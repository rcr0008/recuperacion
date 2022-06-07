/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rodrirecu;

/**
 *
 * @author Usuario
 */
public class Comanda {
   int bebida; //1.Coca cola//2.Nestea//3.Fanta Limon//4.Fanta Naranja//
 String comida;
 int numcomanda;
    public Comanda(int b, String comida, int numcomanda){
        this.bebida = b ;
        this.comida = comida;
        this.numcomanda = numcomanda;
    

    }
    public String toString() {
        return "Comanda " + "Comida: " + this.comida +" Bebida: "+ this.bebida + "\n" ;
    }
    
    
} 

