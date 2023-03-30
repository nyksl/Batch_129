package day21statickeyword;

public class StudentTekrar {

    public static String stdName = "Tom Hanks";
    public int age = 13;

    //Ogrenci isiminin ilk harflerini veren methodu olusturunuz
    public static String getInitials(String name){
        String first = name.substring(0, 1);
        String second = name.split(" ")[1].substring(0,1);
        return first + second;
    }

    //Ogrenci ismindeki sesli harfleri(a, e, i, o, u) sayan bir method olusturunuz
    public int countVowels(String name){

        int counter = 0;

        for(int i=0; i<name.length(); i++){
            char ch = name.toLowerCase().charAt(i);
            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }
        return counter;
    }


}
