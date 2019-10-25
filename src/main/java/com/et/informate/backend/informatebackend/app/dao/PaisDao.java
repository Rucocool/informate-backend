package com.et.informate.backend.informatebackend.app.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.et.informate.backend.informatebackend.app.dominio.Pais;

/**
 * Repository : Pais.
 */
public interface PaisDao extends PagingAndSortingRepository<Pais, Integer> {

}
