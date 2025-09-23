package com.gestao.projetos.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "alocacao_equipe_projeto")
public class AlocacaoEquipeProjeto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Equipe equipe;

    @ManyToOne
    private Projeto projeto;

    private LocalDate dataAlocacao;
    private Double cargaHoraria;
    private String observacao;
    // getters e setters
}
