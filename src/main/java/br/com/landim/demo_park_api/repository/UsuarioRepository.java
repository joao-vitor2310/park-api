package br.com.landim.demo_park_api.repository;

import br.com.landim.demo_park_api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {



}
