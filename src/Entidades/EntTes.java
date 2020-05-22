package Entidades;

public class EntTes {
	
	private int id;
	private String name;
	private double sal;

	public EntTes(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public void incSal(double percentage) {
		sal += sal * percentage/100;
	}
	
	public String toString() {
		return id
				+ ", "
				+ name
				+ ", "
				+ sal
				+ String.format("%.2f%n", sal);
	}
	
	
}

