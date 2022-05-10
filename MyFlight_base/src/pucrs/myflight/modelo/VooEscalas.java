package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo {
    private Rota rotaFinal;
    private ArrayList<Rota> rotas;

    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime dataHora, Duration duracao) {
        super(rota, dataHora, duracao);
        this.rotaFinal = rotaFinal;
    }

    public VooEscalas(ArrayList<Rota> rotas, LocalDateTime dataHora) {
        super(dataHora);
        this.rotas = rotas;
    }

    public Rota getRotaFinal() {
        return this.rotaFinal;
    }

    public ArrayList<Rota> getRotas() {
        return this.rotas;
    }

    @Override
    public String toString() {
       return super.toString() + " -> " + rotas;
    }

    @Override
    public Rota getRota() {
        return null;
    }

    @Override
    public Duration getDuracao() {
        Duration duracao = Duration.ofMinutes(0);

        for (Rota r: rotas) {
            double distancia = Geo.distancia(r.getOrigem().getLocal(), r.getDestino().getLocal());

            int duracaoMin = (int)( (distancia / 805) * 60 );

            duracaoMin = duracaoMin + 30;

            duracao = duracao.plus( Duration.ofMinutes( duracaoMin ) );
        }

        return duracao;
    }

}