package HW9.Examples;
public class Running {
    public static void main(String[] args) {

        //String test1 = "01234567890";
        String test1 = "It's a test string";
        String test2 = "iT'S A tEsT STriNG";
        String test5 = " \t  IT'S A TEST STRING  \n ";
        TestClass copy1 = new TestClass(4, 2.5, "***Test***");

        System.out.println("\n concat():");
        test1.concat(test2);
        System.out.println(test1);
        System.out.println(test1.concat(test2));
        System.out.println(test1);
        test1.concat("#TEST#");
        System.out.println(test1);
        System.out.println(test1.concat("#TEST#"));
        System.out.println(test1);

        System.out.println("\n valueOf():");
        String test3 = String.valueOf(copy1);
        System.out.println(test3);  // переопределил метор toString

        System.out.println("\n join():");
        String test4 = String.join("-=:=-", test1, test2);
        System.out.println(test4);
        String test6 = "SS";
        test6.join("-=:=-", test1, test2);
        System.out.println(test6.join("-=:=-", test1, test2));
        System.out.println(test6);

        System.out.println("\n compareTo():");
        int d = test1.compareTo(test4);
        System.out.println(d);

        System.out.println("\n charAt():");
        System.out.println(test1.charAt(9));
        System.out.println(test1);

        System.out.println("\n getChars():");
        //char[] arr = new char[10];
        char[] arr = {'.', '.', '.', '.', '.', '.', '.', '.'};
        test1.getChars(5, 9, arr, 2);
        for (char c: arr) {
            System.out.print(c);
        }

        System.out.println("\n\n equals():");
        boolean b = test1.equals(test2);
        System.out.println(b);

        System.out.println("\n equalsIgnoreCase():");
        b = test1.equalsIgnoreCase(test2);
        System.out.println(b);

        System.out.println("\n regionMatches():");
        b = test1.regionMatches(7, "tEsT", 0, 4);
        System.out.println("if don't to ignore case: " + b);
        b = test1.regionMatches(true,7, "TEST", 0, 4);
        System.out.println("if to ignore case: " + b);
        b = test1.regionMatches(false,7, "TEST", 0, 4);
        System.out.println("if don't to ignore case: " + b);

        System.out.println("\n indexOf():");        // returns -1 in case of mismatching
        d = test2.indexOf('s');
        System.out.println(d);

        System.out.println("\n lastIndexOf():");    // returns -1 in case of mismatching
        d = test2.indexOf('S');
        System.out.println(d);

        System.out.println("\n startsWith():");
        b = test2.startsWith("It's");
        System.out.println(b);

        System.out.println("\n endsWith():");
        b = test2.endsWith("string");
        System.out.println(b);

        System.out.println("\n replace():");
        System.out.println(test1.replace('s', '#'));
        System.out.println(test1);

        System.out.println("\n trim():");
        System.out.println(test5);
        System.out.println(test5.trim());

        System.out.println("\n strip():");
        System.out.println(test5);
        System.out.println(test5.strip());

        System.out.println("\n substring():");
        System.out.println(test1.substring(7));
        System.out.println(test1.substring(7, 11));

        System.out.println("\n toLowerCase():");
        System.out.println(test2.toLowerCase());

        System.out.println("\n toUpperCase():");
        System.out.println(test2.toUpperCase());
    }
}