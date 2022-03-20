package main.java.cap4.CollectionAndPredicate;

import main.java.cap2.classes.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateRemoveIf {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Paulo Silveira", 150);
        Usuario usuario2 = new Usuario("Rodrigo Turini", 120);
        Usuario usuario3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        /* Classe Anônima
         Testa os objetos de um determinado tipo
         e retorna true caso esse objeto corresponda a lógica implementada
         nesse caso retorna true para todos os usuários que tenham mais de 160 pontos
         */
        Predicate<Usuario> predicate = new Predicate<Usuario>() {
            @Override
            public boolean test(Usuario usuario) {
                return usuario.getPontos() > 160;
            }
        };



        // o método removeif da interface Colection remove da
        // list os objetos correspondentes a um return true no predicate
        // neste caso os usuarios com pontuação maior que 160
        // utilizando uma variável (instância de classe anônima) predicate
        usuarios.removeIf(predicate);

        /***
         * Observação: O removeIf não pode ser imutável porque invoca o remove de uma coleção
         * por isso foi implementado nesse caso o Array list que é mutável. Diferente de Array.asList();
         */
        //retorna os usuários (method reference) exceto o removido na chamada anterior
        usuarios.forEach(System.out::println);

        // aplicando diretamente com o uso do lambda | sem classe anônima
        usuarios.removeIf(usuario -> usuario.getPontos() > 160);
    }
}