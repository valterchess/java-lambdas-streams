package main.java.cap2.entendendolambdas;

public class AcessandoVariaveisLocais {
    public static void main(String[] args) {
        final int numero = 5;
        int numero2 = 10;

        // acessando variável local final (assim como nas classes anônimas)
        new Thread(() -> {
            System.out.println(numero);
        }).start();

        //acessando variável local não final
        // (mas ao usar a variável no lambda ela não pode ser alterada, deve ser efetivamente final)
        new Thread(() -> {
            System.out.println(numero2); // não compilaria por conta da atribuição na linha 18
        }).start();
        // numero2 = 9;
    }
}
