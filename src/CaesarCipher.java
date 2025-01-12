
import java.util.Scanner;

        public class CaesarCipher {
            public static String encrypt(String text, int shift) {
                StringBuilder encrypted = new StringBuilder();
                shift = shift % 26;
                for (char c : text.toCharArray()) {
                    if (Character.isLetter(c)) {
                        char base = Character.isUpperCase(c) ? 'A' : 'a';
                        encrypted.append((char) ((c - base + shift + 26) % 26 + base));
                    } else {
                        encrypted.append(c);
                    }
                }
                return encrypted.toString();
            }
            public static String decrypt(String text, int shift) {
                return encrypt(text, -shift);
            }
            public static void main(String[] args) {

            }
        }


