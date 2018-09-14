
/**
 * Write a description of class WeatherConditionals here.
 *
 * @author (Kyle Vickers)
 * @version (09.12.18)
 */
public class WeatherConditional
{
    private int temperature;
    private String description;
    private boolean windy;
    
    public WeatherConditional(int temperature, String description)
    {
        this.temperature = temperature;
        this.description = description;
        if(this.description.contains("windy")) {
            windy = true;
        } else {
            windy = false;
        }
    }
    public boolean getWindy() {
        return windy;
    }
    public String getResult() {
        if(windy == false && temperature > 30) {
            return "It's safe to go outside, " + temperature + " degrees and " + description + ".";
        } else {
            return "Too windy or cold! enjoy watching the weather through the window.";
        }
    }
}
