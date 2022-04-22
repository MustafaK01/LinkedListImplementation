
public class LinkedL {
	
	private Node head;
	
	private Node tail;
	
	public LinkedL(){
		head = null;
		tail = null;
	}
	
	public void addToHead(int num) {
		Node node = new Node(num);
		if(isItHaveAnyElement()) {
			node.next = head;
			head = node;
		}
		else {
			head = node;
			tail = node;
		}
	}
	public void addToTail(int num) {
		Node node = new Node(num);
		if(isItHaveAnyElement()) {
			tail.next = node;
			tail = node;
		}
		else {
			head = node;
			tail = node;
		}
	}
	
	public void addToIndex(int index,int num) {
		int i = 0;
		Node node = new Node(num);
		Node pointer2 = null;
		Node pointer = head;
		if(isItHaveAnyElement()) {
			if(index==0) {
				node.next = head;
				head = node;
			}else {
				while(pointer != null && i<index) {
					pointer2 = pointer;
					pointer = pointer.next;
					i++;
				}
				if(pointer == null) addToTail(num);
				else {
					node.next = pointer;
					pointer2.next = node;
				}	
			}
		}else addToHead(num);
	}
	
	public void deleteFromHead() {
		Node node = head.next;
		if(isItHaveAnyElement()) {
			if(head == tail) {
				head=null;
				tail=null;
			}else {
				head.next = null;
				head = node;
			}
		}
	}
	public void deleteFromTail() {
		Node pointer = head;
		if(isItHaveAnyElement()) {
			if(head == tail) {
				head=null;
				tail=null;
			}else {
				while(pointer.next!=tail) {
					pointer = pointer.next;
				}
				pointer.next = null;
				tail = pointer;
			}
		}
	}
	public void deleteFromIndex(int index) {
		if(isItHaveAnyElement()&&!(index<0)) {
			if(head == tail) {
				head = null;
				tail = null;
			}else {
				if(index == 0) {
					deleteFromHead();
				}else {
					Node pointer = head;
					Node pointer2 = null;
					int i = 0;
					while(pointer.next!=null&&i<index) {
						pointer2 = pointer;
						pointer = pointer.next;
						i++;
					}
					if(pointer!=null) {
						if(pointer==tail) {
							deleteFromTail();
						}else {
							Node pointer3 = pointer.next;
							pointer2.next = pointer3;
							pointer = null;
						}
						
					}
					
				}
			}
		}
	}
	public void deleteAnElementFromList(int num) {
		Node pointer = head;
		Node pointer2 = null;
		if(isItHaveAnyElement()) {
			if(head == tail) {
				if(head.num == num) {
					head = null;
					tail = null;
				}
			}else {
				if(head.num == num) {
					deleteFromHead();
				}else {
					while(pointer.next!=null&&num!=pointer.num) {
						pointer2 = pointer;
						pointer = pointer.next;
					}
					if(pointer!=null) {
						if(pointer==tail) {
							deleteFromTail();
						}else {
							Node pointer3 = pointer.next;
							pointer2.next = pointer3;
							pointer = null;
						}
						
					}
					
				}
			}
		}
	}
//	public void deleteAllElementsOfNumberValue(int num) {
//		
//	}
	public void printList() {
		Node pointer = head;
		int numOfElements =0 ;
		while(pointer != null) {
			System.out.print(pointer.num + " ");
			pointer = pointer.next;
			numOfElements++;
		}
		System.out.print("| Num Of Elements : "+numOfElements);
	}
	
	public boolean isItHaveAnyElement() {
		if(head!=null) return true;
		return false;
	}
	public void addNumsToLinkedList(int[] nums) {
		for(int i = 0;i<nums.length;i++) {
			addToIndex(i, nums[i]);
		}
	}
	public void addNumsToLinkedListAtTail(int[] nums) {
		for(int i = 0;i<nums.length;i++) {
			addToTail(nums[i]);
		}
	}
	public void addNumsToLinkedListAtHead(int[] nums) {
		for(int i = 0;i<nums.length;i++) {
			addToHead(nums[i]);
		}
	}
	
	public void deleteElementsFromList(int[] nums) {
		for(int i = 0;i<nums.length;i++) {
			deleteAnElementFromList(nums[i]);
		}
	}
	
	
}
