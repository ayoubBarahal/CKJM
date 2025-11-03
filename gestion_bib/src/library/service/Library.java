package library.service;

import java.util.ArrayList;
import java.util.List;

import library.model.*;

public class Library implements ILibrary
{
    private List<Lendable> items;

    public Library()
    {
        items = new ArrayList<>();
    }

    public void addItem(Lendable item)
    {
        items.add(item);
    }



    public void listAllItems()
    {
        for (Lendable item : items) {
            if (item instanceof  Book){
                item.displayInfo();
            }
            else {
                System.out.println("Unknown item type");
            }
        }
    }

}