import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {

			System.out.println("\n===FILE ENCRYPTION AND DECRYPTION ===");
			System.out.println("1. Encrypt File");
			System.out.println("2. Decrypt File");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");

			int choice = ConsoleInput.getInt();

			switch (choice) {
			case 1:

				System.out.print("Enter input File Name: ");
				String inputFile = ConsoleInput.getString();
				System.out.print("Enter Encrypted File Name: ");
				String encryptedFile = ConsoleInput.getString();

				encryptFile(inputFile, encryptedFile);
				break;

			case 2:

				System.out.print("Enter Encrypted File Name: ");
				String encryptedInputFile = ConsoleInput.getString();
				System.out.print("Enter Decrypted Output File Name: ");
				String decryptedFile = ConsoleInput.getString();

				decryptFile(encryptedInputFile, decryptedFile);
				break;
			case 3:
				System.out.println("Program terminated.");
				return;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}

	public static void encryptFile(String inputFile, String outputFile) {

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));

				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

			int ch;

			while ((ch = reader.read()) != -1) {

				if (ch != '\n' && ch != '\r') {
					ch = ch + 1;
				}

				writer.write(ch);
			}

			System.out.println("File encrypted successfully.");

		} catch (IOException e) {
			System.out.println("Error while encrypting: " + e.getMessage());
		}
	}

	public static void decryptFile(String inputFile, String outputFile) {

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));

				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

			int ch;

			while ((ch = reader.read()) != -1) {

				if (ch != '\n' && ch != '\r') {
					ch = ch - 1;
				}

				writer.write(ch);
			}

			System.out.println("File decrypted successfully.");

		} catch (IOException e) {
			System.out.println("Error while decrypting: " + e.getMessage());
		}
	}
}
