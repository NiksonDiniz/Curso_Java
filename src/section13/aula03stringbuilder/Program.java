package section13.aula03stringbuilder;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        String t1 = "Traveling to New Zealand".toUpperCase();
        String t2 = "Good night guys".toUpperCase();

        String cont1 = "I'm going to visit this wonderful country!";
        String cont2 = "See you tomorrow";

        Post post1 = new Post(
                sdf.parse("21/06/2018 13:05:44"), t1, cont1, 12);
        post1.addComment(c1);
        post1.addComment(c2);

        System.out.println(post1);
        System.out.println("------------------------------");

        System.out.println();
        Post post2 = new Post(
                sdf.parse("28/07/2018 23:14:19"), t2, cont2, 5);
        post1.addComment(c1);
        post2.addComment(c3);
        post2.addComment(c4);
        post1.removeComment(c1);

        System.out.println(post2);
    }
}
