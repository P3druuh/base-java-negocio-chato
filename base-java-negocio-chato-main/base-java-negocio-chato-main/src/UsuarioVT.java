public class UsuarioVT extends Pessoa {
    private String idUsuario;
    private String nomeUsuario;
    private String senha;
    private String idBilheteUnico;
    private Carteira carteira;
    private double valorViagemMetro;
    private double valorViagemOnibus;

    public UsuarioVT(String nomeCompleto, String email, String telefone, String CPF, String CEP, String dataNascimento,
                     String idUsuario, String nomeUsuario, String idBilheteUnico, String senha, int pontos, int viagemGraca,
                     boolean missao1, boolean missao2, boolean missao3) {
        super(nomeCompleto, email, telefone, CPF, CEP, dataNascimento);
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.idBilheteUnico = idBilheteUnico;
        this.senha = senha;
        carteira = new Carteira(pontos, viagemGraca, missao1, missao2, missao3);
    }

    public void imprimirDadosVT(){
        super.imprimirPessoa();
        System.out.println("ID de usuario: " + idUsuario);
        System.out.println("Usuario: " + nomeUsuario);
        System.out.println("Senha: (senha é privado burro)");
        System.out.println("Pontos: " + carteira.getPontos());
        System.out.println("Viagens de graça: " + carteira.getViagensGraca());
        System.out.println("Valor da proxima viagem de metro: R$" + valorViagemMetro);
        System.out.println("Valor da proxima viagem de onibus: R$" + valorViagemOnibus);
    }

    public void imprimirCarteiraVT(){
        System.out.println("==INFORMAÇÕES==");
        System.out.println("Pontos: " + carteira.getPontos());
        System.out.println("Viagens de graça: " + carteira.getViagensGraca());
        System.out.println("Valor da proxima viagem de metro: R$" + valorViagemMetro);
        System.out.println("Valor da proxima viagem de onibus: R$" + valorViagemOnibus);
    }

    public void descontoViagemGraca(){
        carteira.converterPontosViagem();
    }


    public void descontoMetroVT25(){
        if (carteira.getPontos() >= 25){
            carteira.setPontos(carteira.getPontos()-25);
            this.valorViagemMetro = 4.44;
            System.out.println("Usando 25 pontos, seu desconto de 25% foi aplicado!");
        } else {
            System.out.println("Pontos insuficientes!");
        }
    }

    public void descontoMetroVT50(){
        if (carteira.getPontos() >= 50){
            carteira.setPontos(carteira.getPontos()-50);
            this.valorViagemMetro = 2.96;
            System.out.println("Usando 50 pontos, seu desconto de 50% foi aplicado!");
        } else {
            System.out.println("Pontos insuficientes!");
        }
    }

    public void descontoOnibusVT25(){
        if (carteira.getPontos() >= 25){
            carteira.setPontos(carteira.getPontos()-25);
            this.valorViagemOnibus = 4.37;
            System.out.println("Usando 25 pontos, seu desconto de 25% foi aplicado!");
        } else {
            System.out.println("Pontos insuficientes!");
        }
    }

    public void descontoOnibusVT50(){
        if (carteira.getPontos() >= 50){
            carteira.setPontos(carteira.getPontos()-50);
            this.valorViagemOnibus = 2.91;
            System.out.println("Usando 50 pontos, seu desconto de 50% foi aplicado!");
        } else {
            System.out.println("Pontos insuficientes!");
        }
    }

    public void viagemFeitaVT(){
        if (carteira.getViagensGraca() >= 1){
            this.carteira.viagemFeita();
            carteira.setViagensGraca(carteira.getViagensGraca()-1);
        } else {
            this.carteira.viagemFeita();
            this.valorViagemMetro = 5.40;
            this.valorViagemOnibus = 5.30;
        }
    }

    public void missao1VT(){
        carteira.verificarMissao1();
    }

    public void missao2VT(){
        carteira.verificarMissao2();
    }

    public void missao3VT(){
        carteira.verificarMissao3();
    }
}
