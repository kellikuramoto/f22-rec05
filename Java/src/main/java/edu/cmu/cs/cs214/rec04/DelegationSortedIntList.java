package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

// HINT: Take a look at the UML diagram to see what DelegationSortedIntList
//       should implement.
public class DelegationSortedIntList implements IntegerList {
  private int numAdded = 0;
  private SortedIntList sortedList = new SortedIntList();

    /**
     * Adds the specified int to the list.
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    public boolean add(int num) {
      numAdded += 1;
      return sortedList.add(num);
    }

    /**
     * Adds all of the elements of the IntegerList to the list.
     *
     * @param list IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call
     */
    public boolean addAll(IntegerList list) {

    /*   need to add size to numAdded because IntegerList is an interface, therefor the implementation does not call the add function the way it does in inheritance, so you have to add numAdded manually */
      numAdded += list.size();
      return sortedList.addAll(list);
    }

    /**
     * Returns the integer at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     */
    public int get(int index) {
      return sortedList.get(index);
    }

    /**
     * Removes the first occurrence of the specified element from the list,
     * if it is present (optional operation).
     *
     * @param num an integer to be removed from the list, if present
     * @return true if an element was removed as a result of this call
     */
    public boolean remove(int num) {
      return sortedList.remove(num);
    }

    /**
     * Removes from the list all of its elements that are contained in the
     * specified IntegerList.
     *
     * @param list IntegerList containing elements to be removed from
     * the list
     * @return true if the list changed as a result of the call
     */
    public boolean removeAll(IntegerList list) {
      return sortedList.removeAll(list);
    }

    /**
     * Returns the number of elements in this list. If this list contains
     * more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
     *
     * @return number of elements in the list
     */
    public int size() {
      return sortedList.size();
    }

    public int getTotalAdded() {
      return numAdded;
    }


}