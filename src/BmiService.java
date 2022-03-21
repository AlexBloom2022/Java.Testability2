public class BmiService {
    public int calculate(int wight, double high)
    {
        return (int) (wight / (high * high));
    }
}
