package Week2Assignments;

public class TemperatureConverter {
	
	double valueToConvert;
	
	public double celsiumToFahreinheit(double value)
	{
		this.valueToConvert=value;
		value=valueToConvert*9/5+32;
		
		return value;
		
	}
	
	public double celsiumToKelvin(double value)
	{
		this.valueToConvert=value;
		value=valueToConvert+273.15;
		
		return value;
		
		
	}
	
	public double fahreinheitToCelsius(double value)
	{
		
		this.valueToConvert=value;
		value=((valueToConvert-32)*5)/9;
		
		return value;
		
	}
	
	public double fahreinheitToKelvin(double value)
	{
		this.valueToConvert=value;
		value=(valueToConvert-32)*5/9+273.15;
		
		return value;
		
	}
	
	public double kelvinToCelsius(double value)
	{
		this.valueToConvert=value;
		value=valueToConvert-273.15;
		
		return value;
		
	}
	
	public double kelvinToFahreinheit(double value)
	{
		this.valueToConvert=value;
		value=(valueToConvert-273.15)*9/5+32;
		
		return value;
		
	}

}
