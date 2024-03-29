public class ArrayOps 
{
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        boolean isthere = false;
        int n = array.length;
        for (int i =0; i<array.length; i++)
        {
            for (int j=0; j<array.length; j++)
                {
                    if (array [j] == i )
                    {
                      isthere =true;
                    }
                }
            if (isthere == false)
            {
                return i;
            }
            isthere = false;
        }
        return  n ;
    }

    public static int secondMaxValue(int [] array) {
        int max = 0;
        int smax = 0;
        int cnt = 0;
        for (int i =0; i<array.length; i++)
        {
            if (array [i] > max )
            {
                max = array [i];
            }           
        }
        for (int i =0; i<array.length; i++)
        {
            if (array [i] == max )
            {
                cnt++;
            }           
        }
        if (cnt > 1)
        {
            return max;
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
        boolean isSameElements = true; 
        for (int i =0; i<array1.length; i++)
        {
            for (int j = 0; j<array2.length; j++)
            {
                if (array1 [i] == array2 [j])
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
}
