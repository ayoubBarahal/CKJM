package library.service;

import library.model.Lendable;


public interface ILibrary
{
    void addItem(Lendable item);
    void listAllItems();

}