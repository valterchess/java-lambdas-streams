package main.java.cap2.entendendolambdas;

public class EntendendoLambda {

    public static void main(String[] args) {
        Runnable o = () -> {
            System.out.println("O que sou eu ? Que Lambda?");
        };

        // A saída é semelhante a saída comum as classes anônimas.
        System.out.println(o);
        System.out.println(o.getClass());
    }
}