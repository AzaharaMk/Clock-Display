
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay hours;
    private NumberDisplay minutes;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
       hours = new NumberDisplay(24);
       minutes = new NumberDisplay(60);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void fijarHora(int newHours, int newMinutes)
    {
        hours.setValue(newHours);
        minutes.setValue(newMinutes);
        
        
    }
    
    public void avanzarHora()
    {
    }
    
    public String devolverHora()
    {
        return "";
    }
}
