public class Expression
 {
    public static void main(String[] args) 
{
        
       
        int a = (101 + 0) / 3;
        System.out.println("Value of the expression (101 + 0) / 3 = " + a);
        
      
        double b = 3.0e-6 * 10000000.1;
        System.out.println("Value of the expression 3.0e-6 * 10000000.1 = " + b);
        
        
        boolean c = true && true;
        System.out.println("Value of the expression true && true = " + c);
        
      
        boolean d = false && true;
        System.out.println("Value of the expression false && true = " + d);
        
     
        boolean e = (false && false) || (true && true);
        System.out.println("Value of the expression (false && false) || (true && true) = " + e);
        
       
        boolean f = (false || false) && (true && true);
        System.out.println("Value of the expression (false || false) && (true && true) = " + f);
    }
}
