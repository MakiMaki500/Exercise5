/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5;

/**
 *
 * @author PHOTON
 */
import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name="parameter";
    this.earnings=0;
    // Initialize itemList as a new ArrayList
    ArrayList<Item> itemList = new ArrayList();
    // add 'this' store to storeList
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if (index>=0 || index < itemList.size()){
        Item i= Item.getItem(index);
        earnings += i.getCost();
        System.out.printf("Item %s has been sold for %s.", i.getName(), i.getCost());
    }else{
        System.out.printf("There are only %s items in the store", itemList.size());
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean found = false;
    for(Item p : itemList) {
        if(p.getName().equals(name)){
            found = true;
            earnings += p.getCost();
            System.out.printf("Item %s has been sold for %s.", p.getName(), p.getCost());
        }
    }
    if(!found) System.out.printf("No Item in the store named %s.\n", name);
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean found = false;
    for(Item p : itemList) {
        if(itemList.contains(p)){
            found = true;
            earnings += p.getCost();
            System.out.printf("Item %s has been sold for %s.", p.getName(), p.getCost());
        }
    }
    if(!found) System.out.printf("No Item in the store named %s.\n", name);
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.println("This is the list of all items of this type.");
    boolean found = false;
    for(Item i : itemList){
        if(i.getType().equals(type)){
            found = true;
            System.out.printf("-%s",i.getName());
        }
    }
    if(!found) System.out.println("No Item in the store with this type.");
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'

  }
}
