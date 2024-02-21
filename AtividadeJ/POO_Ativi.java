package AtividadeJ;

public class POO_Ativi {
    public static void main(String args[]){

        //esplicando o que eu entendi :p
        //Ex: Classe aq é o carro, "nome" da instancia pra poder chamar ela depois, recebe instacia da classe carro, que é criada quando o construtor indentifica a placa dentro do parentese.
        carro c1 = new carro("hel1666");
        //aqui chama a instacia c1 e o atributo modelo com o .modelo ai o modelo do c1 é definido
        c1.modelo = "maverick";
        carro c2 = new carro("mat2509");
        c2.modelo = "Fusca";
        carro c3 = new carro("jav4000");
        c3.modelo = "Palio";

        //Aqui a gente pede pra escrever os atributos
        //as rodas sendo atributos estaticos que não se alteram pois são inerentes da classe
        System.out.println("Informações do 1ºcarro Placa: "+c1.placa+" - Modelo: "+c1.modelo+" - Numero de rodas: "+c1.numderodas);
        System.out.println("Informações do 2ºcarro Placa: "+c2.placa+" - Modelo: "+c2.modelo+" - Numero de rodas: "+c2.numderodas);
        System.out.println("Informações do 3ºcarro Placa: "+c3.placa+" - Modelo: "+c3.modelo+" - Numero de rodas: "+c3.numderodas);
    }
}
