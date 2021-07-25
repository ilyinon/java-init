import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String challenge1 = "I want a bike";
        String challenge2 = "I want a ball";

        String regExp = "I want a (bike|ball)";

        Pattern pattern = Pattern.compile(regExp);

        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));

        String challenge5 = "aaabccccccccdddefffg";

        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));

        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        System.out.println(challenge5.replaceAll("^a{3}bc{8}d{3}ef{3}g$", "REPLACED"));

        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));

        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern2 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher2 = pattern2.matcher(challenge8);
        while(matcher2.find()) {
            System.out.println("Occurrence: " + matcher2.group(1));
        }
        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern patter3 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher3 = patter3.matcher(challenge9);
        while(matcher3.find()){
            System.out.println("Occurrence: " + matcher3.group(1));
        }

        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern patter4 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher4 = patter4.matcher(challenge10);
        while(matcher4.find()){
            System.out.println("Occurrence: start = " + matcher4.start(1) + " end = " + (matcher4.end(1) - 1));
        }

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern11 = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while (matcher11.find()) {
            System.out.println("Occurrence: " + matcher11.group(1));
        }

        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));

        String challenge12a = "11111-1111";
        System.out.println(challenge12a.matches("^\\d{5}-\\d{4}$"));

        System.out.println(challenge12.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(challenge12a.matches("^\\d{5}(-\\d{4})?$"));


    }
}
