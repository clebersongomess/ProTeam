package com.gestao.projetos.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tarefa")
public class Tarefa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private String status;
    private String prioridade;
    private LocalDate prazo;

    @ManyToOne
    private Usuario responsavel;

    @ManyToOne
    private Projeto projeto;
    // getters e setters
}
