aapackage oop.practice;

public abstract class abstraction_main
{
    private String name;
    private int paymentPerHour;

    public abstraction_main(String name,int paymentPerHour)
    {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public abstract int calculateSalary();

    public String getName()
    {
        return name;
    }

    public int getPaymentPerHour()
    {
        return paymentPerHour;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPaymentPerHour(int paymentPerHour)
    {
        this.paymentPerHour = paymentPerHour;
    }
}
