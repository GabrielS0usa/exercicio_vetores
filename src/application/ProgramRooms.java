package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rooms;

public class ProgramRooms {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rooms[] rooms = new Rooms[10];
		Rooms room = null;

		for (int i = 0; i < rooms.length; i++) {
			int j = -1;
			room = new Rooms(j);
			rooms[i] = room;
		}

		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			int roomQt = sc.nextInt();

			if (rooms[roomQt - 1].getRooms() != -1) {
				System.out.println(String.format("O quarto %d já está alugado!", roomQt));
				int cont = 0;
				for (int j = 0; j < rooms.length; j++) {
					if (rooms[j].getRooms() == -1) {
						cont++;
						System.out.println();
						System.out.println(String.format("O quarto %d está disponivel!", j + 1));
					}
				}
				System.out.println();
				System.out.println("Escolha outro quarto: ");
				roomQt = sc.nextInt();
			}

			rooms[roomQt - 1].setName(name);
			rooms[roomQt - 1].setEmail(email);
			rooms[roomQt - 1].setRooms(roomQt);
		}

		System.out.println();
		System.out.println("Busy rooms");

		for (int j = 0; j < rooms.length; j++) {
			if (rooms[j].getRooms() != -1) {
				System.out.printf("%d: %s, %s%n", rooms[j].getRooms(), rooms[j].getName(), rooms[j].getEmail());
			}
		}

		sc.close();
	}
}