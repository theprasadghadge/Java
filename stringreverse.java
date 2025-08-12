public class stringreverse {

    public static void reverse(String str) {
        int l = str.length();
        for (int i = l - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void oddchar(String str) {
        int l = str.length();
        for (int i = 0; i < l; i++) {
            System.out.print(str.charAt(i++));
        }
    }

    public static void main(String[] args) {
        System.out.print("Reverse String : ");
        reverse("Prasad");
        System.out.print("oddCharacter of String :");
        oddchar("Prasad");
    }

}
