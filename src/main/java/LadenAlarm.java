public class LadenAlarm{
    public static void main(String[] args){

        //System.out.println("Output 29 customers:");
        //System.out.println(howMuchCustomers(29));

        //System.out.println("Output 31 customers:");
        //System.out.println(howMuchCustomers(31));

        //System.out.println("Output 30 customers:");
        //System.out.println(howMuchCustomers(30));

        int customers = 31;
        System.out.println(howMuchCustomers(customers));

        System.out.println(howMuchCustomersSwitch("green", customers));

    }

    public static String howMuchCustomers(int customers){
        if (customers < 30) return "Maximale Personenzahl nicht ueberschritten";
        else if (customers > 30) return "Zu viele Personen";
        else return "edgeCase";
    }

    public static String howMuchCustomersSwitch(String code, int customers){

        String resultSwitch;

        switch(code){

            case "red":
                resultSwitch = "Zu viele Personen";
                break;

            case "yellow":
                if (customers<=30) resultSwitch = "Maximale Personenzahl nicht ueberschritten";
                else resultSwitch = "Zu viel Personen";
                break;

            case "green":
                if (customers<=60) resultSwitch = "Maximale Personenzahl nicht ueberschritten";
                else resultSwitch = "Zu viele Personen";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        }
        return resultSwitch;

    }
}
