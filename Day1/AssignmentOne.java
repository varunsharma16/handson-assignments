class AssignmentOne
{
   static int Max(int[] array)
     {
       int maxnum=array[0];
       for(int i=1;i<array.length;i++)
         {
            if(array[i]>maxnum)
                {
                   maxnum=array[i];
                 }
          }
        return maxnum;
       
      }
     static int Min(int[] array)
     {
       int minnum=array[0];
       for(int i=1;i<array.length;i++)
         {
            if(array[i]<minnum)
                {
                   minnum=array[i];
                 }
          }
        return minnum;
       
      }
       static int Sum(int[] array)
     {
       int sum=0;
       for(int i=0;i<array.length;i++)
         {
           sum=sum+array[i];
         }
        return sum;
         
       
      }
     public static void main(String args[])
   {
     int arr[]={20,30,40,50,10,15,-7};
     int k=Max(arr);
     int l=Min(arr);
     int m=Sum(arr);
     

     System.out.println("Maximum number ="+ k);
     System.out.println("Minimum number ="+ l);
     System.out.println("Sum is="+ m);
     


   }



}
   
      