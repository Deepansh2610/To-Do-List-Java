package todolist;
import java.io.File;

public class ToDoList {
    public static void main(String[] args){
        File file = new File("newFile.txt");
        try{

            boolean value = file.createNewFile();
            if (value){
                System.out.println("File created successfully.");
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch(Exception e) {
            e.getStackTrace();
          }
    
    }
}
