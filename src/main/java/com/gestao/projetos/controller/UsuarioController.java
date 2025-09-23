package com.gestao.projetos.controller;

import com.gestao.projetos.model.Usuario;
import com.gestao.projetos.service.UsuarioService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService) { this.usuarioService = usuarioService; }

    @GetMapping public List<Usuario> listarUsuarios() { return usuarioService.listarUsuarios(); }
    @PostMapping public Usuario criarUsuario(@RequestBody Usuario usuario) { return usuarioService.criarUsuario(usuario); }
    @GetMapping("/{id}") public Usuario buscarPorId(@PathVariable Long id) { return usuarioService.buscarPorId(id).orElse(null); }
    @PutMapping public Usuario atualizarUsuario(@RequestBody Usuario usuario) { return usuarioService.atualizarUsuario(usuario); }
    @DeleteMapping("/{id}") public void deletarUsuario(@PathVariable Long id) { usuarioService.deletarUsuario(id); }
}
