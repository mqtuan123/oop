package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0; 


    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
        if (itemsOrdered[i] == disc) {
            // Dịch chuyển các phần tử phía sau lên 1 ô
            for (int j = i; j < qtyOrdered - 1; j++) {
                itemsOrdered[j] = itemsOrdered[j + 1];
            }
            itemsOrdered[qtyOrdered - 1] = null;
            qtyOrdered--; 
            System.out.println("The disc has been removed");
            return;
        }
    }
    System.out.println("The disc is not in the cart");
    }


    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
   
    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
    for (DigitalVideoDisc dvd : dvds) {
        addDigitalVideoDisc(dvd);
    }
}
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    addDigitalVideoDisc(dvd1);
    addDigitalVideoDisc(dvd2);
}
    public void print() {
    System.out.println("***********************CART***********************");
    System.out.println("Ordered Items:");
    
    for (int i = 0; i < qtyOrdered; i++) {
        
        System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
    }
    
    System.out.println("Total cost: " + totalCost() + " $");
    System.out.println("***************************************************");
}
public void searchById(int id) {
    boolean found = false;
    for (int i = 0; i < qtyOrdered; i++) {
        if (itemsOrdered[i].getId() == id) {
            System.out.println("Found match for ID " + id + ": " + itemsOrdered[i].toString());
            found = true;
            break; 
        }
    }
    if (!found) {
        System.out.println("No DVD found with ID: " + id); 
    }
}
public void searchByTitle(String title) {
    boolean found = false;
    for (int i = 0; i < qtyOrdered; i++) {
        if (itemsOrdered[i].isMatch(title)) {
            System.out.println("Found match for title '" + title + "': " + itemsOrdered[i].toString());
            found = true;
        }
    }
    if (!found) {
        System.out.println("No DVD found with title containing: " + title); 
    }
}
}
