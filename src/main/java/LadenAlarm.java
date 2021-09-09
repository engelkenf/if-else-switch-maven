public class LadenAlarm{
    public static void main(String[] args){

        System.out.println("Output 29 customers:");
        System.out.println(howMuchCustomers(29));

        System.out.println("Output 31 customers:");
        System.out.println(howMuchCustomers(31));

        System.out.println("Output 30 customers:");
        System.out.println(howMuchCustomers(30));
    }

    public static String howMuchCustomers(int customers){
        if (customers < 30) return "Maximale Personenzahl nicht ueberschritten";
        else if (customers > 30) return "Zu viele Personen";
        else return "edgeCase";
    }
}
