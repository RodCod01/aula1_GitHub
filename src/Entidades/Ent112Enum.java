package Entidades;

import java.util.Date;

import Entidades_enums.Enum112Enum;

// Order

public class Ent112Enum {
	
	private Integer id;
	private Date moment;
	private Enum112Enum status;
	
	public Ent112Enum() {
		
	}

	public Ent112Enum(Integer id, Date moment, Enum112Enum status) {
	
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Enum112Enum getStatus() {
		return status;
	}

	public void setStatus(Enum112Enum status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Ent112Enum [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}

	
	
	
	

}
