class Soma extends Calculo{

    @Override
    public void exibirResultado() {
        total = 0d;
        System.out.println("Os valores digitados foram:");
        for( Double valor : this.valores){
            System.out.println(valor);
            total += valor;
        }
        System.out.println("O total da soma é: " + total);
    }

}
