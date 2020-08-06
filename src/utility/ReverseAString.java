package utility;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "My name is Ogultach";
        String result = "";

        for (int i = name.length()-1; i >=0 ; i--) {
            result += ""+name.charAt(i);
        }
        System.out.println(result);

    }
}
