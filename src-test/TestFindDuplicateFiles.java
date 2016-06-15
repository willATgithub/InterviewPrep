import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Rule;

public class TestFindDuplicateFiles {
	@Rule
    public Timeout globalTimeout = Timeout.seconds(TestConstants.TEST_TIMEOUT); // 10 seconds max per method tested

	@Test
	public void testFindDuplicateFiles() throws IOException {
		Path allFiles = Paths.get("/Users/Will/");
        Finder finder = new Finder("*");
        findDuplicateFiles findDuplicate = new findDuplicateFiles(allFiles,finder);
        findDuplicate.processFiles();
	}

}
