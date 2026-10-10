package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {
    // Instance method to convert Celsius to Fahrenheit
     public double temperatureFahrenheit() {
         return temperatureCelsius*9/5+32;
     }

       // Instance method to get a formatted summary string
     public String getSummary() {
        return String.format("Current weather:%.1f °C (%.1f°F) and %s",temperatureCelsius,temperatureFahrenheit(),conditions) ;
     }


    // Static factory method to create a WeatherData record from Fahrenheit
     public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
          double celsius = (tempFahrenheit-32)*5/9 ;
          return new WeatherData(celsius,conditions);
    }

     public static void main(String[] args) {
         WeatherData w1 = new WeatherData(25.0,"Sunny");
         WeatherData w2 = new WeatherData(10.0,"Cloudy");
         System.out.println("Current weather : "+w1.getSummary());
         System.out.println("Yesterday's weather : "+w2.getSummary());
      }
      }
