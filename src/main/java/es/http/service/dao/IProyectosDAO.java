package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Proyecto;


public interface IProyectosDAO extends JpaRepository<Proyecto, Long>{

}
