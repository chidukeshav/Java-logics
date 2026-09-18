package Strings;
class Sample2
{ 
    static Boolean isUppercase(char ch) 
    { 
        return ch >= 'A' && ch <= 'Z';
    } 

    public static void main(String[] args)  
    { 
        String s = "JaVaPrOgRaM"; 
        char[] ch = s.toCharArray(); 

        int i = 0, j = ch.length - 1; 

        while(i < j) 
        { 
            if(!isUppercase(ch[i])) 
            { 
                i++; 
            } 
            else if(!isUppercase(ch[j])) 
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