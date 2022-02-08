package br.com.p3d50.patternstrategy;

import java.util.Arrays;

//ConcreteStrategy
public class Calabreza implements  Pizza{
    @Override
    public void preparar() {
        System.out.println("massa, presunto, queijo, calabresa, cebola");
    }
}
