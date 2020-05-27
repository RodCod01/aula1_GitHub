package Entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Entidades_enums.Enum115_CompWorkerLevel;

public class Ent115CompWorker {
	
	private String name;
	private Enum115_CompWorkerLevel level;
	private Double baseSalary;
	
//Associações que compõem essa composição.
	private Ent115CompDepartment department;
	private List<Ent115CompHourContract> contracts = new ArrayList<>();
	
//construtor padrão
	public Ent115CompWorker() {
		
	}

//Não incluir lista nos construtores com argumentos, tem muitos não entram nos construtores
public Ent115CompWorker(String name, Enum115_CompWorkerLevel level, Double baseSalary,
		Ent115CompDepartment department) {
	this.name = name;
	this.level = level;
	this.baseSalary = baseSalary;
	this.department = department;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Enum115_CompWorkerLevel getLevel() {
	return level;
}

public void setLevel(Enum115_CompWorkerLevel level) {
	this.level = level;
}

public Double getBaseSalary() {
	return baseSalary;
}

public void setBaseSalary(Double baseSalary) {
	this.baseSalary = baseSalary;
}

public Ent115CompDepartment getDepartment() {
	return department;
}

public void setDepartment(Ent115CompDepartment department) {
	this.department = department;
}

public List<Ent115CompHourContract> getContracts() {
	return contracts;
}


//Implementar os métodos

	public void addContract(Ent115CompHourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(Ent115CompHourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		
		Calendar cal = Calendar.getInstance(); 
		for(Ent115CompHourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);		
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
		
	}

}
