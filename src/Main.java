public class Main {

    // Задание 2
    public static String versionOs (byte sisCl, int yearCl) {
        String message = "";
        int clientDeviceYear = 2015;

        // операционная система клиента "iOS" = 0, "Android" = 1;
        if (sisCl == 0) {
            if (yearCl >= clientDeviceYear) {
                message = ("Установите версию приложения для iOS по ссылке");
            } else {
                message = ("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

        if (sisCl == 1) {
            if (yearCl >= clientDeviceYear) {
                message = ("Установите версию приложения для Android по ссылке");
            } else {
                message = ("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        return message;
    }

    public static void main(String[] args) {


        // возвращаемые значения
        // считаем, что это оператор вернул значение ))
        // операционная система клиента "iOS" = 0, "Android" = 1;

        int clienYear = 2013;
        byte clientOS = 1;
        String ver = "";

        ver = versionOs(clientOS, clienYear);
        System.out.println(ver);

        }


}