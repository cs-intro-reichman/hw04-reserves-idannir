public class StringOps {
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        String str1 = "";
        for (int i=0; i<string.length();i++)
        {
            if (string.charAt(i) == 32)
            {
                str1 += string.charAt(i);
            }
            else if (string.charAt(i) > 64 && string.charAt(i) < 91)
            {
                str1 += string.charAt(i) + 32;
            }
            else  str1 += string.charAt(i);
        }
        String str2 = "";
        for (int i=0; i<string.length();i++)
        {
            if (str1.charAt(i) == 97 || str1.charAt(i) == 101 || str1.charAt(i) == 105|| str1.charAt(i) == 111 || str1.charAt(i) == 117)
            {
                str2 += str1.charAt(i) -32;
            }
            else str2 += str1.charAt(i);
        }
        string = str2;
        return string;
    }

    public static String camelCase (String string) {
        String str1 = "";
        for (int i=0; i<string.length();i++)
        {
            if (string.charAt(i) > 64 && string.charAt(i) < 91)
            {
                str1 += string.charAt(i) + 32 ;
            }
            else  str1 += string.charAt(i);
        }
        String str2 = "";
        for (int i=0; i<string.length();i++)
        {
            if (str1.charAt(i) == 32)
            {
                str2 += str1.charAt(i+1) -32;
                i++;
            }
            else str1 += str1.charAt(i);
        }
        string = str2;
        return string;
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
        
        for (int i=0; i<string.length();i++)
        {
            if (string.charAt(i) == chr)
            {
                array [i] = string.indexOf(i);
            }

        }
        return array;
    }
}
