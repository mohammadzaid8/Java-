import java.io.File;

public class FileOrDirectoryChecker {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No file or directory name provided.");
            return;
        }

        String name = args[0];
        File file = new File(name);

        if (file.isFile()) {
            System.out.println("Name provided is a file.");
            long fileSize = file.length();
            System.out.println("File size: " + fileSize + " bytes");
        } else if (file.isDirectory()) {
            System.out.println("Name provided is a directory.");
            File[] files = file.listFiles();
            if (files != null) {
                System.out.println("Files in the directory:");
                for (File f : files) {
                    if (f.isFile()) {
                        System.out.println(f.getName());
                    }
                }
            }
        } else {
            System.out.println("Name provided is neither a file nor a directory.");
        }
    }
}