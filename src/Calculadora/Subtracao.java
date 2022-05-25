class Subtracao extends Calculo{
    @Override
    public void exibirResultado() {
        total = 0d;
        System.out.println("Os valores digitados foram:");
        for( double valor : this.valores){
            System.out.println(valor);
            total -= valor;
        }
        System.out.println("O total da subtração é: " + total);
    }
}
