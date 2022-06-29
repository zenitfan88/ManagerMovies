package ru.netology.domain;

public class ManagerMovies {
    private int amountMovies;
    private PurchaseItem[] items = new PurchaseItem[0];

    public void save(PurchaseItem item) {
        int length = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lostIndex = tmp.length - 1;
        tmp[lostIndex] = item;
        items = tmp;
    }

    public PurchaseItem[] findAll() {
        PurchaseItem[] findAll = new PurchaseItem[items.length];
        System.arraycopy(items, 0, findAll, 0, items.length);
        return findAll;
    }

    public ManagerMovies() {
    }

    public ManagerMovies(int amountMovies) {
        this.amountMovies = amountMovies;
    }

    public PurchaseItem[] findLast() {
        this.amountMovies = amountMovies;
        int resultLength;
        if (amountMovies > 0) {
            resultLength = amountMovies;
        } else {
            resultLength = 10;
        }
        if (items.length <= resultLength) {
            resultLength = items.length;
        }
        PurchaseItem[] findLast = new PurchaseItem[resultLength];
        for (int i = 0; i < findLast.length; i++) {
            int index = findLast.length - i - 1;
            findLast[i] = items[index];
        }
        return findLast;
    }
}



