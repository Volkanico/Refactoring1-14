package com.company;
import java.util.Random;


//Aquesta refactoritzacio trata de transformar les constants en variables finals dafora dels metodes
//Refactoritzacion: MagicNumbers, crearem les noves variables finals i les canviarem per les constants 6 i 15,
//tambe lis passarem el parametre al metode que hi son

public class /*PasswordGenerator*/ MagicNumbers {
    private Random random = new Random();
    private String characters = "abcdefghijkmnopqrstuvwxyz23456789";

    private static final int MAX_PASSWORD_LENGTH = 15;
    private static final int MIN_PASSWORD_LENGTH = 6;

    public String generatePassword(int length, int llargaria_minima_password, int llargaria_maxima_password) throws Exception {

        if (length < MIN_PASSWORD_LENGTH || length > MAX_PASSWORD_LENGTH) {
            throw new Exception("Wrong password length: " + length);
        } else {
            String password = "";

            for (int i = 0; i < length; i++)
                password += characters.charAt(random.nextInt(characters.length()));

            return password;
        }
    }
}


/* CODI FONT SENSE REFACTORITZAR

    import java.util.Random;

    public class PasswordGenerator {
        private Random random = new Random();
        private String characters = "abcdefghijkmnopqrstuvwxyz23456789";

        public String generatePassword(int length) throws Exception {
            if (length < 6 || length > 15) {
                throw new Exception("Wrong password length: " + length);
            } else {
                String password = "";

                for (int i = 0; i < length; i++)
                    password += characters.charAt(random.nextInt(characters.length()));

                return password;
            }
        }
    }

*/
