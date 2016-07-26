package availableClasses;

import java.math.*;

public class Warrior {
    public Warrior(int level)
    {
        double health = 10;
        if(level <=5)
        {
            health = health * level;
        }
        else if(level > 5 && level <= 10)
        {
            health = health*level*1.25;
        }
        else if(level > 10 && level <= 15)
        {
            health = health*level*1.5;
        }
        else if(level > 15 && level <= 20)
        {
            health = Math.pow(health, 2) + (level*2);
        }
        else
        {
            health = Math.pow(health, 2) + (level*2) * 1.25;
        }
        return;
    }
}
