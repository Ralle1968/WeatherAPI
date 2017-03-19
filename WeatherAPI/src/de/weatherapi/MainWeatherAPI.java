package de.weatherapi;
import java.util.Scanner;

import de.weatherapi.WeatherInfo;

public class MainWeatherAPI {

	public static void main(String[] args) throws Exception {
		System.out.println("Für welche Stadt soll das Wetter abgefragt werden?");
		Scanner input = new Scanner(System.in);
		String city = input.next();
		System.out.println("Wetter wird für " + city + " abgefragt:");
		
		WeatherFetcher w= WeatherFetcher.getInstance();
		
		WeatherInfo[] weatherInfos = w.fetch(city);
		for (int x = 0; x < weatherInfos.length; x++) {
			WeatherInfo weatherInfo = weatherInfos[x];
			System.out.println("Zeit: " + weatherInfo.getTimestamp() + ": Temp: " + weatherInfo.getTemperature());
		}
	
	}

}
