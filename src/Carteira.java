public class Carteira {
    private int pontos;
    private int viagensGraca;

    public Carteira(int pontos, int viagensGraca) {
        this.pontos = pontos;
        this.viagensGraca = viagensGraca;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getViagensGraca() {
        return viagensGraca;
    }

    public void setViagensGraca(int viagensGraca) {
        this.viagensGraca = viagensGraca;
    }

    public int viagemFeita(){
        System.out.println("Viagem feita! 10 pontos foram adicionados a sua conta.");
        return pontos += 10;
    }

    public void converterPontosViagem(){
        if (pontos >= 100){
            pontos -= 100;
            viagensGraca += 1;
            System.out.println("Pontos suficientes! Uma viagem de graça foi adicionada a sua conta.");
        } else {
            System.out.println("Pontos insuficientes!");
        }
    }
}
