package Interfaces;

import java.util.List;

import model.TblUsuariocl2;

public interface IUsuarioCl2 {

	
	//declarando metodos
		public void RegistrarUsuarioCl2(TblUsuariocl2 usuariocl2);
		public void ActualizarUsuarioCl2(TblUsuariocl2 usuariocl2);
		public void EliminarUsuarioCl2(TblUsuariocl2 usuariocl2);
		public TblUsuariocl2 BuscarUsuarioCl2(TblUsuariocl2 usuariocl2);
		public List<TblUsuariocl2> ListadoUsuarioCl2();
		
		
	} //fin del interface
