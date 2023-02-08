
// importing the File class
import java.io.File;

class Main {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("newFile.txt");

    try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
  #feature201 changes done by Srikanth on Reports module 08-feb-2023
  public static void main (String args[])  
	{  
		//creating Scanner class object     
		Scanner scan=new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		//reading value from the user  
		int num=scan.nextInt();  
		//method calling  
		findEvenOdd(num);  
		}  
}
