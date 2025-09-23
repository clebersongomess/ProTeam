package com.gestao.projetos.service;

import com.gestao.projetos.model.Tarefa;
import com.gestao.projetos.repository.TarefaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {
    private final TarefaRepository repository;
    public TarefaService(TarefaRepository repository) { this.repository = repository; }
    public Tarefa criarTarefa(Tarefa obj) { return repository.save(obj); }
    public List<Tarefa> listarTarefas() { return repository.findAll(); }
    public Optional<Tarefa> buscarPorId(Long id) { return repository.findById(id); }
    public Tarefa atualizarTarefa(Tarefa obj) { return repository.save(obj); }
    public void deletarTarefa(Long id) { repository.deleteById(id); }
}
