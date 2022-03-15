import java.util.Scanner;

/*Fresher training 2022
*Author ToanPDT
*Date Mar 14, 2022
*Study assignment
*/

public class BookTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] book = new Book[30];
		System.out.println("Enter book data: ");
		for(int i = 0; i < 30; i++) {
			System.out.printf("Book %d\n", (i+1));
			String name;
			int ISBN_number;
			String authorName;
			String publisher;
			System.out.println("Enter book name: ");
			name = sc.next();
			
			System.out.println("Enter book ISBN number: ");
			ISBN_number = sc.nextInt();
			
			System.out.println("Enter book author name: ");
			authorName = sc.next();
			
			System.out.println("Enter book pulisher: ");
			publisher = sc.next();
			
			book[i] = new Book(name, ISBN_number, authorName, publisher);
		}
		sc.close();
		for(int i = 0; i < 30; i++) {
			System.out.printf("\n\nBook %d\n", (i+1));
			System.out.println(book[i].getBookInfo());
		}
	}

}
