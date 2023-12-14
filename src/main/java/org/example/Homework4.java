package org.example;

public class Homework4 {
    public static void main(String[] args) {
       int a = getSum(5);
        System.out.println(a);
       int b = getSum(5647321,5843858);
        System.out.println(b);
       byte c = 8;
       byte d = -56;
       int e = 5711;
       int f = getSum(e,c);
        System.out.println(f);
        int g = getSum(4,a,b);
        System.out.println(g);
        System.out.println(getSum("fhfhsd dfs","fdg62ref f d fs"));
        System.out.println(getSum(c,d));

        System.out.println(cubeIt(189));

        int[] test = {1,2,3,5,4,3,2,1,2,3,5,4,4,11,5};
        System.out.println(howMany(test,5));
        System.out.println(howMany(test,1));
        System.out.println(howMany(test,0));


    }

    public static int getSum(int doubleIt){
        return doubleIt*2;
    }

    public static int getSum(int a, int b){
        return a+b;
    }

    public static int getSum(int a, byte b){
        return (a+b);
    }

    public static int getSum(int a, int b, int c){
        return (a+b+c);
    }

    public static int getSum(String a, String b){
        return a.length()+b.length();
    }

    public static int getSum(byte a, byte b){
        return (a+b);
    }
    public static long cubeIt(int a){
        return (long) a*a*a;
    }

    public static int howMany (int[] mass, int number){
        int answer = 0;
        for (int i = 0; i<mass.length; i++){
            if (mass[i] == number)
                    answer++;
        }
        return answer;
    }
}
