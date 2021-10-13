 /**
   * * * *      *           *  * * * *
 *              *           *  *       *
*               *           *  *        *
*               *           *  *         *
* * * * * * * * *           *  *          *
*             * *           *  *          *
*             * *           *  *          *
*             * *           *  *          * 
  * * * * *   * *           *  *         * 
              * *           *  *       *   
              *   * * * * *    * * * *
*/
              
public class BlockLetterEx1 { 

    public static void main(String[] args) { 
       try { 
       // Argument of index 0 1 2. Example: A B C  
       System.out.println(args[2]);  
          
       System.out.println("\"Block Letters Problem1\"");
       System.out.println(" * * * *     *       *    * * * *");
       System.out.println("*            *       *    *       *");
       System.out.println("*            *       *    *         *");  
       System.out.println("* * * * * *  *       *    *         *"); 
       System.out.println("*         *  *       *    *         *"); 
       System.out.println("*         *  *       *    *         *"); 
       System.out.println(" * * * *  *  *       *    *        *"); 
       System.out.println("          *  *       *    *       *");  
       System.out.println("          *   * * * *     * * * *"); 
    }
    catch(Exception IndexOutOfBoundsEx) { 
       System.err.print("Can't access an array index < or > than ");
       System.out.println(IndexOutOfBoundsEx.getMessage());  
    }
} 
}
