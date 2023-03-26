package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        //Sobrecarga Quadrilatero

        System.out.println("Exercício Quadrilatero");
        Quadrilatero.area(3);    // de acordo com a quantidade de parametros no metodo e sobrecarga, quando chamamos o
        Quadrilatero.area(5d,5d);       // metodo ele ja reconhce pela quantidade de parametros
        Quadrilatero.area(7,8,9);// ou seja 1 lado: quadrado, 2 lados: retangulo, 3 lados: trapézio
        Quadrilatero.area(5f,5f); // acrecentamos o f e o d para definir os float e double
    }




}
