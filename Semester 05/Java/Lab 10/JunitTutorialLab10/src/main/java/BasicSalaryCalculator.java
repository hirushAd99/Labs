public class BasicSalaryCalculator {
    private double basicsalary;
    public double getBasicSalary()
    {
        return basicsalary;
    }
    public void setBasicSalary(double basicsalary)
    {
        if(basicsalary<0)
        {
            throw new IllegalArgumentException("Negative salary is invalid.");
        }
        this.basicsalary = basicsalary;
    }
    public double getGrossSalary()
    {
        return this.basicsalary+getSocialInsurance()+getAdditionalBonus();
    }
    public double getSocialInsurance()
    {
        return this.basicsalary*0.25;
    }
    public double getAdditionalBonus()
    {
        return this.basicsalary*0.1;
    }
}
