package Strings;
class Sample3
{
    static Boolean isLowercase(char ch)
    {
        return ch >= 'a' && ch <= 'z';
    }

    public static void main(String[] args)
    {
        String s = "JaVaPrOgRaM";
        char[] ch = s.toCharArray();

        int i = 0, j = ch.length - 1;

        while(i < j)
        {
            if(!isLowercase(ch[i]))
            {
                i++;
            }
            else if(!isLowercase(ch[j]))
            {
                j--;
            }
            else
            {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++;
                j--;
            }
        }

        System.out.println(new String(ch));
    }
}