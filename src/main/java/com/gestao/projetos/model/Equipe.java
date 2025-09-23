package com.gestao.projetos.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "equipe")
public class Equipe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;

    @ManyToMany
    @JoinTable(name = "equipe_usuario",
               joinColumns = @JoinColumn(name = "equipe_id"),
               inverseJoinColumns = @JoinColumn(name = "usuario_id"))
    private Set<Usuario> membros = new HashSet<>();
    // getters e setters
}
