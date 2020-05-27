package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Ent115CompDepartment;
import Entidades.Ent115CompHourContract;
import Entidades.Ent115CompWorker;
import Entidades_enums.Enum115_CompWorkerLevel;

public class P115Composicao {
	public static void main(String[] args) throws ParseException {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter workes data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();

//instanciar um novo objeto do tipo worker	
//Associado a esse objeto ter� outro objeto Departamento, que j� est� associado dentro da classe worker		
		Ent115CompWorker worker = new Ent115CompWorker(workerName, Enum115_CompWorkerLevel.valueOf(workerLevel), baseSalary, new Ent115CompDepartment(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			
			System.out.print("Date (DD/MM/YYY): ");
			Date contractDate = sdf.parse(sc.next() );
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			Ent115CompHourContract contract = new Ent115CompHourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);		
		}

//Para receber a data e recortar m�s e ano da string
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		
		System.out.println("Name: " + worker.getName());
// composi��o acessa o objeto worker para pegar o departamento e a partir dele o nome		
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for: " + monthAndYear + ": " + String.format("%2f", worker.income(year, month)));
		
		sc.close();
	}

}
