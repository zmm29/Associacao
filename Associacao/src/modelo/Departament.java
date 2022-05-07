package modelo;

import java.util.List;

public class Departament {
	public String descricao;
	private List<Funcionario> funcionarios;
	
	public Departament(String desc) {
		this.descricao = desc;
		
	}
	public String getDescricao() {
		return this.descricao;
	}
	

}
