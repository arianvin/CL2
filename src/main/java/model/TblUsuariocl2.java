package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuariocl2 database table.
 * 
 */
@Entity
@Table(name="tbl_usuariocl2")
@NamedQuery(name="TblUsuariocl2.findAll", query="SELECT t FROM TblUsuariocl2 t")
public class TblUsuariocl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idusuario;

	private String passwordcl2;

	private String usuariocl2;

	public TblUsuariocl2() {
	}

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getPasswordcl2() {
		return this.passwordcl2;
	}

	public void setPasswordcl2(String passwordcl2) {
		this.passwordcl2 = passwordcl2;
	}

	public String getUsuariocl2() {
		return this.usuariocl2;
	}

	public void setUsuariocl2(String usuariocl2) {
		this.usuariocl2 = usuariocl2;
	}

}