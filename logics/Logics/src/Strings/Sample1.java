package Strings;
class Sample1
{
	static Boolean isVowel(char ch){
		return ch == '0'||ch == '1'||ch == '2'||ch == '3'||ch == '4'||ch == '5'||ch == '6'||ch == '7'||ch == '8'||ch =='9';
	}

	public static void main(String[] args) 
	{
		String s = "a1b2c3";
		char[] ch = s.toCharArray();
		int i = 0, j = ch.length-1;
		while(i<j){
			if(isVowel(ch[i]))
				{
					i++;
				}else if(isVowel(ch[j])){
					j--;
				}
				else {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
					i++;j--;
				}
				
		}
		System.out.println(new String(ch));
	}
}