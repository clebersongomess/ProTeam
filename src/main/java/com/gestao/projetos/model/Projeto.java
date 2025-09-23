package com.gestao.projetos.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "projeto")
public class Projeto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFimPrevista;

    @Enumerated(EnumType.STRING)
    private ProjetoStatus status;

    @ManyToOne
    private Usuario gerente;

    @OneToMany(mappedBy = "projeto")
    private Set<Tarefa> tarefas = new HashSet<>();
    // getters e setters
}

enum ProjetoStatus {
    PLANEJADO, EM_ANDAMENTO, CONCLUIDO, CANCELADO
}
