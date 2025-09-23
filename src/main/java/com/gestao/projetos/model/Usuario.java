package com.gestao.projetos.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String cargo;
    private String login;
    private String senhaHash;

    @Enumerated(EnumType.STRING)
    private Perfil perfil;

    private boolean ativo = true;

    @ManyToMany(mappedBy = "membros")
    private Set<Equipe> equipes = new HashSet<>();

    // getters e setters
}

enum Perfil {
    ADMIN, GERENTE, COLABORADOR
}
