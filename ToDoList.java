package todolist;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ToDoList {

    public static void createFile(String fileName) {
        //Creating a file object
        File file = new File(fileName + ".txt");
        try {
            //Creating a file
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists at path: " + file.getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String fileName) {
        char array[] = new char[100000];
        try{
            //Create a reader using file reader
            FileReader fileRead = new FileReader(fileName + ".txt");
            //Reaing the file and storing it in the array
            fileRead.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);

            //Closing the reader
            fileRead.close();
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void writeFile(String fileName, String data) {
        try{
            //Writing to the file
            FileWriter writeToFile = new FileWriter(fileName + ".txt");
            writeToFile.write(data);
            System.out.println("\n Data written to the file successfully.");

            //Closing writer
            writeToFile.close();

        }
        catch(Exception e) {
            e.getStackTrace();
          }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String fileName = null;
        System.out.println("Welcome to the ToDoList application!");
        System.out.println("-------------------------------------");
        do {
            System.out.println("Select an option:");
            System.out.println( "\n 1.Create a new file \n 2.Write to a file \n 3.Display Content of the file \n 4.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter the name of the file that you want to create: ");
                    fileName = sc.nextLine();
                    createFile(fileName);
                    break;
                case 2:
                    System.out.println("Enter the file name you want to add data to: ");
                    fileName = sc.nextLine();
                    System.out.println("Enter the data that you want to write to " +fileName+ "file: ");
                    String data = sc.nextLine();
                    writeFile(fileName, data);
                    break;
                case 3:
                    readFile(fileName);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                System.out.println("Invalid choice. Please try again.");
            }

        }while(choice != 4);
        sc.close();
    }
}
