package com.gestao.projetos.service;

import com.gestao.projetos.model.Equipe;
import com.gestao.projetos.repository.EquipeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EquipeService {
    private final EquipeRepository repository;
    public EquipeService(EquipeRepository repository) { this.repository = repository; }
    public Equipe criarEquipe(Equipe obj) { return repository.save(obj); }
    public List<Equipe> listarEquipes() { return repository.findAll(); }
    public Optional<Equipe> buscarPorId(Long id) { return repository.findById(id); }
    public Equipe atualizarEquipe(Equipe obj) { return repository.save(obj); }
    public void deletarEquipe(Long id) { repository.deleteById(id); }
}
