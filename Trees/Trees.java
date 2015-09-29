//draws Christmas trees using parameters
//9/28/15
//Lu Peng

public class Trees{
    public static void drawTree(int segment, int height){
        for (int i=1; i<=segment; i++){
            for (int j=1; j<=height; j++){ 
                for (int k=1; k<=(2*height-2+2*(segment-1))/2+2-i-j; k++){
                    System.out.print (" ");
                }
                for (int k=1; k<= 2*j-1+2*(i-1); k++){
                    System.out.print ("*");
                }
                System.out.println();
            }
        }
        for (int i=1; i<=2; i++){
            for (int j=1; j<=(2*height-2+2*(segment-1))/2; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=1; i++){
            for (int j=1; j<=(2*height-2+2*(segment-1))/2-3; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=1; j++){
                System.out.print("*******");
            }
            System.out.println();
        }
    }
    
    public static void main (String[] args){
        drawTree(3, 4);
        System.out.println();
        drawTree(2, 5);
        drawTree(2,7);
    }
}

