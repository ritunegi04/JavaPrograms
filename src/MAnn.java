
class Test1  
{ 
    public int sum() throws Exception
    { 
        try 
        { 
            int a = 20/0; 
        } catch (Exception e) 
        { 
            // toString method 
            System.out.println(e.toString()); 
              
            // OR 
            // System.out.println(e); 
        } 
        return 0;
    } 
} 
class Test2  extends Test1
{ 
    public int sum() throws ArithmeticException
    { 
        try 
        { 
            int a = 20/0; 
        } catch (Exception e) 
     

 

  { 
               System.out.println(e.toString()); 
        } 
        
        return 0;
    } 
} 

 


public class MAnn  
{ 
    public static void main(String[] args)  
    { 
     Test1  t = new Test1();
     Test1  t2 =  new Test2();
     t.sum();
     t2.sum();

 

} 
} 