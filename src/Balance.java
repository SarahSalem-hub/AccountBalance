public class Balance {

    public String account (int x){
        if (x < 0)
        {
            return "Invalid";
        }
        if (x <= 100)
        {
            return "3%";
        }

        if (x <= 1000)
        {
            return "5%";
        }

        else
            return "7%";
    }

}
