package one.digitalinnovation;

public class Quadrilatero {

    public static void area(double lado) {

        System.out.println("Area do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio: " + ((baseMaior+baseMenor) * altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) { // só a mudança do nome do parâmetro não cria
                                                                  // uma sobrecarga se os tipos forem iguais.
        System.out.println("Área do lozângulo: " + (diagonal1 * diagonal2) / 2);
    }

}
