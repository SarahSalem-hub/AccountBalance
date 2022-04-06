public class Trains {
    public String rushHour(Double time)
    {
        if (time <= 24.00)
        {
            if (time <= 9.30 )
                return "pay full fare";
            if (time >= 16.00 && time <= 19.30)
                return "pay full fare";
            else
                return "A saver ticket is available";
        }
        return "invalid time";
    }
}
