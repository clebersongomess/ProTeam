import java.time.LocalDate;

public class Projeto {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataTerminoPrevista;
    private StatusProjeto status;
    private Usuario gerente;

    // Novo construtor completo
    public Projeto(String nome, String descricao, Usuario gerente,
                   LocalDate dataInicio, LocalDate dataTerminoPrevista, StatusProjeto status) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTerminoPrevista = dataTerminoPrevista;
        this.status = status;
        this.gerente = gerente;
    }

    // Getters
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public StatusProjeto getStatus() { return status; }
    public Usuario getGerente() { return gerente; }
    public LocalDate getDataInicio() { return dataInicio; }
    public LocalDate getDataTerminoPrevista() { return dataTerminoPrevista; }

    @Override
    public String toString() {
        return "Projeto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataTerminoPrevista=" + dataTerminoPrevista +
                ", status=" + status +
                ", gerente=" + (gerente != null ? gerente.getNome() : "nenhum") +
                '}';
    }
}