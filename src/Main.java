public class Main {

    // Задание 1
    public static String leapYear(int yearL) {
        int y4;
        int y100;
        int y400;
        y4 = yearL % 4;
        y100 = yearL % 100;
        y400 = yearL % 400;
        String year1 = "";

        if (y4 == 0 && y100 != 0 || y400 == 0) {
            year1 = (yearL + " год является высокосным");
        }

        else {
            year1 = (yearL + " год неявляется высокосным");
        }

        return (year1);
    }

    public static void main(String[] args) {

        int year = 2030;

        String yearStr = leapYear(year);

        System.out.println(yearStr);

    }


}