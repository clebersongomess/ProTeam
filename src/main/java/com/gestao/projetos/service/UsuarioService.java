package com.gestao.projetos.service;

import com.gestao.projetos.model.Usuario;
import com.gestao.projetos.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository) { this.usuarioRepository = usuarioRepository; }
    public Usuario criarUsuario(Usuario usuario) { return usuarioRepository.save(usuario); }
    public List<Usuario> listarUsuarios() { return usuarioRepository.findAll(); }
    public Optional<Usuario> buscarPorId(Long id) { return usuarioRepository.findById(id); }
    public Usuario atualizarUsuario(Usuario usuario) { return usuarioRepository.save(usuario); }
    public void deletarUsuario(Long id) { usuarioRepository.deleteById(id); }
}
