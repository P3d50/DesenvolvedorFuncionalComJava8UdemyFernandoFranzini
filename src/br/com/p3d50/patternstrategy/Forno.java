package br.com.p3d50.patternstrategy;


//Context
public class Forno {

    public void assar(Pizza pizza){
        pizza.preparar();//operação polimórfica
    }
}
