package org.example.task2;

import java.util.Arrays;

public class Cart {

    public Item[] contents;
    int index;

    public Cart(Item[] contents) {
        this.contents = contents;
    }

    public void removeById(int itemIndex) {

        if (index == 0)
            return;

        if (itemIndex < 0 || itemIndex >= index) {
            return;
        }

        int foundItemIndex = findItemInArray(contents[itemIndex]);

        if (foundItemIndex == -1)
            return;

        if (foundItemIndex == index - 1) {
            contents[index - 1] = null;
            index--;
            return;
        }

        shiftArray(foundItemIndex);
    }

    public void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < index - 1; i++) {
            contents[i] = contents[i + 1];
        }
        contents[index-1] = null;
        index--;
    }

    public int findItemInArray(Item item) {
        for (int i = 0; i < index; i++) {
            if (contents[i].id == item.id) {
                return i;
            }
        }

        return -1;
    }

    public void add(Item item) {
        if (isCartFull())
            return;

        contents[index] = item;
        index++;
    }

    public boolean isCartFull() {
        return index == contents.length;
    }

    public Item[] getContents() {
        return Arrays.copyOf(contents, index);
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(contents) +
                '}' + "\n";
    }
}
