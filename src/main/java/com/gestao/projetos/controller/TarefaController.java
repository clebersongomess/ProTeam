package com.gestao.projetos.controller;

import com.gestao.projetos.model.Tarefa;
import com.gestao.projetos.service.TarefaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {
    private final TarefaService service;
    public TarefaController(TarefaService service) { this.service = service; }

    @GetMapping public List<Tarefa> listar() { return service.listarTarefas(); }
    @PostMapping public Tarefa criar(@RequestBody Tarefa obj) { return service.criarTarefa(obj); }
    @GetMapping("/{id}") public Tarefa buscarPorId(@PathVariable Long id) { return service.buscarPorId(id).orElse(null); }
    @PutMapping public Tarefa atualizar(@RequestBody Tarefa obj) { return service.atualizarTarefa(obj); }
    @DeleteMapping("/{id}") public void deletar(@PathVariable Long id) { service.deletarTarefa(id); }
}
