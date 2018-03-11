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
        

        while (on == false) {
            System.out.println("1 - Entrar com os dados no inicio da lista");
            System.out.println("2 - Entrar com os dados no fim da lista");
            System.out.println("3 - Pesquisar carro na lista");
            System.out.println("4 - Imprimir todos os elementos da lista");
            System.out.println("5 - Remover um elemento da lista");
            System.out.println("6 - Remover todos os elementos da lista");
            System.out.println("7 - Sair");

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

                    listaSimples.pesquisarNo(pesquisa);
                    break;

                case 4:
                    listaSimples.imprimirLista();
                    break;

                case 5:

                    System.out.println("Digite o modelo do veiculo á ser Removido: ");
                    String remover = console.next();

                    listaSimples.removerNo(remover);
                    break;

                case 6:

                    break;

                default:
                    System.out.println("Invalido");
                    on= false;
                    break;
            }
        }
    }
}
