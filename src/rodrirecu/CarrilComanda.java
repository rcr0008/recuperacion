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
 Comanda carril[] = new Comanda [10];
    int ncomandas;
    Comanda servidas [] = new Comanda[10];
    int servida = 0;
    int adelantada =0;

    public CarrilComanda(int n) {
        this.ncomandas = n;
        for (int i = 0; i < this.ncomandas; i++) {
        int beber = (int) Math.round((Math.random() * 4) + 1);
            this.carril[i] = new Comanda(beber,"Hamburguesa",1);
        }
    }

    public void añadirComanda() {
        this.ncomandas++;
        int beber = (int) Math.round((Math.random() * 4) + 1)
        this.carril[i] = new Comanda(beber,"Hamburguesa",1);
    }
}
