package main.java.cap3.runnable;

public class TestInterfaceRunnable {

    public static void main(String[] args) {
        // Forma comum de instanciação de uma Thread e um Runnable que conta de 0 a 1000
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    System.out.println(i);
                }
            }
        };
        new Thread(r).start();
        // A inteface Runnable por ter apenas um método,
        // assim como outras interfaces com apenas um método,
        // é conhecida como interface funcional
        // Podendo ser instanciada através de um lambda

        // Utilizando o lambda em uma variável
        Runnable r2 = () -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println(i);
            }
        };
        new Thread(r2).start();

        // resolvendo de forma objetiva, sem o uso de variável
        new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println(i);
            }
        }).start();
    }
}
