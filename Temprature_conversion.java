package task1;

import java.util.Scanner;

public class Temprature_conversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("************TEMPERATURE CONVERTOR PROGRAM***********");
		
		System.out.println("Enter the Temperature Value :");
		double Temperature = sc.nextDouble();
		
		System.out.println("Enter the Original unit of Measurement :"); 
		System.out.println("1. Celsius");
		System.out.println("2. Fahrenheit");
		System.out.println("3. Kelvin");
		
		System.out.println("Enter Your choice :");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
		{
			System.out.println("Temperature Converted into Fahrenheit : " + CelsiusToFahrenheit(Temperature));
			System.out.println("Temprature Converted into Kelvin :" + CelsiusToKelvin(Temperature));
			System.out.println();
			System.out.println("*****************************************************");
			break;
		}
		case 2:
		{
			System.out.println("Temperature Converted into Celsius : " + FahrenheitToCelsius(Temperature));
			System.out.println("Temprature Converted into Kelvin :" + FahrenheitToKelvin(Temperature));
			System.out.println();
			System.out.println("*****************************************************");
			break;
		}
		case 3:
		{
			System.out.println("Temperature Converted into Celsius : " + KelvinToCelsius(Temperature));
			System.out.println("Temprature Converted into Fahrenheit :" + KelvinToFahrenheit(Temperature));
			System.out.println();
			System.out.println("******************************************************");
			break;
		}
		case 4:
		{
			System.out.println("Exit Successfully...Thank You..!");
			break;
		}
	    default:
		{
			System.out.println("Invalid Unit...! Please enter in Celsius, Fahrenheit or Kelvin");
		}
	}
		
		sc.close();
	}
		
/////////////////////////////////////////////////////////////////////
	
	//Celsius to fahrenheit and kelvin conversion
	
	public static double CelsiusToFahrenheit(double Celsius)
	{
	   return (Celsius * 9/5) + 32;
	}
	public static double CelsiusToKelvin(double Celsius)
	{
	   return Celsius + 272.15;	
	}
	
////////////////////////////////////////////////////////////////////////	
	
	//Fahrenheit to Celsius and kelvin conversion
	
	public static double FahrenheitToCelsius(double Fahrenheit)
	{
		return (Fahrenheit - 32) * 5/9;
	}
	public static double FahrenheitToKelvin(double Fahrenheit)
	{
		return (Fahrenheit + 459.67) * 5/9;
	}
	
/////////////////////////////////////////////////////////////////////////
	
	//Kelvin to Celsius and Fahrenheit conversion
	
	public static double KelvinToCelsius(double Kelvin)
	{
		return Kelvin - 273.15;
	}
	public static double KelvinToFahrenheit(double Kelvin)
	{
		return Kelvin * 9/5 - 459.67;
	}
}

/////////////////////////////////////////////////////////////////////////
