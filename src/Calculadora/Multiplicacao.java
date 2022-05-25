class Multiplicacao extends Calculo{

    @Override
    public void exibirResultado() {
        total = 1d;
        System.out.println("Os valores digitados foram:");
        for( double valor : this.valores){
            System.out.println(valor);
            total *= valor;
        }
        System.out.println("O resultado da multiplicação é: " + total);
    }
}