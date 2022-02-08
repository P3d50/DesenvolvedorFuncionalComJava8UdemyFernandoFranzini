package br.com.p3d50.lambda.ponteirodefuncao;

public class PonteiroThread {

    public static void main(String[] args) {

        Runnable r1 = ()-> System.out.println("rodando em outra thread");
        Runnable r2 = ()-> System.out.println("rodando em mais uma thread");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        new Thread(()-> System.out.println("só mais uminha")).start();



    }
}
