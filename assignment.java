import java.util.Scanner;

class assignment {
    public static void main(String[] args) {
      
    
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = obj.nextInt();
        System.out.println("entered number " + a);
      int var;
  
    
      var = a;
      System.out.println("var using =: " + var);
  
    
      var += a;
      System.out.println("var using +=: " + var);
  
    
      var *= a;
      System.out.println("var using *=: " + var);
    }
  }