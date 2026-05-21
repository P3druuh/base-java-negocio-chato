public class Carteira {
    private int pontos;
    private int viagensGraca;
    private boolean missao1;
    private boolean missao2;
    private boolean missao3;

    public Carteira(int pontos, int viagensGraca, boolean missao1, boolean missao2, boolean missao3) {
        this.pontos = pontos;
        this.viagensGraca = viagensGraca;
        this.missao1 = missao1;
        this.missao2 = missao2;
        this.missao3 = missao3;
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

    //As missoes em si estão no codigo do Python, isso é apenas para o armazenamento de se a missão foi feita.
    public void verificarMissao1(){
        if (missao1){
            System.out.println("Missão feita, você já adiquiriu os 10 pontos!");
            this.pontos += 10;
        } else {
            System.out.println("Missão não feita! Para adiquirir 10 pontos, digite a letra A.");
        }
    }

    public void verificarMissao2(){
        if (missao2){
            System.out.println("Missão feita, você já adiquiriu os 15 pontos!");
            this.pontos += 15;
        } else {
            System.out.println("Missão não feita! Para adiquirir 15 pontos, digite uma palavra que contem exatamente 3 letras 'A'.");
        }
    }

    public void verificarMissao3(){
        if (missao3){
            System.out.println("Missão feita, você já adiquiriu os 20 pontos!");
            this.pontos += 20;
        } else {
            System.out.println("Missão não feita! Para adiquirir 20 pontos, digite três numeros para o sistema identificar o maior.");
        }
    }
}
