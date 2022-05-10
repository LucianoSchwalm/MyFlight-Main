package pucrs.myflight.consoleApp;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.Rota;
import pucrs.myflight.modelo.Voo;
import pucrs.myflight.modelo.VooEscalas;
import pucrs.myflight.modelo.VooVariasEscalas;

public class App {

	public static void main(String[] args) {

		Geo g1 = new Geo(29.9939, 51.1711);
		Geo g2 = new Geo(23.4356, 46.4731);
		Geo g3 = new Geo(38.7742, 9.1342);
		Geo g4 = new Geo(25.7933, 80.2906);		

		CiaAerea c1 = new CiaAerea("JJ", "LATAM Linhas Áereas");
		CiaAerea c2 = new CiaAerea("G3", "Gol Linhas Aéreas SA");
		CiaAerea c3 = new CiaAerea("TP", "TAP Portugal");
		CiaAerea c4 = new CiaAerea("AD", "Azul Linhas Aéreas");

		Aeronave a1 = new Aeronave("733", "Boeing 737-300", 140);
		Aeronave a2 = new Aeronave("73G", "Boeing 737-700", 126);
		Aeronave a3 = new Aeronave("380", "Airbus Industrie A380", 644);
		Aeronave a4 = new Aeronave("764", "Boeing 767-400", 304);

		Aeroporto ap1 = new Aeroporto("POA", "Salgado Filho Intl Apt", g1);
		Aeroporto ap2 = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", g2);
		Aeroporto ap3 = new Aeroporto("LIS", "Lisbon", g3);
		Aeroporto ap4 = new Aeroporto("MIA", "Miami International Apt", g4);

		Rota r1 = new Rota(c2, ap2, ap1, a1);
		Rota r2 = new Rota(c2, ap1, ap2, a1);
		Rota r3 = new Rota(c3, ap4, ap3, a2);
		Rota r4 = new Rota(c1, ap2, ap4, a3);

		Voo v1 = new Voo(r2, LocalDateTime.of(2016, 8, 10, 8, 0),Duration.ofMinutes(90));
		System.out.println("v1 --> " + v1);
		Voo v2 = new Voo(r1, LocalDateTime.of(2016, 8, 10, 15, 0),Duration.ofHours(2));
		System.out.println("v2 --> " + v2);
		Voo v3 = new Voo(r3, LocalDateTime.of(2016, 8, 15, 12, 0),Duration.ofHours(2));
		System.out.println("v3 --> " + v3);
		Voo v4 = new Voo(r4, Duration.ofHours(2));
		System.out.println("v4 --> " + v4);

		System.out.println(Geo.distancia(ap1.getLocal(), ap2.getLocal()));
		System.out.println(ap1.getLocal().distanciaPara(ap2.getLocal()));

		System.out.println("Total de empresas: "+ CiaAerea.getTotalCias());

	}
}