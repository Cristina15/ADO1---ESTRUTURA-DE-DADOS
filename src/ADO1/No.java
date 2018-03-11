/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO1;

/**
 *
 * @author Vitoria Cristina
 */
public class No {
    private Carros c;
    private No proximo;
    
    public No(Carros car){
        this.c=car;
        this.proximo=null;
        
    }

    public Carros getC() {
        return c;
    }

    public void setC(Carros c) {
        this.c = c;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
}
