import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestFibonacci.class, TestListFactory.class, TestCircularList.class, TestLinkedList.class, TestMaxStack.class, TestBinarySearchTree.class})
public class TestSuites {
} 