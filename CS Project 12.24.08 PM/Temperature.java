package climatechange;

public class Temperature implements ITemperature{
	private double temperature;
	private int year;
	private String month;
	private String country;
	private String countryCode;
	public Temperature(double temperature, int year, String month, String country, String countryCode) {
		this.temperature = temperature;
		this.year = year;
		this.month = month;
		this.country = country;
		this.countryCode = countryCode;
	}
	// get the name of the country
	public String getCountry() {
		return country;
	}
	
	// get the 3-letter code of the country
	public String getCountry3LetterCode() {
		return countryCode;
	}
	
	// get the month
	public String getMonth() {
		return month;
	}
	
	// get the year
	public int getYear() {
		return year;
	}
	
	// get temperature; input parameter of false = return Celsius value)
	public double getTemperature(boolean getFahrenheit) {
		if(getFahrenheit) {
			double answer = (9.0/5.0) * this.temperature + 32;
			return answer;
		} 
		return this.temperature;
	}
	
}
