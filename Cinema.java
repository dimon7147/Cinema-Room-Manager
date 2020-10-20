import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        var rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        var seats = scanner.nextInt();
        var room = new Room(rows,seats);
        while (true) {
            System.out.println("1. Show the seats\n" +
                    "2. Buy a ticket\n" +
                    "3. Statistics\n" +
                    "0. Exit");
            var choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    System.out.println("Cinema:");
                    room.printField();
                    break;
                }
                case 2: {
                    while (true) {
                        System.out.println("Enter a row number:");
                        rows = scanner.nextInt();
                        System.out.println("Enter a seat number in that row:");
                        seats = scanner.nextInt();
                        var result = room.bookSeat(rows, seats);
                        if (result) {
                            System.out.println("Ticket price: $" + room.getTicketPrice(rows));
                            break;
                        } else {
                            continue;
                        }
                    }
                    break;
                }
                case 3: {
                    room.printStats();
                    break;
                }
                case 0: {
                    return;
                }
                default: {
                    System.out.println("Incorrect option!");
                    break;
                }
            }
        }
    }
}