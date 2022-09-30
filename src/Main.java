public class Main {

    // Задание 3
    public static String daysDeLivery (int dayD) {
        String message = "";

        int deliveryDay = 0;
        int Distance1 = 20;
        int Distance2 = 60;
        int Distance3 = 100;
        boolean deliveryCleint1 = dayD <= Distance1;
        boolean deliveryCleint2 = dayD > Distance1 && dayD < Distance2;
        boolean deliveryCleint3 = dayD >= Distance2 && dayD <= Distance3;

       if (deliveryCleint1)  deliveryDay = 1;
       if (deliveryCleint2) deliveryDay = 2;
       if (deliveryCleint3)  deliveryDay = 3;

        message = "Для доставки вашей карты " +
                "потребуется: " + deliveryDay + " рабочих дня";

        return message;
    }

    public static void main(String[] args) {

        int deliveryDistance = 95; // количество километров до клиента
        String daysDeLStr = "";

        daysDeLStr = daysDeLivery(deliveryDistance);
        System.out.println(daysDeLStr);

        }


}