package org.Farmacia.drogaria.repository;

import java.util.List;

import org.Farmacia.drogaria.model.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long> {
	public List<Categorias> findAllByNomeContainingIgnoreCase(String nome);
	public List<Categorias> findAllByDescricaoContainingIgnoreCase(String descricao);
}
