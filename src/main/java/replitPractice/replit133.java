package replitPractice;

public class replit133 {
    public static int countA(String s){
       int count=0;

        for (int i = 0; i <s.length() ; i++) {
            char c= s.charAt(i);

            if (c == 'a' || c == 'A'){
                count++;
            }

            }
        return count;
        }



    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}

