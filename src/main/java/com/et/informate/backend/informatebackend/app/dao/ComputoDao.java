package com.et.informate.backend.informatebackend.app.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.et.informate.backend.informatebackend.app.dominio.Computo;
/**
 * Repository : Computo.
 */
public interface ComputoDao extends PagingAndSortingRepository<Computo, Integer> {

}
