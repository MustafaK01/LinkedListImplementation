
public class Main {
	
	public static void main(String[] args) {
		LinkedL linkedL = new LinkedL();
		int[] nums= {1,5,9,8,7,7,5}; 
		linkedL.addNumsToLinkedList(nums);
		System.out.println(" ");
		linkedL.printList();
		linkedL.deleteFromIndex(0);
		System.out.println(" ");
		linkedL.printList();
		int[] nums2= {5,8,5}; 
		linkedL.deleteElementsFromList(nums2);
		System.out.println(" ");
		linkedL.printList();
	}

}
