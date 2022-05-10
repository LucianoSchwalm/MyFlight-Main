package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;

	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public static double distancia(Geo origem, Geo destino){
		double diferenca = 2 * 6371 * 
		Math.sqrt(Math.pow(Math.sin((Math.toRadians(origem.getLatitude()) - Math.toRadians(destino.getLatitude()))/2), 2) +
		 Math.pow(Math.sin((Math.toRadians(origem.getLongitude()) - Math.toRadians(destino.getLongitude()))/2), 2) * 
		 Math.cos(Math.toRadians(origem.getLatitude())) * Math.cos(Math.toRadians(destino.getLatitude())));

		 return diferenca;
	}

	public double distanciaPara(Geo compara){
		double diferenca = 2 * 6371 * 
		Math.sqrt(Math.pow(Math.sin((Math.toRadians(getLatitude()) - Math.toRadians(compara.getLatitude()))/2), 2) +
		 Math.pow(Math.sin((Math.toRadians(getLongitude()) - Math.toRadians(compara.getLongitude()))/2), 2) * 
		 Math.cos(Math.toRadians(getLatitude())) * Math.cos(Math.toRadians(compara.getLatitude())));

		 return diferenca;
	}
}