public class Car
{
    private double milesDriven;
    private double gasInTank;

    public void drive(double distance)
    {
        milesDriven = milesDriven + distance;
    }

    public void addGas(double amount)
    {
        gasInTank = gasInTank + amount;
    }

    // More methods...
}
