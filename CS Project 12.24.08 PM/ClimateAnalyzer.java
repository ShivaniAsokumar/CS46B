package climatechange;

import java.io.*;
import java.util.*;

public class ClimateAnalyzer extends WeatherIO implements IClimateAnalyzer{
	
	public ClimateAnalyzer() {
		
	}
	
	//Hashmap for the months
	public HashMap<Integer,String> getMap(){
		HashMap<Integer,String> monthMap = new HashMap<>();
		String[] months = {"January", "February", "March","April","May","June","July","August","September",
			"October","November","December"
		};
		
		//Loops through the hashMap and then maps them to the corresponding month value.
		int i = 1;
		for(String month : months) {
			monthMap.put(i, month);
			i++;
		}
		//System.out.println(Arrays.asList(monthMap));
		return monthMap;
	}
	
	
	// TASK A-1
    // for all data that matches the specified month, get the lowest temperature reading
	public ITemperature getLowestTempByMonth(String country, int month) {
		HashMap<Integer,String> map = this.getMap();
		
		ArrayList<ITemperature> result = super.readDataFromFile("world_temp_2000-2016.csv");
		
		ArrayList<ITemperature> data = new ArrayList<>();
		String monthName = map.get(month);
		
		for(ITemperature temp : result) {
			if(temp.getMonth() == monthName) {
				data.add(temp);
			}
		}
		
		System.out.println(data);
		
		
		
		return null;
	}
	 
	// TASK A-1
	// for all data that matches the specified month, get the highest temperature reading
	public ITemperature getHighestTempByMonth(String country, int month) {
		 
	}
	 
	// TASK A-2
	// for all data that matches the specified year, get the lowest temperature reading
	public ITemperature getLowestTempByYear(String country, int year) {
		 
	}
	 
	public ITemperature getHighestTempByYear(String country, int year) {
		 
	}
	 
	 
	 // TASK A-2
	 // for all data that matches the specified year, get the highest temperature reading
	public TreeSet<ITemperature> getTempWithinRange(String country, double rangeLowTemp, double rangeHighTemp){
		 
	}
	 // TASK A-3
	 // get all temperature data that fall within the given temperature range
	 // the set is sorted from lowest to highest temperature
	 // input parameter values are in Celsius
	public ITemperature getLowestTempYearByCountry(String country) {
		 
	}
	 // TASK A-4
	 // 1. get the lowest temperature reading amongst all data for that country
    public ITemperature getHighestTempYearByCountry(String country) {
		 
	}
	 // TASK A-4
	 // 1. get the highest temperature reading amongst all data for that country
	public ArrayList<ITemperature> allCountriesGetTop10LowestTemp(int month){
		 
	}
	 // TASK B-1
	 // 1. the return list is sorted from lowest to highest temperature
	public ArrayList<ITemperature> allCountriesGetTop10HighestTemp(int month){
		 
	}
	 // TASK B-1
	 // 1. the return list is sorted from lowest to highest temperature
	public ArrayList<ITemperature> allCountriesGetTop10LowestTemp(){
		 
	}
	 // TASK B-2
	 // 1. the return list is sorted from lowest to highest temperature
	public ArrayList<ITemperature> allCountriesGetTop10HighestTemp(){
		 
	}
	 // TASK B-2
	 // 1. the return list is sorted from lowest to highest temperature
	public ArrayList<ITemperature> allCountriesGetAllDataWithinTempRange(double lowRangeTemp,double highRangeTemp){
		 
	}
	 // TASK B-3
	 // 1. the return list is sorted from lowest to highest temperature
	public ArrayList<ITemperature> allCountriesTop10TempDelta(int month, int year1, int year2){
		 
	}
	 // TASK C-1
	 // 1. the countries with the largest temperature differences (absolute value)
	 // 2. the return list is sorted from lowest to highest temperature delta
	public void runClimateAnalyzer() {
		 
	}
	 // 1. This method starts the climate-change task activities
	 // 2. The ClimateChange methods must be called in the order as listed in the [description section], (first with the Task A
	 // methods, second are the Task B methods, and third are the Task C methods)
	 // 3. For each of the ClimateChange methods that require input parameters, this method must ask the user to
	 // enter the required information for each of the tasks.
	 // 4. Each ClimateAnalyzer method returns data, so the data results must be written to data files 
	
	public static void main(String[] args) {
		ClimateAnalyzer test = new ClimateAnalyzer();
		test.getLowestTempByMonth("India",1);
		//test.getMap();
	}
}
