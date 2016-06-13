import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import Find.Finder;

public class findDuplicateFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path allFiles = Paths.get("/Users/Will/");
        Finder finder = new Finder(pattern);
        Files.walkFileTree(allFiles, finder);
        finder.done();
	}
    public void investigatePath (Path path){
    	
    }
}
