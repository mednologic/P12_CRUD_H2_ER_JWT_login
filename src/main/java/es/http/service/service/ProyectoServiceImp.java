package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IProyectosDAO;
import es.http.service.dto.Proyecto;



@Service
public class ProyectoServiceImp implements IProyectoService{
	
	@Autowired
	IProyectosDAO iProyectosDAO;

	@Override
	public List<Proyecto> listarProyecto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proyecto listarProyectoXID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarProyecto(String id) {
		// TODO Auto-generated method stub
		
	}

}
