
public class Trial1{
    public static void main(String[]args){
        int rows =5;
        char symbol= '$';
      //prints lower section of the pattern  
for(int i=rows-1; i>=1; i--)  
{  
for(int j=rows; j>i; j--)  
{  
//prints space          
System.out.print(" ");  
}  
//prints symbol  
System.out.print(symbol);
System.out.println();  
for(int j=1; j<(i-1)*2; j++)  
{  
//prints space      
System.out.print(" ");  
}  
}
}
}