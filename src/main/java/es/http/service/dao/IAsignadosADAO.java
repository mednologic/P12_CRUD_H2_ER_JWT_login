package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.AsignadoA;


public interface IAsignadosADAO extends JpaRepository<AsignadoA, Long> {

}
