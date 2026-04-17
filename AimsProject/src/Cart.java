public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full. Cannot add more items.");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added.");
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int tmp = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(disc.getTitle())) {
                tmp = i;
                break;
            }
        }
        if (tmp == -1) {
            System.out.println("The disc is not found");
            return;
        }
        for (int i = tmp; i < qtyOrdered - 1; i++) {
            itemsOrdered[i] = itemsOrdered[i + 1];
        }
        itemsOrdered[qtyOrdered - 1] = null;
        qtyOrdered--;
        System.out.println("The disc has been removed");
    }
    
    public float totalCost() {
        float s = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            s += itemsOrdered[i].getCost();
        }
        return s;
    }
}
