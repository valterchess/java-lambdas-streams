package main.java.cap3.minhainterface.Test;

import main.java.cap3.minhainterface.Endereco;

public class ValidadorTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        System.out.println(endereco.validadorCep2.valida("05145-100"));
    }
}
