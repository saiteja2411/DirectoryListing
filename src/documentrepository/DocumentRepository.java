package documentrepository;

import java.io.File;
//THIS PROGRAM LIST ALL THE DIRECTORIES, SUB-DIRECTRIES AND FILES IN EACH DIR AND SUB DIR.

public class DocumentRepository {

    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\Saiteja\\Documents\\Javascript");
        File list[] = file.listFiles();
        print(list, 0);
    }

    private static void print(File list[], int level) {
        for (File list1 : list) {
            System.out.print("Level:" +level+"    ");
            if (list1.isDirectory()) {
                for (int i = 0; i < level; i++) {
                    System.out.print("    ");
                }
                System.out.println("Dir : " + list1.getName());
                File file = new File(list1.getPath());
                File list2[] = file.listFiles();
                print(list2, level + 1);
            } else {
                for (int i = 0; i < level; i++) {
                    System.out.print("    ");
                }
                System.out.println("File : " + list1.getName());
            }
        }
    }
}
