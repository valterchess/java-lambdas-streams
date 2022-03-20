package main.java.cap3.minhainterface;

@FunctionalInterface
public interface Validador<T> {
    boolean valida(T validar);
//    boolean outroMetodo(T t);
}