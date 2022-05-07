package view;
import modelo.*;


public class Main {
	public static void main (String[] args) {
		Departament ti = new Departament("Tecnologia");
		
		Funcionario emerson = new Funcionario("Emerson Assis", 1.500, ti);
		System.out.println(emerson.getNome());
		System.out.println(emerson.getSalario());
		System.out.println(emerson.getDepartamento());
		
		
		
		
	}

}
