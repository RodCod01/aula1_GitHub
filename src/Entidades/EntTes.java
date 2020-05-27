package Entidades;

import java.util.Date;

import Entidades_enums.EnumTes;

// Classe com os construtores dos objetos utilisados na classe principal

public class EntTes {
	
	private Integer id;
	private Date mon;
	private EnumTes status;
	
	
	public EntTes() {
		
	}
	
	public EntTes(Integer id, Date mon, EnumTes status) {
		this.id = id;
		this.mon = mon;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMon() {
		return mon;
	}

	public void setMon(Date mon) {
		this.mon = mon;
	}

	public EnumTes getStatus() {
		return status;
	}

	public void setStatus(EnumTes status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "EntTes [id=" + id + ", mon=" + mon + ", status=" + status + "]";
	}
}

