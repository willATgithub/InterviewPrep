import java.nio.file.Path;

public class FilePaths {

    Path duplicatePath;
    Path originalPath;

    public FilePaths(Path duplicatePath, Path originalPath) {
        this.duplicatePath = duplicatePath;
        this.originalPath  = originalPath;
    }

    public String toString() {
        return "(original: " + originalPath + ", duplicate: " + duplicatePath + ")";
    }
}