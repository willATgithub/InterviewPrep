import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestSuites.class);
      if (result.getFailureCount() > 0) {
    	  System.out.println("********** Failueres **********");
    	  for (Failure failure : result.getFailures()) {
    		  System.out.println(failure.toString());
    		  //System.out.println(failure.getTrace());
    	  }
      }
      System.out.println(result.getRunCount() + " tests executed");
      System.out.println("Tests were successful: " + result.wasSuccessful());
   }
}  