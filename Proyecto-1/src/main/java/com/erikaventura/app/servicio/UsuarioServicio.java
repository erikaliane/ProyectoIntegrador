package com.erikaventura.app.servicio;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.erikaventura.app.dto.UsuarioRegistroDTO;
import com.erikaventura.app.modelo.Usuario;

import java.util.List;

public interface UsuarioServicio extends UserDetailsService {

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
	public List<Usuario> listarUsuarios();

	
}
