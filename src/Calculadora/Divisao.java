class Divisao extends Calculo{

    @Override
    public void exibirResultado() {

        System.out.println("Os valores digitados foram:");
        for ( int i = 0; i < valores.size() ; i++){
            System.out.println(valores.get(i));
            if(i > 0){
                total /= valores.get(i);
            }else{
                total = valores.get(i);
            }
        }
        System.out.println("O resultado da divisão é: " + total);

    }
}
