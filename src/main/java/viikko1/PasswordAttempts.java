package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries){
        int i = 0;
        while(i < tries.length && i < 3){
            if (tries[i].equals("java123")){
                return "Tervetuloa!";
            }
            i++;
        }
        return "Liian monta virheellistä yritystä.";
    }
}
