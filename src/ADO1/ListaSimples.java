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
public class ListaSimples {

    private No primeiro;
    private No ultimo;
    private int qtdNo;

    public ListaSimples() {
        this.primeiro = null;
        this.ultimo = null;
        this.qtdNo = 0;

    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getQtdNo() {
        return qtdNo;
    }

    public void setQtdNo(int qtdNo) {
        this.qtdNo = qtdNo;
    }

    public boolean isEmpty() {
        return (this.primeiro == null);
    }

    public void inserirPrimeiro(Carros c) {
        No novoNo = new No(c);
        if (this.isEmpty()) {
            this.ultimo = novoNo;
            novoNo.setProximo(this.primeiro);
            this.primeiro = novoNo;
            this.qtdNo++;
        }
    }

    public void inserirUltimo(Carros c) {
        No novoNo = new No(c);
        if (this.isEmpty()) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.setProximo(novoNo);
            this.ultimo = novoNo;
            this.qtdNo++;

        }

    }

    public boolean removerLista(String modelo){
        No atual = this.primeiro;
        No anterior = null;
        if (this.isEmpty()) {
            return false;
        } else {
            while (atual != null) {
                anterior = atual;
                atual = atual.getProximo();
            }
            if (atual == primeiro) {
                if (this.primeiro == this.ultimo) {
                    this.ultimo = null;
                }
                this.primeiro = this.primeiro.getProximo();
            } else {
                if (atual == ultimo) {
                    this.ultimo = null;
                }
                anterior.setProximo(atual.getProximo());
            }
        }
        this.qtdNo = 0;
        return true;
    }
    
    public boolean removerNo(String modelo) {
        No atual = this.primeiro;
        No anterior = null;
        if (this.isEmpty()) {
            return false;
        } else {
            while (atual != null && (!atual.getC().getModelo().equals(modelo))) {
                anterior = atual;
                atual = atual.getProximo();
            }
            if (atual == primeiro) {
                if (this.primeiro == this.ultimo) {
                    this.ultimo = null;
                }
                this.primeiro = this.primeiro.getProximo();
            } else {
                if (atual == ultimo) {
                    this.ultimo = anterior;
                }
                anterior.setProximo(atual.getProximo());
            }
        }
        this.qtdNo--;
        return true;
    }

    public String pesquisarNo(String modelo) {
        String msg = "";
        No atual = this.primeiro;
        while (atual != null && (!atual.getC().getModelo().equals(modelo))) {
            atual = atual.getProximo();
        }
        return msg = "Modelo: " + atual.getC().getModelo() + "\n"
                + " Marca : " + atual.getC().getMarca() + "\n"
                + "Ano : " + atual.getC().getAno();

    }
    public String imprimirLista(){
        String msg="";
        if(this.isEmpty()){
            msg=" Lista Vazia!";
        } else {
            No atual = this.primeiro;
            while(atual !=null){
                msg += atual.getC().getModelo()+ "--->";
                atual = atual.getProximo();
            }
        }
        return msg;
    }
}
