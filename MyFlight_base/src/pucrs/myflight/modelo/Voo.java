package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Voo {

	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;

	public Voo(LocalDateTime datahora) {
		this.datahora = datahora;
		this.status = status.CONFIRMADO;
	}

	public Voo(Rota rota, LocalDateTime datahora, Duration duracao) {
		this.datahora = datahora;
		this.rota = rota;
		this.status = status.CONFIRMADO;
	}

	public LocalDateTime getDatahora() {
		return datahora;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status novo) {
		this.status = novo;
	}

	public abstract Rota getRota();

	public abstract Duration getDuracao();

}