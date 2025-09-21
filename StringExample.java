public class StringExample {
    public static void main(String[] args) {
        String name = "Gill";

        int len = name.length();
        System.out.println(len);

        System.out.println(name.toUpperCase());

        System.out.println(name.substring(0, 3).toUpperCase());

        String s = "GILL";

        if(name.equals(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


    }
}
