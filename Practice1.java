public class Practice1 {
    public static void main(String[] args) {

        String name="Java";
        System.out.println(name.toLowerCase());

        String name1="  java  ";
        System.out.println(name1.replace("  ","_"));

        String book="the name of book is <bookname>";
        System.out.println(book.replace("<bookname>","lord of rings"));

        String note="Thanks god.\nlove you";
        System.out.println(note);
        System.out.println("thanks god \n love you");

        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("    "));

    }
    
}
