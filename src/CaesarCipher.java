
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
                Scanner scanner = new Scanner(System.in);

                System.out.println("Sezar shifrlash dasturi");
                System.out.println("1. Matnni shifrlash");
                System.out.println("2. Matnni deshifrlash");
                System.out.print("Tanlovni kiriting (1 yoki 2): ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Matnni kiriting: ");
                String text = scanner.nextLine();

                System.out.print("Kalitni kiriting (raqam): ");
                int shift = scanner.nextInt();

                if (choice == 1) {
                    String encryptedText = encrypt(text, shift);
                    System.out.println("Shifrlangan matn: " + encryptedText);
                } else if (choice == 2) {
                    String decryptedText = decrypt(text, shift);
                    System.out.println("Deshifrlangan matn: " + decryptedText);
                } else {
                    System.out.println("Noto'g'ri tanlov!");
                }

                scanner.close();
            }

        }


