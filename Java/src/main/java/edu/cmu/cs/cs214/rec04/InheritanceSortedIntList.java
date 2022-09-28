package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */
public class InheritanceSortedIntList extends SortedIntList {
  private int numAdded = 0;

  @Override
  public boolean add(int num) {
    numAdded += 1;
    return super.add(num);
  }

/*   do not need to override addAll because of inheritance, in the Abstract class of addAll, function calls add, so by overriding add function you are overriding addAll function as well */

  // @Override
  // public boolean addAll(edu.cmu.cs.cs214.rec04.IntegerList list) {
    // int added = list.size();
    // numAdded += added;
  //   return super.addAll(list);
  // }

  public int getTotalAdded() {
    return numAdded;
  }

}