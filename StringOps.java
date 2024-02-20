public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        String str1 = "";
        for (int i=0; i<string.length();i++)
        {
            if (charAt(i) == 32)
            {
                str1 += charAt(i);
            };
            else if (charAt(i) > 64 && charAt(i) < 91)
            {
                str1 += charAt(i) + 32 ;
            }
        }
        String str2 = "";
        for (int i=0; i<string.length();i++)
        {
            if (charAt(i) == 97 || charAt(i) == 101 || charAt(i) == 105|| charAt(i) == 111 || charAt(i) == 117)
            {
                str2 += charAt(i) -32;
            }
            else str2 += charAt(i);
        }
        string = str2;
        return "";
    }

    public static String camelCase (String string) {
        String str1 = "";
        for (int i=0; i<string.length();i++)
        {
            if (charAt(i) > 64 && charAt(i) < 91)
            {
                str1 += charAt(i) + 32 ;
            }
        }
        String str2 = "";
        for (int i=0; i<string.length();i++)
        {
            if (charAt(i) == 32)
            {
                str2 += charAt(i+1) -32;
                i++;
            }
            else str1 += charAt(i);
        }
        string = str2;
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
       int cnt =0;
        for (int i=0; i<string.length();i++)
        {
            if (charAt(i) == chr)
            {
                cnt++;
            }
        }
        int [] array = new int[cnt];
        for (int i=0; i<string.length();i++)
        {
            if (charAt(i) == chr)
            {
                new [i] = string.indexOf(i);
            }

        }
        return new int[1];
    }
}
