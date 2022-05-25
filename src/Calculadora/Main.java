import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int escolha;
        double valor;
        Calculo equacao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual operação você deseja utilizar?");
        System.out.println("-----------------------------------");
        System.out.println("[1] Somar");
        System.out.println("[2] Subtrair");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");

        escolha = scanner.nextInt();

        System.out.println("Escreva o primeiro valor:");
        System.out.println("-----------------------------------");

        valor = scanner.nextDouble();

        switch (escolha){
            case 1 :
                equacao = new Soma();
                equacao.adicionarValorAoCalculo(valor);
                equacao.exibirResultado();
                break;
            case 2 :
                equacao = new Subtracao();
                equacao.adicionarValorAoCalculo(valor);
                equacao.exibirResultado();
                break;
            case 3 :
                equacao = new Multiplicacao();
                equacao.adicionarValorAoCalculo(valor);
                equacao.exibirResultado();
                break;
            case 4 :
                equacao = new Divisao();
                equacao.adicionarValorAoCalculo(valor);
                equacao.exibirResultado();
                break;
        }

    }
}