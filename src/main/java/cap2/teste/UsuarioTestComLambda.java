package main.java.cap2.teste;

import main.java.cap2.classes.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsuarioTestComLambda {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Paulo Silveira", 150);
        Usuario usuario2 = new Usuario("Rodrigo Turini", 120);
        Usuario usuario3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

        // Opção do Lambda mais verbosa
        Consumer<Usuario> mostrador = (Usuario u) -> {System.out.println(u.getNome());};

        // Opção sem uso de Usuario nem parênteses
        Consumer<Usuario> mostrador2 = usuario -> {System.out.println(usuario.getNome());};

        // Opção direta
        Consumer<Usuario> mostrador3 = usuario -> System.out.println(usuario.getNome());

        // Aplicando com o usu de variável
        usuarios.forEach(mostrador);

        /*Aplicando sem a necessidade da construção de uma variável mostrador */
        usuarios.forEach(user -> System.out.println(user.getNome()));
    }
}
