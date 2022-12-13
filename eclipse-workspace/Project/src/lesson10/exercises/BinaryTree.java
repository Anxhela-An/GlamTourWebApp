package lesson10.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class BinaryTree<T extends Comparable<T>>
						  implements Collection<T> {

	private class Node<E extends Comparable<T>> {
		
		private E info;
		private Node<E> left, right;
		
		public Node(E info) {
			this.info = info;
		}
		
	}
	
	private Node<T> root;
	
	@Override
	public int size() {
		return size(root);
	}

	private int size(Node<T> root) {
		if(root == null) {
			return 0;
		}
		return 1 + size(root.left) 
				 + size(root.right);
	}

	@Override
	public boolean isEmpty() { 
		return root == null;
	}

	@Override
	public boolean contains(Object o) { 
		return contains(o, root);
	}

	private boolean contains(Object o, Node<T> root) {
		if(root == null) {
			return false;
		}
		if(root.info.equals(o)) {
			return true;
		}
		return contains(o, root.left) ||
			   contains(o, root.right);
	}

	@Override
	public Iterator<T> iterator() { 
		return getAsInOrderList().iterator();
	}

	@Override
	public Object[] toArray() {
		ArrayList<T> list = getAsInOrderList();
		Object[] array = new Object[list.size()];
		for (int i = 0; i < array.length; i++) {
			array[i] = list.get(i);
		}
		return array;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		ArrayList<T> list = (ArrayList<T>) getAsInOrderList();
		T[] array = Arrays.copyOf(a, list.size());
		for (int i = 0; i < array.length; i++) {
			array[i] = list.get(i);
		}
		return array;
	}

	@Override
	public boolean add(T e) {
		if(root == null) {
			root = new Node<>(e);
			return true;
		}
		return add(root, e);
	}

	private boolean add(Node<T> root, T e) {
		if(e == null) {
			return false;
		}
		while(true) {
			if(e.compareTo(root.info) < 0) {
				if(root.left == null) {
					root.left = new Node<>(e);
					return true;
				}
				root = root.left;
			}
			else if(e.compareTo(root.info) > 0){
				if(root.right == null) {
					root.right = new Node<>(e);
					return true;
				}
				root = root.right;
			}
			else {
				break;
			}
		}
		return false;
	}

	public ArrayList<T> getAsPreOrderList(){
		ArrayList<T> list = new ArrayList<>();
		addAtListPreOrdered(list, root);
		return list;
	}

	private void addAtListPreOrdered
			(ArrayList<T> list, Node<T> root) {
		if(root == null) {
			return;
		}
		list.add(root.info);
		addAtListPreOrdered(list, root.left);
		addAtListPreOrdered(list, root.right);
	}

	public ArrayList<T> getAsInOrderList(){
		ArrayList<T> list = new ArrayList<>();
		addAtListInOrdered(list, root);
		return list;
	} 

	private void addAtListInOrdered
			(ArrayList<T> list, Node<T> root) {
		if(root == null) {
			return;
		}
		addAtListInOrdered(list, root.left);
		list.add(root.info);
		addAtListInOrdered(list, root.right);
	} 
	
	public ArrayList<T> getAsPastOrderList(){
		ArrayList<T> list = new ArrayList<>();
		addAtListPastOrdered(list, root);
		return list;
	}

	private void addAtListPastOrdered
			(ArrayList<T> list, Node<T> root) {
		if(root == null) {
			return;
		}
		addAtListPastOrdered(list, root.left);
		addAtListPastOrdered(list, root.right);
		list.add(root.info);
	} 
	
	@Override
	public boolean remove(Object o) {
		if(root == null) {
			return false;
		}
		if(root.info.equals(o)) {
			if(root.left == null &&
			   root.right == null) {
				root = null;
			}
			else if(root.left == null) {
				root = root.right;
			}
			else if(root.right == null) {
				root = root.left;
			}
			else {
				Node<T> tmp = root.left;
				Node<T> parent = root;
				while(tmp.right != null) {
					parent = tmp;
					tmp = tmp.right;
				}
				root.info = tmp.info;
				if(parent == root) {
					root.left = tmp.left;
				}
				else {
					parent.right = tmp.left;
				}
			}
			return true;
		}
		return remove(o, root);
	}

	private boolean remove(Object o, Node<T> root) {
		if(root == null) {
			return false;
		}
		if(root.left != null) {
			if(root.left.info.equals(o)) {
				if(root.left.left == null &&
				   root.left.right == null) {
					root.left = null;
				}
				else if(root.left.left == null) {
					root.left = root.left.right;
				}
				else if(root.left.right == null) {
					root.left = root.left.left;
				}
				else { 
					Node<T> tmp = root.left.left;
					Node<T> parent = root.left;
					while(tmp.right != null) {
						parent = tmp;
						tmp = tmp.right;
					}
					root.left.info = tmp.info;
					if(parent == root.left) {
						root.left.left = tmp.left;
					}
					else {
						parent.right = tmp.left;
					}
				}
				return true;
			}
		}
		if(root.right != null) {
			if(root.right.info.equals(o)) {
				if(root.right.left == null &&
				   root.right.right == null) {
					root.right = null;
				}
				else if(root.right.left == null) {
					root.right = root.right.right;
				}
				else if(root.right.right == null) {
					root.right = root.right.left;
				}
				else { 
					Node<T> tmp = root.right.left;
					Node<T> parent = root.right;
					while(tmp.right != null) {
						parent = tmp;
						tmp = tmp.right;
					}
					root.right.info = tmp.info;
					if(parent == root.right) {
						root.right.left = tmp.left;
					}
					else {
						parent.right = tmp.left;
					}
				}
				return true;
			}
		}
		return remove(o, root.left) ||
			   remove(o, root.right);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		for(Object o : c) {
			if(!contains(o)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		for(T o : c) {
			add(o);
		}
		return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		for(Object o : c) {
			remove(o);
		}
		return true;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		Iterator<T> iterator = iterator();
		while(iterator.hasNext()) {
			T value = iterator.next();
			if(!c.contains(value)) {
				remove(value);
			}
		}
		return true;
	}

	@Override
	public void clear() {
		root = null;
	}

	//https://en.wikipedia.org/wiki/Binary_tree#:~:text=In%20computer%20science%2C%20a%20binary,child%20and%20the%20right%20child.&text=It%20is%20also%20possible%20to,is%20an%20ordered%2C%20rooted%20tree.
	
}