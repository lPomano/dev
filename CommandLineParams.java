/**
 * Created by User on 01.10.2016.
 */
public class HelloName
{
    public static void main(String[] args)
    {
        for(int i = args.length - 1; i >= 0; i--)
        {
            System.out.println("Аргумент " + i + " = " + args[i]);
        }
    }
}
