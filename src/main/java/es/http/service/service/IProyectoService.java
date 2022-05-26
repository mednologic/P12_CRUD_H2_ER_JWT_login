package es.http.service.service;

import java.util.List;

import es.http.service.dto.Proyecto;


public interface IProyectoService {
	//Listar, Guardar, ListarXID, actualizar, eliminar
		public List<Proyecto> listarProyecto();
		public Proyecto guardarProyecto(Proyecto proyecto);
		public Proyecto listarProyectoXID(String id);
		public Proyecto actualizarProyecto(Proyecto proyecto);
		public void eliminarProyecto(String id);

}