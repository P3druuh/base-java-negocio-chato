public class Pessoa {
    private String nomeCompleto;
    private String dataNascimento;
    private String email;
    private String telefone;
    private String CPF;
    private String CEP;

    public Pessoa(String nomeCompleto, String email, String telefone, String CPF, String CEP, String dataNascimento) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.CPF = CPF;
        this.CEP = CEP;
        this.dataNascimento = dataNascimento;
    }

    public void imprimirPessoa() {
        System.out.println("==INFORMAÇÕES==");
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("E-Mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("CPF: " + CPF);
        System.out.println("CEP: " + CEP);
    }
}
