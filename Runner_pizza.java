package lab7_assign;
public class Runner_pizza {
    public static void main(String[] args)
    {
        Pizza p1 = new Pizza("large", 3, 2, 1);
        Pizza p2 = new Pizza("small", 2, 0, 0);
        Pizza p3 = new Pizza("medium", 1, 1, 1);
        System.out.println(p1.getDescription());
        System.out.println(p2.getDescription());
        System.out.println(p3.getDescription());
	}
}