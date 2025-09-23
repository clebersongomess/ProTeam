package com.gestao.projetos.controller;

import com.gestao.projetos.model.Equipe;
import com.gestao.projetos.service.EquipeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/equipes")
public class EquipeController {
    private final EquipeService service;
    public EquipeController(EquipeService service) { this.service = service; }

    @GetMapping public List<Equipe> listar() { return service.listarEquipes(); }
    @PostMapping public Equipe criar(@RequestBody Equipe obj) { return service.criarEquipe(obj); }
    @GetMapping("/{id}") public Equipe buscarPorId(@PathVariable Long id) { return service.buscarPorId(id).orElse(null); }
    @PutMapping public Equipe atualizar(@RequestBody Equipe obj) { return service.atualizarEquipe(obj); }
    @DeleteMapping("/{id}") public void deletar(@PathVariable Long id) { service.deletarEquipe(id); }
}
