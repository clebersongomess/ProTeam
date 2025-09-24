public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String cargo;
    private String login;
    private String senha;
    private Perfil perfil;

    public Usuario(String nome, String cpf, String email, String cargo,
                   String login, String senha, Perfil perfil) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }
    public String getCargo() { return cargo; }
    public String getLogin() { return login; }
    public String getSenha() { return senha; }
    public Perfil getPerfil() { return perfil; }

    @Override
    public String toString() {
        return "Usuário{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", cargo='" + cargo + '\'' +
                ", perfil=" + perfil +
                '}';
    }
}