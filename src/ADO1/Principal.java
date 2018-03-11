/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO1;

import java.util.Scanner;

/**
 *
 * @author Vitoria Cristina
 */
public class Principal {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        ListaSimples listaSimples = new ListaSimples();
        System.out.println("MENU");
        int opc = 0;
        boolean on = false;
        

        do {
            System.out.println("1 - Entrar com os dados no inicio da lista");
            System.out.println("2 - Entrar com os dados no fim da lista");
            System.out.println("3 - Pesquisar carro na lista");
            System.out.println("4 - Imprimir todos os elementos da lista");
            System.out.println("5 - Remover um elemento da lista");
            System.out.println("6 - Remover todos os elementos da lista");
            System.out.println("7 - Sair");
            opc = console.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Digite o Modelo do veiculo: ");
                    String modelo = console.next();
                    System.out.print("Digite a Marca do veiculo: ");
                    String marca = console.next();
                    System.out.print("Digite o ano do veiculo: ");
                    int anoVeiculo = console.nextInt();

                    Carros carros = new Carros();
                    carros.setModelo(modelo);
                    carros.setMarca(marca);
                    carros.setAno(anoVeiculo);

                    try {
                        listaSimples.inserirPrimeiro(carros);
                    } catch (Exception e) {
                        System.out.println("Erro");
                    }

                    break;
                case 2:
                    System.out.print("Digite o Modelo do veiculo: ");
                    String Modelo = console.next();
                    System.out.print("Digite a Marca do veiculo: ");
                    String Marca = console.next();
                    System.out.print("Digite o ano do veiculo: ");
                    int AnoVeiculo = console.nextInt();
                    Carros carros2 = new Carros();
                    carros2.setModelo(Modelo);
                    carros2.setMarca(Marca);
                    carros2.setAno(AnoVeiculo);

                    try {
                        listaSimples.inserirUltimo(carros2);
                    } catch (Error e) {
                        System.out.println("Erro");
                    }

                    break;
                case 3:

                    System.out.println("Digite o modelo do veiculo á ser Pesquisado: ");
                    String pesquisa = console.next();

                    String lista = listaSimples.pesquisarNo(pesquisa);
                    System.out.println(lista);
                    break;

                case 4:
                    String result = listaSimples.imprimirLista();
                    System.out.println(result);
                    break;

                case 5:

                    System.out.println("Digite o modelo do veiculo á ser removido: ");
                    String remover = console.next();
                    
                    try{
                    listaSimples.removerNo(remover);
                    }catch (Exception e){
                        System.out.println("Erro a apagar");
                    }
                    break;
                case 6:
                   
                       System.out.println("Digite o modelo do veiculo á ser removido");
                       String remover2 = console.next();
                       
                       //listaSimples.removerLista(remover2); 
               try {
                        listaSimples.removerLista(remover2);
                    } catch (Exception e) {
                        System.out.println("Erro ao apagar todos os registros");
                    }
                    break;

                default:
                    System.out.println(" ");
                    on= false;
                    break;
            }
        }while (on == false);
    }
}
