import java.time.LocalDate;

public class Projeto {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataTerminoPrevista;
    private StatusProjeto status;
    private Usuario gerente;

    public Projeto(String nome, String descricao, Usuario gerente) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = LocalDate.now();
        this.dataTerminoPrevista = dataInicio.plusMonths(6); // prazo padrão
        this.status = StatusProjeto.PLANEJADO;
        this.gerente = gerente;
    }

    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public StatusProjeto getStatus() { return status; }
    public Usuario getGerente() { return gerente; }

    @Override
    public String toString() {
        return "Projeto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                ", gerente=" + (gerente != null ? gerente.getNome() : "nenhum") +
                '}';
    }
}