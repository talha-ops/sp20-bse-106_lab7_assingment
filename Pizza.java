package lab7_assign;
public class Pizza {
    private String PizzaSize;
    private int CheeseCount;
    private int PepperoniCount;
    private int HamCount;
    public Pizza()
    {
        this.PizzaSize = "";
	this.CheeseCount = 0;
	this.PepperoniCount = 0;
	this.HamCount = 0;
    }
    public Pizza(String pizzaSize, int cheeseCount,int pepperoniCount, int hamCount)
    {
        this.PizzaSize = pizzaSize;
        this.CheeseCount = cheeseCount;
	this.PepperoniCount = pepperoniCount;
	this.HamCount = hamCount;
    }
    public String getPizzaSize()
    {
        return PizzaSize;
    }
    public void setPizzaSize(String pizzaSize)
    {
        this.PizzaSize = pizzaSize;
    }
    public int getNumCheeseToppings()
    {
        return CheeseCount;
    }
    public void setNumCheeseToppings(int cheeseCount)
    {
        this.CheeseCount = cheeseCount;
    }
    public int getNumPepperoniToppings()
    {
        return PepperoniCount;
    }
    public void setNumPepperoniToppings(int pepperoniCount)
    {
        this.PepperoniCount = pepperoniCount;
    }
    public int getNumHmaToppings()
    {
        return HamCount;
    }
    public void setNumHmaToppings(int hamCount)
    {
        this.HamCount = hamCount;
    }
    public double calcCost()
    {		
        if(PizzaSize.equalsIgnoreCase("small"))
        {
            return 10 + (CheeseCount + PepperoniCount + HamCount) * 2;
        }
        else if(PizzaSize.equalsIgnoreCase("medium"))
        {
            return 12 + (CheeseCount + PepperoniCount + HamCount) * 2;
        }
        else if(PizzaSize.equalsIgnoreCase("large"))
        {
            return 14 + (CheeseCount + PepperoniCount + HamCount) * 2;
        }
        else
        {
            return 0.0;
        }
    }
    public String getDescription()
    {
        return "Pizza size: "+PizzaSize+"\nCheese toppings: "+CheeseCount+"\nPepperoni toppings: "+PepperoniCount+"\nHam toppings: "+HamCount+"\nPizza cost: $"+calcCost()+"\n";
    }
}