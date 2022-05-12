package org.generation.blogpessoal.Repository;

import java.util.Optional;

import org.generation.blogpessoal.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>  {
	public Optional<Usuario> findByUsuario(String usuario);
}
