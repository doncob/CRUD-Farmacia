package com.generation.FarmaciaBackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.FarmaciaBackend.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

public List <Categoria> findAllByMarcaContainingIgnoreCase(@Param("marca")String marca);

}