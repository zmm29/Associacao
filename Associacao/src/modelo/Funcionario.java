package modelo;

import java.util.List;

public class Funcionario {
	private String nome; 
	private double salario;
	private Departament departamento;
	
	public Funcionario(String nome, double salario, Departament dpto) {
		
		this.nome = nome;
		this.salario = salario;
		this.departamento= dpto;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public Departament getDepartamento() {
		return this.departamento;
		
	}
	
}
