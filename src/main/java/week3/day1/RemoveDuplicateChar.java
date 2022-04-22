package week3.day1;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		char str[] = "geeksforgeeks".toCharArray();
        int n = str.length;
       int index = 0;
       for (int i = 0; i < n; i++)
       {   
    	   int j;
           for (j = 0; j < i; j++)
           {
               if (str[i] == str[j])
               {
                   break;
               }
           }

           // If not present, then add it to
           // result.
           if (j == i)
           {
               str[index++] = str[i];
           }
       }
       
       System.out.println();
	}

}
