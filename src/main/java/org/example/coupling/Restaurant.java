package org.example.coupling;

public class Restaurant {

    GingerTea gingerTea = new GingerTea();
    LemonTea lemonTea = new LemonTea();

    public void orderSomething()
    {
        lemonTea.display();
        gingerTea.display();
    }
}
