package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves(){
        aeronaves = new ArrayList<>();
    }

    public void adicionar(Aeronave aviao){
        aeronaves.add(aviao);
    }

    public ArrayList<Aeronave> listarTodas(){
        return aeronaves;
    }

    public Aeronave buscarPorCodigo(String cod){
        for(Aeronave busca : aeronaves){
			if(busca.getCodigo().equals(cod)){
				return busca;
			}
		}
		return null;
    }
}