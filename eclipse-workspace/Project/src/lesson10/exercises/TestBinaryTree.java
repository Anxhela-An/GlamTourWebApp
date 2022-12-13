package lesson10.exercises;

public class TestBinaryTree {
	
	public static void main(String[] args) {
		
		BinaryTree<Integer> binaryTree =
					new BinaryTree<>();

		binaryTree.add(10);
		binaryTree.add(7);
		binaryTree.add(4);
		binaryTree.add(31);
		binaryTree.add(-19);
		binaryTree.add(15);
		binaryTree.add(20);
		binaryTree.add(9);
		binaryTree.add(6);
		
		System.out.println(binaryTree.getAsInOrderList());
		
		binaryTree.remove(6);

		System.out.println(binaryTree.getAsInOrderList());
		
	}

}
