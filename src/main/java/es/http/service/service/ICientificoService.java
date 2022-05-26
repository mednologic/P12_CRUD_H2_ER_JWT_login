package es.http.service.service;

import java.util.List;

import es.http.service.dto.Cientifico;


public interface ICientificoService {
	
	//Listar, Guardar, ListarXID, actualizar, eliminar
	public List<Cientifico> listarCientificos();
	public Cientifico guardarCientifico(Cientifico cientifico);
	public Cientifico listarCientificoXID(String id);
	public Cientifico actualizarCientifico(Cientifico cientifico);
	public void eliminarCientifico(String id);

}
