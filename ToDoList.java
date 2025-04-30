package todolist;
import java.io.File;
import java.io.FileReader;

public class ToDoList {
    public static void main(String[] args){
        File file = new File("newFile.txt");
        char array[] = new char[100];
        try{
            //Creating a file
            boolean value = file.createNewFile();
            if (value){
                System.out.println("File created successfully.");
            }
            else{
                System.out.println("File already exists at path: " + file.getAbsolutePath());
            }

            //Create a reader using file reader
            FileReader fileRead = new FileReader("newFile.txt");

            //Reding character from the file
            //Reaing the file and storing it in the array
            fileRead.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);

            //Closing the reader
            fileRead.close();
        }
        catch(Exception e) {
            e.getStackTrace();
          }
    
    }
}
