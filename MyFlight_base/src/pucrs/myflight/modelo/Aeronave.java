package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;

public class Aeronave implements Imprimivel,Contavel,Comparable<Aeronave>{
	private String codigo;
	private String descricao;
	private int capacidade;
	private int cont = 0;
	private ArrayList<Aeronave> aeronaves;

	public Aeronave(String codigo, String descricao, int capacidade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = capacidade;
		cont = cont + 1;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getCapacidade(){
		return capacidade;
	}

	@Override
	public int qtdObjCriados() {
		return cont;
	}

	@Override
	public void imprimir() {
		System.out.println(codigo + " - " + descricao);
	}

	@Override
	public int compareTo(Aeronave outra) {
		return descricao.compareTo(outra.descricao);
	}

	public void ordenaDescricao() {
        Collections.sort(aeronaves);
    }
}