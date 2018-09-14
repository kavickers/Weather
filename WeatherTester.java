
/**
 * Write a description of class StringTester here.
 *
 * @author (Kyle Vickers)
 * @version (09.12.18)
 */
public class WeatherTester
{
    public static void main()
    {
        //String weatherCondition = "severe thunderstorms";
        //String weatherCondition = "scattered thunderstorms";
        
        //System.out.println(weatherCondition.length());
        //System.out.println(weatherCondition.substring(0,5));
        //System.out.println(weatherCondition.indexOf("thunder"));
        
        //String weatherCondition1 = "mixed rain and snow";
        //String weatherCondition2 = "mixed rain and snow";
        
        //boolean result1 = (weatherCondition1 == weatherCondition2);
        //boolean result2 = (weatherCondition1.equals(weatherCondition2));
        //System.out.println(result1);
        //System.out.println(result2);
        
        
        WeatherConditional weather = new WeatherConditional(34, "sunny");
        WeatherConditional weather1 = new WeatherConditional(32, "windy");
        WeatherConditional weather2 = new WeatherConditional(33, "snow");
        WeatherConditional weather3 = new WeatherConditional(30, "snow");
        WeatherConditional weather4 = new WeatherConditional(30, "windy");
        
        
        
        
        System.out.println(weather.getResult());
        System.out.println(weather1.getResult());
        System.out.println(weather2.getResult());
        System.out.println(weather3.getResult());
        System.out.println(weather4.getResult());
        
        
    }
}
