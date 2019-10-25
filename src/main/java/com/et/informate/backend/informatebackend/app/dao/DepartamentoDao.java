package com.et.informate.backend.informatebackend.app.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.et.informate.backend.informatebackend.app.dominio.Departamento;

/**
 * Repository : Departamento.
 */
public interface DepartamentoDao extends PagingAndSortingRepository<Departamento, Integer> {

}
