//Hourglass
//9/18/15
//Lu Peng

public class Hourglass{
    public static void main (String[] args){
        Quotes();
        
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            
            for (int j=1; j<=1; j++){
                System.out.print("\\");
            }
            
            for (int j=1; j<=(10-2*i); j++){
                System.out.print(":");
            }
                
            for (int j=1; j<=1; j++){
                System.out.print ("/");
            }
            
            System.out.println();
        }
        
        Column();
        
        for (int i=4; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            
            for (int j=1; j<=1; j++){
                System.out.print("/");
            }
            
            for (int j=1; j<=(10-2*i); j++){
                System.out.print(":");
            }
                
            for (int j=1; j<=1; j++){
                System.out.print ("\\");
            }
            
            System.out.println();
        }
        
        Quotes();
    }
    
    public static void Quotes(){
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
    }
    
    public static void Column(){
        System.out.println("     ||");
    }
}