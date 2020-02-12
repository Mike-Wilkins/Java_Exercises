package linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class ListManagementTool {
	
	public void printme(LinkedList<String> list) {
		System.out.printf(list + "\n\n");
	}
	
	public void removeme(LinkedList<String> list, int index) {
		list.remove(index);
		System.out.printf(list + "\n\n");
	}
	
	public void addme(LinkedList<String> list, int index, String element) {
		list.add(index, element);
		System.out.printf(list + "\n\n");
	}
	
	public void reverseme(LinkedList<String> list) {
		Collections.reverse(list);
		System.out.printf(list + "\n\n");
	}
	
	public void sortme(LinkedList<String> list) {
		Collections.sort(list);
		System.out.printf(list + "\n\n");
	}

}
