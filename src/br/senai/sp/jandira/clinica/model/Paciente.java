package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	
	public String nome;
	public LocalDate dataNascimento;
	private double peso;
	private double altura;
	public String telefone;
	public boolean estaInternado;
	private double imc;
	
	public void setAltura(double altura) {
		
		if(altura > 0) {
			//true
			this.altura = altura;
		} else {
			//false
			System.out.println("A altura do(a) paciente " + nome + " está incorreto!");
		}
		
		
	}
	
	public void setPeso(double peso) {
		if(peso >= 40) {
			this.peso = peso;
		} else {
			System.out.println("O peso do(a) paciente " + nome + " deve ser maior ou igual a 40!");
		}
	}
	
	public void calcularIdade() {
		
	}
	
	public void calcularImc() {
		imc = peso / Math.pow(altura, 2);
	}
	
	public void classificarImc() {
		
	}
	
	public void mostrarFichaPaciente() {
		calcularImc();
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("IMC: " + imc);
		System.out.println("Telefone: " + telefone);
		System.out.println("Data nasc.: " + dataNascimento);
		System.out.println("Dia nasc: " + obterDiaSemanaNascimento());
		System.out.println("Internado: " + estaInternado);
		System.out.println("------------------------");
	}
	
	private String obterDiaSemanaNascimento() {
		String diaSemana = dataNascimento.getDayOfWeek().toString();
		return diaSemana;
	}

}
