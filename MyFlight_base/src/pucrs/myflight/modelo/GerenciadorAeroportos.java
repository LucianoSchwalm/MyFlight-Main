package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aero){
        aeroportos.add(aero);
    }

    public ArrayList<Aeroporto> listarTodos(){
        return aeroportos;
    }

    public Aeroporto buscarPorCodigo(String cod){
        for(Aeroporto busca : aeroportos){
			if(busca.getCodigo().equals(cod)){
				return busca;
			}
		}
		return null;
    }

    public void ordenaDescricao() {
        Collections.sort(aeroportos);
    }
}