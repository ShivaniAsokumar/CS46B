package climatechange;

import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class WeatherIO implements IWeatherIO{
	
	public WeatherIO() {
		
	}
	
	// read all data from the weather data file
	public ArrayList<ITemperature> readDataFromFile(String fileName){
		ArrayList<ITemperature> answer = new ArrayList<>();
		String[] weatherCollector = new String[5];
		
		try {
			File weather = new File("data/" + fileName);
			Scanner scan = new Scanner(weather);
			String input = scan.nextLine();
			while(scan.hasNextLine()) {
				input = scan.nextLine();
				String data = input.replaceAll("\\s+", "");
				
				weatherCollector = data.split(","); //The data is collected to array. 
				
				//Collect the data from weatherCollector to be inputed to Temperature.
				double temperature = Double.valueOf(weatherCollector[0]);
				int year = Integer.valueOf(weatherCollector[1]);
				String month = weatherCollector[2];
				String country = weatherCollector[3];
				String countryCode = weatherCollector[4];
				
				
				Temperature temp = new Temperature(temperature, year, month, country, countryCode);
				answer.add(temp);
				
				
				
				
			}
		}
		catch (FileNotFoundException e){
			System.out.println("File not found. Please check the file name");
			e.printStackTrace();
		}
		
		
		return answer;
		
	}
	 
	// 1. write the subject header before dumping data returned from each ClimateAnalyzer method
    // 2. a subject header is to be written for each ClimateAnalyzer method call
	public void writeSubjectHeaderInFile(String filename, String subject) {
		
	}
	 
	// 1. file name should be called “taskXX_climate_info.csv” where XX will be replaced by the task id: A1, A2, etc
	// 2. use this method to store the temperature info (for each Climate Analyzer task)
	// a) one row for each temperature data object (i.e. all fields in one row (each comma delimited) )
	// b) similar to the original input data file)
	// 3. temperature value should be formatted to use a maximum of 2 decimal places
	// 4. temperature field should also show the Fahrenheit value (using decimal rules above)
	// a) the temperature field should look like i.e. 21.34(C) 70.42(F)
	public void writeDataToFile(String filename, String topic, ArrayList<ITemperature> theWeatherList) {
		
	}
	 
	
	public static void main(String[] args) {
		WeatherIO test = new WeatherIO();
		test.readDataFromFile("world_temp_2000-2016.csv");
		
	}
	
	
	

}
