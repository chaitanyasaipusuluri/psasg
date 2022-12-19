import java.util.Scanner;  

class Main {
  public static void main(String[] args) throws Exception{
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter username");
    String userName = myObj.nextLine();  
    System.out.println("Username is: " + userName);
    System.out.println("our encoded string is ");
    byte array[] = userName.getBytes("UTF8");
    for (byte x: array)   
        {  
            System.out.print(x+" ");  
        }      


  }
}