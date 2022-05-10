package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;

	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia){
		empresas.add(cia);
	}

	public ArrayList<CiaAerea> listarTodas(){
		return empresas;
	}

	public CiaAerea buscarCodigo(String cod){
		for(CiaAerea busca : empresas){
			if(busca.getCodigo().equals(cod)){
				return busca;
			}
		}
		return null;
	}

	public CiaAerea buscarNome(String nome){
		for(CiaAerea busca : empresas){
			if(busca.getNome().equals(nome)){
				return busca;
			}
		}
		return null;
	}
}