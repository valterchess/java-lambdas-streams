package main.java.cap3.minhainterface;

public class Endereco {
    // implementação comum
    Validador<String> validadorCep = new Validador<String>() {
        @Override
        public boolean valida(String valor) {
            return valor.matches("[0-9]{5}-[0-9]{3}");
        }
    };

    public Validador<String> validadorCep2 = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
}