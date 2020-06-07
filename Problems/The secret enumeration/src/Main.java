public class Main {

    public static void main(String[] args) {
        Secret[] secrets = Secret.values();

        int num = 0;

        for (Secret secret: secrets) {
            String strSecret = secret.toString();

            if (strSecret.contains("STAR")) {
                num++;
            }
        }

        System.out.println(num);
    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/