package br.com.p3d50.lambda;

import br.com.p3d50.patternstrategy.Forno;

public class Pizzaria {

    public static void main(String[] args){
        Forno forno = new Forno();
        forno.assar(()->System.out.println("massa, presunto, queijo, calabresa, cebola"));
        forno.assar(()->{
            System.out.print("molho, ");
            System.out.print("massa, presunto, queijo, tomate, orégano");
        });
    }
}
