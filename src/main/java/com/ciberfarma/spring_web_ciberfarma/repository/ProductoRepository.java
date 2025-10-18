package com.ciberfarma.spring_web_ciberfarma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciberfarma.spring_web_ciberfarma.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	List<Producto> findAllByOrderByIdProductoDesc();
}
