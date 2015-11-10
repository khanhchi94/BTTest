public class BinarySearch {
	int item;
    private BinarySearch left, right;
    BinarySearch(int x) {
        item = x;
        left = null;
        right = null;
    }
    public void insert(int x) {
        if (x < item) {
            if(left == null) left = new BinarySearch(x);
            else left.insert(x);
        } else {
            if(right == null) right = new BinarySearch(x);
            else right.insert(x);
        }
    }
    public void printSortedList() {
        if(left != null) left.printSortedList();
        System.out.print(item + " ");
        if(right != null) right.printSortedList();
    }
    public boolean search(int x) {
        if(x == item) return true;
        if(x < item && left != null) return left.search(x);
        else if(right != null) return right.search(x);
        return false;
    }
    public static void main(String[] args) {
    	BinarySearch node = new BinarySearch((int)(100 * Math.random()));
        for(int i=1; i<=20; i++) node.insert((int)(100 * Math.random()));
        node.printSortedList();
        for(int i=1; i<=10; i++) {
            int x = (int)(100 * Math.random());
            if(node.search(x)) System.out.print("\n" + x + " exist !");
            else System.out.print("\n" + x + " not exist !");
        }
    }

}
