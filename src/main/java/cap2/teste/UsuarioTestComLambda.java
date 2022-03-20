package main.java.cap2.teste;

import main.java.cap2.classes.Usuario;

import java.util.function.Consumer;

public class UsuarioTestComLambda {
    public static void main(String[] args) {
        // Opção do Lambda mais verbosa
        Consumer<Usuario> mostrador = (Usuario u) -> {System.out.println(u.getNome());};

        // Opção sem uso de Usuario nem parênteses
        Consumer<Usuario> mostrador2 = usuario -> {System.out.println(usuario.getNome());};

        // Opção direta
        Consumer<Usuario> mostrador3 = usuario -> System.out.println(usuario.getNome());

    }
}
