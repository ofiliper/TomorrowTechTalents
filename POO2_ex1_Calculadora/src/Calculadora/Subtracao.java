class Subtracao extends Calculo{
    @Override
    public void exibirResultado() {
        total = valores.get(0);
        System.out.println("Os valores digitados foram:");
        System.out.println(valores.get(0));
        for ( int i = 1 ; i < valores.size() ; i++){
            System.out.println(valores.get(i));
            if(i > 0){
                total -= valores.get(i);
            }
        }
        System.out.println("O total da subtração é: " + total);
    }
}
