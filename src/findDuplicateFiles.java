import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class findDuplicateFiles {
	Path allFiles;
	Finder finder;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path allFiles = Paths.get("/Users/Will/");
        Finder finder = new Finder("*");
        findDuplicateFiles findDuplicate = new findDuplicateFiles(allFiles,finder);
        findDuplicate.processFiles();
	}
	
	public findDuplicateFiles (Path allFiles, Finder finder) {
		this.allFiles = allFiles;
		this.finder = finder;
	}
	
	public void processFiles () throws IOException {
		Files.walkFileTree(allFiles, finder);
		finder.done();
	}
	
    public void investigatePath (Path path){
    	
    }
}
