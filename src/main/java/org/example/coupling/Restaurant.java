package org.example.coupling;

public class Restaurant {

    //THis is an example of tight coupling because if i will have to add more tea types i will have to create there objects here and use accordingly

    GingerTea gingerTea = new GingerTea();
    LemonTea lemonTea = new LemonTea();

    public void orderSomething(String choice)
    {
        if(choice.equalsIgnoreCase("Lemon"))
            lemonTea.display();
        else
            gingerTea.display();
    }
}
