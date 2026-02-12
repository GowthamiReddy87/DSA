class Count {
    public static int countDigits(int n) {
        // code here
        int count=0;
         while(n>0)
         {
count++;

             n=n/10;
                       
         }
         return count;
    }
    public static void main(String[] args)
    {  
       System.out.println(countDigits(456)); 
    }
    
}
