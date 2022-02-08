package br.com.p3d50.lambda.math;

public class Calcular {

    public static void calcular(Matematica m){
        System.out.println(m.operar(10,15));
    }

    public static void main(String[] args) {
        calcular(((v1, v2) -> v1+v2));//inline lambda
        calcular(((v1, v2) -> {//inblock lambda
            return  v1-v2;
        }));
        calcular(((Integer v1, Integer v2) -> v1*v2));// lambda tipada
        calcular(((v1, v2) -> v1/v2));
        calcular(((v1, v2) -> v1%v2));
    }
}
