package String;
class replacee{
public static void main(String[] args){
System.out.println("Remove All Spaces in the srting");
String s="Hello   Dud  e wellcome";
System.out.println(s);
System.out.println(s.replaceAll(" +",""));


System.out.println("Remove All Digits from the srting");
String s2="Hell46o Du989de well3672come";
System.out.println(s2);
System.out.println(s2.replaceAll("[0-9]",""));

System.out.println("Remove All Alphabets from the srting");
String s3="Hell46o Du989de well3672come";
System.out.println(s3);
System.out.println(s3.replaceAll("[a-z,A-Z]",""));

System.out.println("Extract only Digits from the srting");
String s4="Hell46o Du989de well3672come";
System.out.println(s4);
System.out.println(s4.replaceAll("[^0-9]",""));

System.out.println("Extract only alphabets from the srting");
String s5="Hell46o Du989de well3672come";
System.out.println(s5);
System.out.println(s5.replaceAll("[^a-z,A-Z ]",""));

System.out.println("Replace all vowels from the srting with * ");
String s6="Hello Dude wecome";
System.out.println(s6);
System.out.println(s6.replaceAll("[aeiou]","*"));

System.out.println("Rplace All Digits from the srting to #");
String s7="Hell46o Du989de well3672come";
System.out.println(s7);
System.out.println(s7.replaceAll("[0-9]","#"));

System.out.println("Repalce multiple space to single space the srting");
String s8="Hello                 Dude               wellcome";
System.out.println(s8);
System.out.println(s8.replaceAll(" +"," "));

System.out.println("Replace duplicate spaces from the srting");
String s9="H e l l o";
System.out.println(s9);
System.out.println(s9.replaceAll(" ",""));

System.out.println("Remove All Uppercase letters from the srting");
String s10="Hello Dude wellcome";
System.out.println(s10);
System.out.println(s10.replaceAll("[A-Z]",""));

System.out.println("Remove All loweracse letters from the srting");
String s11="Hello Dude wellcome";
System.out.println(s11);
System.out.println(s11.replaceAll("[a-z]",""));

System.out.println("Remove All Digits from the srting");
String s12="Hell46o Du989de well3672come";
System.out.println(s12);
System.out.println(s12.replaceAll("[0-9]",""));

System.out.println("Extract  special charecters from the srting");
String s13="Hel$#@lo Dud*^%e we$#%^come";
System.out.println(s13);
System.out.println(s13.replaceAll("[a-z,A-Z]",""));

System.out.println("Replace every non alphabets into space for the srting");
String s14="Hell4$$6o Du9*&89de well3672%&&come";
System.out.println(s14);
System.out.println(s14.replaceAll("[^A-Z,a-z ]"," "));

System.out.println("count number Digits present in the srting");
String s15="Hell46o Du989de well3672come";
System.out.println(s15);
System.out.println(s15.replaceAll("[^0-9]","").length());

System.out.println("Remove All vowels from the srting");
String s16="Hello Dude wellcome";
System.out.println(s16);
System.out.println(s16.replaceAll("[aeiou]",""));

System.out.println("Remove All Constants from the srting");
String s17="Hello Dude wellcome";
System.out.println(s17);
System.out.println(s17.replaceAll("[^aeiou ]",""));

System.out.println("Replace spaces to _ from the srting");
String s18="Hello Dude wellcome";
System.out.println(s18);
System.out.println(s18.replaceAll(" ","_"));

System.out.println("Remove All vowels from the srting");
String s19="Hello Dude wellcome";
System.out.println(s16);
System.out.println(s16.replaceAll("[aeiou]",""));

System.out.println("Extract only uppercase letters  from the srting");
String s20="Hello Dude wellcome";
System.out.println(s20);
System.out.println(s20.replaceAll("[^A-Z ]",""));

System.out.println("Extract only Lowecase letters from the srting");
String s21="Hello Dude wellcome";
System.out.println(s21);
System.out.println(s21.replaceAll("[^a-z ]",""));

System.out.println("check wether a string cantains only Digits");
String s22="887767862";
System.out.println(s22);
String res=s22.replaceAll("[0-9]","");
if(s22.isEmpty()){
	System.out.println("contains only digits");
}
	else{
		System.out.println("not Contains only digits");
	}

System.out.println("check wether a string cantains only Alphabets");
String s23="hello macha";
System.out.println(s23);
String res1=s23.replaceAll("[a-z]","");
if(s23.equals(res1)){
	System.out.println("contains only Alphabets");
}
	else{
		System.out.println("not Contains only Alphabets");
}

System.out.println("check wether a string cantains only Digits and letters");
String s24="887767862hello&$#";
System.out.println(s24);
String res2=s24.replaceAll("[^a-z,0-9]","");
if(s24.equals(res2)){
	System.out.println("contains only digits and letters");
}
	else{
		System.out.println("not Contains only digits and letters");
	}
	
System.out.println("remove all characters except vowels from the srting");
String s25="Hello Dude wellcome";
System.out.println(s25);
System.out.println(s25.replaceAll("[^aeiou ]",""));

System.out.println("replace every specail character foe @ for the srting");
String s26="Hel&^lo Du$#de wellcom&%(e";
System.out.println(s26);
System.out.println(s26.replaceAll("[#$%^&*()!]","@"));

System.out.println("count number of specail Characters  from the srting");
String s27="Hel#@$lo Dud&e wellc$#ome";
System.out.println(s27);
System.out.println(s27.replaceAll("[a-z,A-z ]","").length());


System.out.println("count number of alphabets from the srting");
String s28="Hel#@$lo Dud&e wellc$#ome";
System.out.println(s28);
System.out.println(s28.replaceAll("[^a-z,A-z]","").length());

System.out.println("count number of Upperacse from the srting");
String s29="Hel#@$lo Dud&e wellc$#ome";
System.out.println(s29);
System.out.println(s29.replaceAll("[^A-Z]","").length());

System.out.println("count number of Loweracse from the srting");
String s30="Hel#@$lo Dud&e wellc$#ome";
System.out.println(s30);
System.out.println(s30.replaceAll("[^a-z]","").length());

}
}