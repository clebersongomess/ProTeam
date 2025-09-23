package com.gestao.projetos.controller;

import com.gestao.projetos.model.Projeto;
import com.gestao.projetos.service.ProjetoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/projetos")
public class ProjetoController {
    private final ProjetoService service;
    public ProjetoController(ProjetoService service) { this.service = service; }

    @GetMapping public List<Projeto> listar() { return service.listarProjetos(); }
    @PostMapping public Projeto criar(@RequestBody Projeto obj) { return service.criarProjeto(obj); }
    @GetMapping("/{id}") public Projeto buscarPorId(@PathVariable Long id) { return service.buscarPorId(id).orElse(null); }
    @PutMapping public Projeto atualizar(@RequestBody Projeto obj) { return service.atualizarProjeto(obj); }
    @DeleteMapping("/{id}") public void deletar(@PathVariable Long id) { service.deletarProjeto(id); }
}
