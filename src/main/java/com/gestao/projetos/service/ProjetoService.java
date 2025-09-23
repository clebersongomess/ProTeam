package com.gestao.projetos.service;

import com.gestao.projetos.model.Projeto;
import com.gestao.projetos.repository.ProjetoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {
    private final ProjetoRepository repository;
    public ProjetoService(ProjetoRepository repository) { this.repository = repository; }
    public Projeto criarProjeto(Projeto obj) { return repository.save(obj); }
    public List<Projeto> listarProjetos() { return repository.findAll(); }
    public Optional<Projeto> buscarPorId(Long id) { return repository.findById(id); }
    public Projeto atualizarProjeto(Projeto obj) { return repository.save(obj); }
    public void deletarProjeto(Long id) { repository.deleteById(id); }
}
