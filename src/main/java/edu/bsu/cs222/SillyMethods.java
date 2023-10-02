package edu.bsu.cs222;

public class SillyMethods
{

    public boolean didGuess42(int i)
    {
        return i == 42;
    }

    public String countTo(int i)
    {
        StringBuilder result = new StringBuilder("0");
        for(int x = 1; x <= i ; x++)
        {
            result.append(" ").append(x);
        }
        return result.toString();
    }
}
