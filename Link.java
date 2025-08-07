class Link {
    public int value; // integer data
    public Link next; // reference to next link
}

class LinkList {
    private Link first; // reference to first Link on list

    public LinkList() {
        first = null;
    }

    public static Link getnode(int value) {
        Link n = new Link();
        n.value = value;
        n.next = null;
        return n;
    }

    public void insertFirst(int value) {
        Link newLink = getnode(value);
        newLink.next = first; // it points to old first link
        first = newLink; // now first points to this
    }

    public boolean islempty() {
        return (first == null);
    }

    public void printlst() {
        Link ptr = first;
        while (ptr != null) {
            System.out.print(ptr.value + " ");
            ptr = ptr.next; // next node
        }
        System.out.println(); // print new line after list
    }

    // Method to find the index of the maximum value in the list
    public int findMax() {
        if (islempty()) {
            return -1; // List is empty
        }

        Link current = first;
        int maxIndex = 0;
        int maxVal = current.value;
        int currentIndex = 0;

        while (current != null) {
            if (current.value > maxVal) {
                maxVal = current.value;
                maxIndex = currentIndex;
            }
            current = current.next;
            currentIndex++;
        }

        return maxIndex;
    }

    // Method to remove the node with the maximum value
    public Integer removeMax() {
        if (islempty()) {
            return null; // Don't print anything if the list is empty
        }

        int maxIndex = findMax();
        Link current = first;
        Integer removedValue = null;
        

        if (maxIndex == 0) {
            removedValue = first.value;
            first = first.next;
        } else {
            for (int i = 0; i < maxIndex - 1; i++) {
                current = current.next;
            }
            removedValue = current.next.value;
            current.next = current.next.next;
        }

        System.out.println(removedValue + " has been removed."); // Print removal message
        return removedValue;
    }
}


public class LinkedList {
    public static void main(String[] args) {
        LinkList numlist = new LinkList();

        numlist.insertFirst(28);
        numlist.insertFirst(96);
        numlist.insertFirst(75);
        numlist.insertFirst(162);

        numlist.printlst(); // Print initial list
        numlist.removeMax(); // Remove max and print messages
        numlist.printlst(); // Print list after removal
    }
}
