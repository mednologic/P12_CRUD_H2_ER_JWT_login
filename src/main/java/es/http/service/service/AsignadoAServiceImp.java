package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IAsignadosADAO;
import es.http.service.dto.AsignadoA;


@Service
public class AsignadoAServiceImp implements IAsignadoAService {
	
	@Autowired
	IAsignadosADAO iAsignadosADAO;

	@Override
	public List<AsignadoA> listarAsignadosA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AsignadoA guardarAsignadosA(AsignadoA asignadoA) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AsignadoA listarAsignadosAXID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AsignadoA actualizarAsignadosA(AsignadoA asignadoA) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarAsignadosA(String id) {
		// TODO Auto-generated method stub
		
	}

	

}

