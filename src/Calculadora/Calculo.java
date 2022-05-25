import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Calculo implements ICalculadora{

    private int cancelar = 1;
    protected Double total;
    protected List<Double> valores = new ArrayList<Double>();

    @Override
    public void adicionarValorAoCalculo(double valor) {

        Scanner scanner = new Scanner(System.in);
        valores.add(valor);
        System.out.println("Adicione mais um valor para realizar a operação:");

        do{
            valores.add(scanner.nextDouble());
            System.out.println("Para calcular digite 0 ou 1 para acrescentar um novo valor");
            cancelar = scanner.nextInt();
            if(cancelar != 0){
                System.out.println("Adicione mais um valor para realizar a operação:");
            }
        }while(cancelar != 0);

    }

    @Override
    public void exibirResultado() {

    }
}
