package br.com.p3d50.patternstrategy;

//ConcreteStrategy
public class Napolitana implements Pizza{
    @Override
    public void preparar() {
        System.out.println("massa, presunto, queijo, tomate, orégano");
    }
}
