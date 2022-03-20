package main.java.cap4.consumerAndThen;

import main.java.cap2.classes.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThen {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Paulo Silveira", 150);
        Usuario usuario2 = new Usuario("Rodrigo Turini", 120);
        Usuario usuario3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

        // A inteface Consumer possui um método "default" - (andThen()) além do método accept()
        // que será implementado nesse exemplo.
        Consumer<Usuario> mostraMensagem = usuario -> System.out.println("Antes de imprimir os nomes");
        Consumer<Usuario> imprimeNome = usuario -> System.out.println(usuario.getNome());

        // aplicando o método default da interface Consumer
        usuarios.forEach(mostraMensagem.andThen(imprimeNome));
    }
}