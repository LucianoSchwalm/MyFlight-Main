package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorRotas{
    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        rotas = new ArrayList<>();
    }

    public void adicionar(Rota rota){
        rotas.add(rota);
    }

    public ArrayList<Rota> listarTodas(){
        return rotas;
    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto orig){
        ArrayList<Rota> origem = new ArrayList<>();
        for(Rota each : rotas){
            if(each.getOrigem().equals(orig)){
                origem.add(each);
            }
        }
        return rotas;
    }

    public void ordenaDescricao() {
        Collections.sort(rotas);
    }
}