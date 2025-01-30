import java.io.File;

public class FileApp {
    public static void main(String[] args) {
        File fileName = new File("testDir");
        System.out.println(fileName.getAbsolutePath());
        System.out.println(fileName.mkdir());
    }
}
