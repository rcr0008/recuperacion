/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rodrirecu;

/**
 *
 * @author Usuario
 */
public class CarrilComanda {
    Comanda carril[] = new Comanda[10];
    int ncomandas;
    Comanda servidas[] = new Comanda[10];
    int servida = 0;
    int adelantada = 0;

    public CarrilComanda(int n) {
        this.ncomandas = n;
        for (int i = 0; i < this.ncomandas; i++) {
            int beber = (int) Math.round((Math.random() * 4) + 1);
            this.carril[i] = new Comanda(beber, "Hamburguesa", 1);
        }
    }

    public void anadirComanda() {
        this.ncomandas++;
        int beber = (int) Math.round((Math.random() * 4) + 1);
        this.carril[ncomandas] = new Comanda(beber, "Hamburguesa", 1);
    }
    
    
     public void adelantar() {
        this.carril[0]=null;
        this.adelantada++;
        for (int i = 1; i < ncomandas; i++) {
            if(this.adelantada>this.ncomandas){
                System.out.println("No se puede adelantar comandas");
            }else{
                this.carril[i] = this.carril[i - 1];
            }
            
        }
    }
     public void retrasar() {
        for (int i = 1; i < ncomandas; i++) {
            if (this.ncomandas == this.carril.length) {
                System.out.println("El carril de comandas se encuentra completo");
            } else {
                this.carril[i] = this.carril[i + 1];
            }
        }
        ncomandas++;
    }
}