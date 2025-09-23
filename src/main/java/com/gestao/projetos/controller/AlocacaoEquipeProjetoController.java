package com.gestao.projetos.controller;

import com.gestao.projetos.model.AlocacaoEquipeProjeto;
import com.gestao.projetos.service.AlocacaoEquipeProjetoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/alocacaoequipeprojetos")
public class AlocacaoEquipeProjetoController {
    private final AlocacaoEquipeProjetoService service;
    public AlocacaoEquipeProjetoController(AlocacaoEquipeProjetoService service) { this.service = service; }

    @GetMapping public List<AlocacaoEquipeProjeto> listar() { return service.listarAlocacaoEquipeProjetos(); }
    @PostMapping public AlocacaoEquipeProjeto criar(@RequestBody AlocacaoEquipeProjeto obj) { return service.criarAlocacaoEquipeProjeto(obj); }
    @GetMapping("/{id}") public AlocacaoEquipeProjeto buscarPorId(@PathVariable Long id) { return service.buscarPorId(id).orElse(null); }
    @PutMapping public AlocacaoEquipeProjeto atualizar(@RequestBody AlocacaoEquipeProjeto obj) { return service.atualizarAlocacaoEquipeProjeto(obj); }
    @DeleteMapping("/{id}") public void deletar(@PathVariable Long id) { service.deletarAlocacaoEquipeProjeto(id); }
}
