
import org.junit.Test;
import static org.junit.Assert.*;
import tree.BinarySearchTree;
import tree.Node;

public class TestBinarySearchTree {
	@Test
	public void testBinarySearchTreeConstructor() throws Exception {
		BinarySearchTree tree = new BinarySearchTree();
		assertNull("Tree root is null", tree.getRoot());
	}
	
	@Test
	public void testBinarySearchTree_insert() throws Exception {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(3);
		assertNotNull("Tree root is not null", tree.getRoot());
		assertEquals(3,tree.getRoot().getValue());
	}
	
	@Test
	public void testBinarySearchTree_insertMultiple() throws Exception {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(3);
		tree.insert(7);
		assertNotNull("Tree root is not null", tree.getRoot());
		assertEquals(3,tree.getRoot().getValue());
	}

	@Test
	public void testBinarySearchTree_findThree() throws Exception {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(3);
		tree.insert(7);
		tree.insert(9);
		tree.insert(5);
		tree.toDot();
		Node value = tree.find(3);
		assertEquals("find value that does exist",3, value.getValue());
	}
	
	@Test
	public void testBinarySearchTree_find() throws Exception {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(3);
		tree.insert(7);
		tree.insert(9);
		tree.insert(5);
		assertNull("find value that does not exist", tree.find(12));
	}
	
	@Test
	public void testBinarySearchTree_findNine() throws Exception {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(3);
		tree.insert(7);
		tree.insert(9);
		tree.insert(5);
		Node found = tree.find(9);
		assertEquals("find value in leaf",9, found.getValue());
	}
	
	@Test
	public void testBinarySearchTree_findParent() throws Exception {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(7);
		tree.insert(9);
		tree.insert(4);
		tree.insert(3);
		//tree.toDot();
		Node target = tree.find(3);
		Node parent = tree.findParent(target);
		assertEquals("find value that does not exist",4, parent.getValue());
	}
	
	@Test
	public void testBinarySearchTree_toDot() throws Exception {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(7);
		tree.insert(9);
		tree.insert(4);
		tree.insert(2);
		tree.insert(1);
		tree.insert(3);
		tree.insert(6);
		tree.insert(8);
		//tree.toDot();
		Node target = tree.find(3);
		Node parent = tree.findParent(target);
		assertEquals("find value that does not exist",2, parent.getValue());
	}
	
	@Test
	public void testBinarySearchTree_findSuccessor() throws Exception {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(7);
		tree.insert(9);
		tree.insert(4);
		tree.insert(3);
		//tree.toDot();
		Node target = tree.find(3);
		Node parent = tree.findSuccessor(target);
		assertEquals("find value that does not exist",4, parent.getValue());
	}
	
	@Test
	public void testBinarySearchTree_removeLeaf() throws Exception {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(7);
		tree.insert(9);
		tree.insert(4);
		tree.insert(3);
		tree.toDot();
		Node target = tree.find(3);
		tree.remove(target);
		target = tree.find(3);
		tree.toDot();
		
		assertNull("left node is null",target);
	}
	
	@Test
	public void testBinarySearchTree_removeNonLeaf() throws Exception {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(7);
		tree.insert(9);
		tree.insert(4);
		tree.insert(3);
		tree.toDot();
		Node target = tree.find(4);
		tree.remove(target);
		target = tree.find(4);
		tree.toDot();
		
		assertNull("left node is null",target);
	}

	@Test
	public void testBinarySearchTree_sizeEmpty() throws Exception {
		BinarySearchTree tree = new BinarySearchTree();
		assertEquals("size of empty tree",0,tree.size());
	}
	
	@Test
	public void testBinarySearchTree_sizeSingleNode() throws Exception {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		assertEquals("size of single node",1,tree.size());
	}
	
	@Test
	public void testBinarySearchTree_sizeMultipleNodes() throws Exception {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(7);
		tree.insert(9);
		tree.insert(4);
		tree.insert(3);
		assertEquals("size of single node",5,tree.size());
	}
}
