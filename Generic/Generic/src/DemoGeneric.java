import java.util.ArrayList;

public class DemoGeneric {
	public static void main(String[] args) {
		Dictionary<String, String> d = new Dictionary<String, String>("Student", "Học sinh");
        String english = d.getKey();
        String vietnamese = d.getValue();
        System.out.println(english + ": " + vietnamese); 
        /*------- Demo generics inheritance ------*/
        Book<String, String> l = new Book<String, String>("Company", "Công ty");
        String english1 = l.getKey();
        String vietnamese1 = l.getValue();
        System.out.println("----- Demo generics inheritance -----");
        System.out.println(english1 + ": " + vietnamese1);
        /*Demo add 1 parameter from 1 class generics inheritance*/
        Books<String, String, Integer> p = new Books<String, String, Integer>("Class", "Lớp học", 20);
        String english2 = p.getKey();
        String vietnamese2 = p.getValue();
        int quanity = p.getInfo();
        System.out.println("----- Demo generics add 1 parameter from 1 class inheritance -----");
        System.out.println(english2 + ": " + vietnamese2 + "\nQuantity: " + quanity);
        /*Demo generics interface*/
        System.out.println("----- Demo generics interface -----");
        BookInterface<String> t = new BookInterface<String>();
        t.write("Add data to book");
        /*Demo create 1 method of generic*/
        System.out.println("----- Demo create 1 method of generic -----");
        ArrayList<String> list = new ArrayList<>();
        list.add("Tuan");
        list.add("Tan");
        list.add("Thu");
        list.add("Hop");
        System.out.println( "First element: " + Store.getLastElement(list));
	}
}
