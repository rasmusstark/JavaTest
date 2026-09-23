package Vecka2Övningar;

public class WeatherReportObject {
    public static void main (String[] args) {

        WeatherReport weather1 = new WeatherReport(2, "Kallt");
        WeatherReport weather2 = new WeatherReport(25, "Varmt");

        System.out.println(weather1.getDescription());
        System.out.print(weather2.getDescription());

    }

}
