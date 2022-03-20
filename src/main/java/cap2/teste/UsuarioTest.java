package main.java.cap2.teste;

import main.java.cap2.classes.Mostrador;
import main.java.cap2.classes.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsuarioTest {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Paulo Silveira", 150);
        Usuario usuario2 = new Usuario("Rodrigo Turini", 120);
        Usuario usuario3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

        for (Usuario user: usuarios){
            System.out.println(user.getNome());
        }

        // utilizando instância para um objeto mostrador que implementa a classe Consumer
        Mostrador mostrador = new Mostrador();
        usuarios.forEach(mostrador);

        // Utilizando classe anônima
        Consumer<Usuario> mostrador2 = new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        };
        usuarios.forEach(mostrador2);

        //evitando a construção da variável local
        usuarios.forEach(new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        });
    }
}
