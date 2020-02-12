package linked_list;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		
	// Create list of students and convert to LinkedList	
		String[] name1 = {"Mike","Dave","Claire","Helen"};
		
		LinkedList<String> student_name = new LinkedList<>();
		
		for(String n: name1) {
			student_name.add(n);
			
		}
		
	// Create list of tutors and convert to LinkedList
		String[] name2 = {"Rachel","Paul","Laura"};
		LinkedList<String> tutor_name = new LinkedList<>();
		
		for(String t: name2) {
			tutor_name.add(t);
		}
		
	// Combine student list and tutor list
		student_name.addAll(tutor_name);
		

	// 
		ListManagementTool myList = new ListManagementTool();
		
		System.out.println("Print out new list");
		myList.printme(student_name);
		
		System.out.println("Remove element form list");
		myList.removeme(student_name, 2);
		
		System.out.println("Add new name to list");
		myList.addme(student_name, 3, "Harry");
		
		System.out.println("Reverse list");
		myList.reverseme(student_name);
		
		System.out.println("Arrange in alphabetical order");
		myList.sortme(student_name);
		
	}

}
