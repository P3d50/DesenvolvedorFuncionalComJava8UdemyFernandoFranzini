package br.com.p3d50.patternstrategy;

public class Pizzaria {

    public static void main(String[] args){
        Pizza calabreza = new Calabreza();
        Pizza napolitana = new Napolitana();
        Forno forno = new Forno();
        forno.assar(calabreza);
        forno.assar(napolitana);
    }
}
