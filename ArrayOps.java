public class ArrayOps 
{
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        int isthere = 0;
        int missing = -1;
        for (int i =0; i<array.length; i++)
        {
            for (int j=0; j<array.length; j++)
                {
                    if (array [j] == i )
                    {
                      isthere++;
                    }
                }
            if (isthere!= (i+1))
            {
                missing = i;
            }
            
        }
        return missing;
    }

    public static int secondMaxValue(int [] array) {
        int max = 0;
        int smax = 0;
        for (int i =0; i<array.length; i++)
        {
            if (array [i] > max )
            {
                max = array [i];
            }           
        }
        for (int j = 0; j<array.length; j++)
            {
                if (array [j] != max )
                {
                    if (array [j] > smax )
                    {
                        smax = array [j];
                    }
                }
            }
        return smax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean is1 =false;
        boolean temp = array1 [i] == array2 [j];
        boolean is2 = false;
        boolean isSameElements = true; 
        for (int i =0; i<array1.length; i++)
        {
            for (int j = 0; j<array2.length; j++)
            {
                if (temp = true )
                {
                    is1 = true;
                }
            }
            if (is1 != true)
            {
                isSameElements = false;
            }
            is1 = false;
        }
        for (int i =0; i<array2.length; i++)
        {
            for (int j = 0; j<array1.length; j++)
            {
                if (temp = true )
                {
                    is2 = true;
                }
            }
            if (is2 != true)
            {
                isSameElements = false;
            }
            is2 = false;
        }
        return isSameElements;
    }

    public static boolean isSorted(int [] array) {
        boolean checkAccend = true;
        boolean checkDeccend = true;
        int n = 1;
        int m = 1;

        if(array.length == 1) return true;

        while(checkAccend && (n < array.length))
        {
            if(array[n - 1] < array[n]) 
                checkAccend = false;
            n++;
        }

        while(checkDeccend && (m < array.length))
        {
            if(array[m - 1] > array[m])
                checkDeccend = false;
            m++;
        }

        boolean sorted = (checkAccend || checkDeccend);
        return sorted;

}
