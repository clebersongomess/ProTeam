package com.gestao.projetos.service;

import com.gestao.projetos.model.AlocacaoEquipeProjeto;
import com.gestao.projetos.repository.AlocacaoEquipeProjetoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AlocacaoEquipeProjetoService {
    private final AlocacaoEquipeProjetoRepository repository;
    public AlocacaoEquipeProjetoService(AlocacaoEquipeProjetoRepository repository) { this.repository = repository; }
    public AlocacaoEquipeProjeto criarAlocacaoEquipeProjeto(AlocacaoEquipeProjeto obj) { return repository.save(obj); }
    public List<AlocacaoEquipeProjeto> listarAlocacaoEquipeProjetos() { return repository.findAll(); }
    public Optional<AlocacaoEquipeProjeto> buscarPorId(Long id) { return repository.findById(id); }
    public AlocacaoEquipeProjeto atualizarAlocacaoEquipeProjeto(AlocacaoEquipeProjeto obj) { return repository.save(obj); }
    public void deletarAlocacaoEquipeProjeto(Long id) { repository.deleteById(id); }
}
