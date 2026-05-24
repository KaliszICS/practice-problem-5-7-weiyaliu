/**
	* Lesson: ArrayLists
	* Author: Weiya
	* Date Created: May 10, 2026
	* Date Last Modified: May 23, 2026
	*/

import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	//1.
	public static void swap (ArrayList<String> list, int index1, int index2) {
	    
	    String temp = list.get(index1);
	    
	    list.set(index1, list.get(index2));
	    
	    list.set (index2, temp);
	}

	//2.
	public static ArrayList<Double> createArrayList(double[ ] arr) {
	    
	    ArrayList<Double> list = new ArrayList<Double>();
	    
	    for (int i= 0; i< arr.length; i++) {
	        list.add(arr[i]);
	    }
	    
	    return list;
	}

	//3.
	public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
	    
        ArrayList<Integer> merged = new ArrayList<Integer>();

        for (int i= 0; i< list1.size(); i++) {
            merged.add(list1.get(i));
        }
        
        for (int i= 0; i< list2.size(); i++) {
            merged.add(list2.get(i));
        }
        
        return merged;
	}
}
