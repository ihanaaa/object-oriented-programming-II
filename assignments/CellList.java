import java.util.NoSuchElementException;

public class CellList {
	private CellNode head;
	private int size;

	public CellList() {
		this.head = null;
		this.size = 0;
	}

	public CellList(CellList cl) {
		size = cl.size;
		if (cl == null)
			throw new NullPointerException();
		if (cl.head == null)
			head = null;

		CellNode t1, t2, t3; // creates 3 temporary pointers

		t1 = cl.head;
		t2 = t3 = head = null;

		while (t1 != null) {

			t3 = new CellNode(t1.c.clone(), null);

			if (head == null) {
				t2 = head = t3;
			}

			else {
				t2.next = t3;
				t2 = t3;
			}

			t1 = t1.next;
		}

		t2 = t3 = null;
	}

	public void addToStart(CellPhone c) {

		head = new CellNode(c, head);
		size++;

	}

	public void insertAtIndex(CellPhone c, int index) {

		CellNode newNode = new CellNode(c, null);

		if (index < 0 || index > (this.size - 1))
			throw new NoSuchElementException("Invalid index! Program will terminate");

		if (index == 0)
			addToStart(c);

		else {
			CellNode t = head;
			CellNode prev = null;
			int count = 0;

			while (t.next != null && count < index) {
				prev = t;
				t = t.next;
				count++;
			}

			prev.next = newNode;
			newNode.next = t;

			size++;
		}

	}

	public boolean deleteFromStart() {

		if (head != null) {
			head = head.getNext();
			return true;
		} else
			return false;

	}

	private CellNode find(long serialNum) {

		CellNode t = head;

		while (t != null) {
			if (t.c.getSerialNum() == serialNum) {
				return t;
			}

			t = t.next;
		}
		return t;
	}

	public Boolean contains(long serNum) {
		if (find(serNum) == null)
			return false;
		return true;
	}

	public void showContents() {
		CellNode t = head;

		System.out.println("\nThe current size of the list is " + size + ". Here are the contents of the list");
		System.out.println("=====================================================================");

		int ctr = 0;
		while (t != null) {
			System.out.print("[" + t.c + "]" + " -----> ");
			ctr++;
			t = t.next;
			if (ctr % 3 == 0)
				System.out.println();
		}

		System.out.print("X");
	}

///

	public void deleteFromIndex(int index) {

		if (index < 0 || index > (size - 1)) {

			throw new NoSuchElementException("Error: Invalid Value of Index! Program Closing!");
		}

		else if (head == null) {

			throw new NoSuchElementException("Error: There Is No Such List! Program Closing!");
		}

		else {
			CellNode n = head;

			for (int i = 0; i < size; i++) {
				if (i == index) {
					n.next = n.next.next;

				} else
					n = n.next;

			}

		}

	}

	public void replaceAtIndex(CellPhone p, int index) {

		if (index < 0 || index > (size - 1)) {
			return;
		}
		if (head == null) {
			return;
		}

		CellNode n = head;

		for (int i = 0; i < (size - 1); i++) {

			if (i == index) {
				n.c = p;

			} else {
				n = n.next;
			}
		}

	}

	public boolean equals(CellList cl) {

		if (this.size != cl.size) {
			System.out.println("Different List Sizes!");
			return false;
		}
		if (this.head == null && cl.head == null) {
			System.out.println("They Are Both Empty Lists!");
			return true;
		}

		CellNode n1 = this.head;
		CellNode n2 = cl.head;
		while (n1.next != null && n2.next != null) {
			if (n1.c.getBrand() == n2.c.getBrand() && n1.c.getPrice() == n2.c.getPrice()
					&& n1.c.getYear() == n2.c.getYear()) {
				n1 = n1.next;
				n2 = n2.next;
			} else
				return false;
		}
		return true;

	}

	public class CellNode {

		private CellPhone c;
		private CellNode next;

		public CellNode() {
			this.c = null;
			this.next = null;
		}

		public CellNode(CellPhone c, CellNode next) {
			this.c = c;
			this.next = next;
		}

		public CellNode(CellNode cn) {
			this.c = cn.c.clone();
			this.next = cn.next;
		}

		public CellNode clone() {
			return new CellNode(this);
		}

		public CellPhone getC() {
			return c;
		}

		public void setC(CellPhone c) {
			this.c = c;
		}

		public CellNode getNext() {
			return next;
		}

		public void setNext(CellNode next) {
			this.next = next;
		}

	}
}
