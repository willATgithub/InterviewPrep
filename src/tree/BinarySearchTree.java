package tree;

import java.io.File;
import java.util.Stack;

import com.github.jabbalaci.graphviz.GraphViz;

public class BinarySearchTree {
	Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public Node getRoot() {
		return root;
	}

	public void insert(int value) {
		root = insert(root,value);
	}
	
	private Node insert(Node node, int value) {
		if (node == null) {
			return new Node(value);
		}
		
		if (value < node.value) {
			node.left = insert(node.left,value);
		} else {
			node.right = insert(node.right,value);
		}
		return node;
	}
	
	public Node find(int value) {
		return find(root,value);
	}
	
	private Node find(Node root,int value){
		if (root == null || root.getValue() == value) {
			return root;
		}
		
		if (root.getValue() > value) {
			return find(root.left,value);
		} else {
			return find(root.right,value);
		}
	}
	
	public Node findParent(Node target){
		return findParent(root,target);
	}
	
	private Node findParent(Node node, Node target) {
		if (target == node) {
			return null;
		}
		
		while(node.left != target && node.right != target) {
			if (target.getValue() < node.getValue()) {
				node = node.left;
			} else {
				node = node.right;
			}
		}		
		return node;
	}
	
	public Node findSuccessor(Node target) {
		return findSuccessor(root, target);
	}
	
	public Node findSuccessor(Node node, Node target) {
		Node successor = target.right;

		if (successor != null) {
			while (successor.left != null) {
				successor = successor.left;
			}
			return successor;
		}
		do {
			if (successor != null) {
				target = successor;
			}
			successor = findParent(node,target);
		} while (successor != null && successor.right == target);
		return successor;
	}
	
	public void remove(Node target) {
		remove(root,target);
	}
	
	private void remove(Node node,Node target) {
		if (target.left != null && target.right != null) {
			Node next = findSuccessor(node,target);
			int data = next.getValue();
			remove(node,next);
			target.value = data;
			return;
		}
		if (target.left != null || target.right != null) {
			Node temp = (target.left != null) ? target.left : target.right;
			target.value = temp.getValue();
			target.left = temp.left;
			target.right = temp.right;
			return;
		}
		if (root == target) {
			root = null;
		}
		Node parent = findParent(root,target);
		if (parent.left == target) {
			parent.left = null;
		} else {
			parent.right = null;
		}
	}
	
	
	public int size() {
		return size(root);
	}
	
	private int size(Node node) {
		if (node == null) {
			return 0;
		}
		return 1 + size(node.left) + size(node.right);
	}
	public void toDot() {
		String exe = "/opt/local/bin/dot";
		String tempDir = "/Users/will/Documents/workspace/InterviewPreperation/dot/";
		GraphViz gv = new GraphViz(exe,tempDir);
		gv.addln(gv.start_graph());
		Stack<Node> visited = new Stack<Node>();
		visited.push(root);
		while(!visited.isEmpty()) {
			Node current = visited.pop();
			if (current.left != null) {
				visited.push(current.left);
				gv.addln(current.getValue() + "->" + current.left.getValue());
			}

			if (current.right != null) {
				visited.push(current.right);
				gv.addln(current.getValue() + "->" + current.right.getValue());
			}
		}
		gv.addln(gv.end_graph());

		gv.increaseDpi();   // 106 dpi

		String type = "gif";
		//      String type = "dot";
		//      String type = "fig";    // open with xfig
		//      String type = "pdf";
		//      String type = "ps";
		//      String type = "svg";    // open with inkscape
		//      String type = "png";
		//      String type = "plain";
		
		String repesentationType= "dot";
		//		String repesentationType= "neato";
		//		String repesentationType= "fdp";
		//		String repesentationType= "sfdp";
		// 		String repesentationType= "twopi";
		// 		String repesentationType= "circo";
		
		File out = new File(tempDir+ "BST." + gv.getImageDpi()+"." + System.currentTimeMillis() + "." + type);   // Linux
		//      File out = new File("c:/eclipse.ws/graphviz-java-api/out." + type);    // Windows
		gv.writeGraphToFile( gv.getGraph(gv.getDotSource(), type, repesentationType), out );
	}
}
