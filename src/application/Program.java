package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import enteties.Employee;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter full fiel path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List <Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[]fields = line.split(",");
				list.add(new Employee(fields[0],fields[1],Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter the salary: ");
			double salary=sc.nextDouble();
			
			//Mostra os Emails que ganham o determinado salario informado na variavel Salary
			List<String> emails = list.stream()//recebe as informacoes da lista
					.filter(x-> x.getSalary()>salary)//faz o filtro do valor atribuido a variavel
					.map(x -> x.getMail())//lista os dados capturados pelo .filter
					.sorted().collect(Collectors.toList());
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
			emails.forEach(System.out::println);//imprimi
			
			double sum = list.stream()//recebe os dados informados na lista
					.filter(x->x.getName().charAt(0)=='M')//filtra os dados que começam com a letra M
					.map(x->x.getSalary())//lista o salario
					.reduce(0.0 ,(x,y)->x+y);//faz a soma
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f",sum));
			
		}
		
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
		}

	}


