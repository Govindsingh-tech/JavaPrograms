import java.io.File;
import java.util.Arrays;

public class FileSearch {
   public static void main(String[] argv) {
      File dir = new File("C:\\Users\\Govind Singh Rathore\\eclipse-workspace\\LockedMe\\src\\project");
      String[] list = dir.list();
      Arrays.sort(list);
      
      if (list == null) {
         System.out.println("does not exist or is not a directory");
      } else {
         for (int i = 0; i < list.length; i++) {
            String filename = list[i];
            System.out.println(filename);
         }
      }
   }
}
