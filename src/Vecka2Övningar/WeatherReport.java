package Vecka2Övningar;

public class WeatherReport {

    int temperature;
    String description;


    public WeatherReport(int myTemperature, String myDescription) {
        this.temperature = myTemperature;
        this.description = myDescription;

    }

    public String getDescription() {
        return description;
    }

}


