package com.dandole.estasi.repository;

import com.dandole.estasi.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductosRepository extends JpaRepository<Productos,Integer> {
}
