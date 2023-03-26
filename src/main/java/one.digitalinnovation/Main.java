package one.digitalinnovation;
public class Main {

    public static void main(String[] args) {

        //Calculadora

        System.out.println("Exercício Calculadora");
        Calculadora.soma(3, 6); // aqui chamamos o método através da classe Calculadora
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);


        //Mensagem

        System.out.println("\nExercício Mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(23);


        //Empréstimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }

}


