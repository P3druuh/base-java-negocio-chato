public class UsuarioComum extends Pessoa {
    private String idUsuario;
    private String nomeUsuario;
    private String senha;
    private String idBilheteUnico;
    private Carteira carteira;

    public UsuarioComum(String nomeCompleto, String email, String telefone, String CPF, String CEP, String dataNascimento, String idUsuario, String nomeUsuario, String idBilheteUnico, String senha, int pontos, int viagemGraca) {
        super(nomeCompleto, email, telefone, CPF, CEP, dataNascimento);
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.idBilheteUnico = idBilheteUnico;
        this.senha = senha;
        carteira = new Carteira(pontos, viagemGraca);
    }

    public void imprimirDadosComum(){
        super.imprimirPessoa();
        System.out.println("ID de usuario: " + idUsuario);
        System.out.println("Usuario: " + nomeUsuario);
        System.out.println("Senha: (senha é privado burro)");
        System.out.println("Pontos: " + carteira.getPontos());
        System.out.println("Viagens de graça: " + carteira.getViagensGraca());
    }

    public void imprimirCarteiraComum(){
        System.out.println("Pontos: " + carteira.getPontos());
        System.out.println("Viagens de graça: " + carteira.getViagensGraca());
    }

    public void converterPontosViagemComum(){
        this.carteira.converterPontosViagem();
    }

    public void viagemFeitaComum(){
        this.carteira.viagemFeita();
    }
}
