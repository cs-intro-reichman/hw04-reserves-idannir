public class StringOps {
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        String str1 = "";
        for (int i=0; i<string.length();i++)
        {
            if (string.charAt(i) == 32)
            {
                str1 += (char) (string.charAt(i));
            }
            else if (string.charAt(i) > 64 && string.charAt(i) < 91)
            {
                str1 += (char)(string.charAt(i) + 32);
            }
            else  str1 += (char)(string.charAt(i));
        }
        String str2 = "";
        for (int i=0; i<string.length();i++)
        {
            if (str1.charAt(i) == 97 || str1.charAt(i) == 101 || str1.charAt(i) == 105|| str1.charAt(i) == 111 || str1.charAt(i) == 117)
            {
                str2 += (char) (str1.charAt(i) -32);
            }
            else str2 += (char)(str1.charAt(i));
        }
        return str2;
    }

    public static String camelCase (String string) {
        String str1 = "";
        int space = -2;
        int n =0;
        for (int i=0; i<string.length();i++)
        {
            if (string.charAt(i) > 64 && string.charAt(i) < 91)
            {
                str1 += (char)(string.charAt(i) + 32) ;
            }
            else  str1 += (char)(string.charAt(i));
        }
        String str2 = "" + (char)(str1.charAt(n));
        for (int i = 1; i<string.length();i++)
        {
            if (str1.charAt(i) == 32)
            {
                space = i;
                i++;
            }
            else str2 += (char)(str1.charAt(i));
            if (space == (i-1) && str1.charAt(i) != 32)
            {
                str2 += (char)(str1.charAt(i) -32);
            }
        }
        return str2;
    }

    /**
     * @param string
     * @param chr
     * @return
     */
    public static int[] allIndexOf (String string, char chr) {
       int cnt =0;
        for (int i=0; i<string.length();i++)
        {
            if (string.charAt(i) == chr)
            {
                cnt++;
            }
        }
        int [] array = new int[cnt];
        int j =0;
        
        for (int i=0; i<string.length();i++)
        {
            if (string.charAt(i) == chr)
            {
                array [j] = i;
                j++;
            }

        }
        return array;
    }
}
