package edu.cmu.cs.cs214.rec04;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the DelegationSortedIntList class.
 *
 * @author Nora Shoemaker
 *
 */
public class DelegationSortedIntListTest {
    //Write you tests below

    @Test
    public void testAdd() {
        DelegationSortedIntList sortedList = new DelegationSortedIntList();
        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(3);
        assertEquals(3, sortedList.getTotalAdded());
    }

    @Test
    public void testAddAll() {
        DelegationSortedIntList sortedList = new DelegationSortedIntList();
        IntegerList list = new SortedIntList();
        list.add(1);
        list.add(2);
        list.add(3);
        sortedList.addAll(list);

        assertEquals(3, sortedList.getTotalAdded());
    }


    /**
     * A helper function that prints out the contents of an IntegerList.
     * @param list IntegerList to be printed out.
     */
    private void printList(IntegerList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }

}