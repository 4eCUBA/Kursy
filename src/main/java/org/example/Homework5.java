package org.example;

public class Homework5 {
    public static void main(String[] args) {
        //1
        String str1 = "Hello ";
        String str2 = "World";
        String s1 = "Bilbo";
        String s2 = "Begins";

        String str3 = str1+str2;
        System.out.println(str3);
        String str4 = str1.concat(str2).concat(s1).concat(s2);
        System.out.println(str4);
        String str5 = String.format(str1+"(test)"+str2);
        System.out.println(str5);
        System.out.println(techno("4012"));
        System.out.println(techno(str2));

        //3
        System.out.println(String.format("Студент %s %s",s1,s2));

    }
    //2
    public static String techno(String str){
        int i = str.length();
        if (i%2 == 0){
            return str.substring(i/2-1,i/2+1);
        }
        else
            return str.substring(i/2,i/2+1);
    }
}
