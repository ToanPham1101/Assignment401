

/*Fresher training 2022
*Author ToanPDT
*Date Mar 14, 2022
*Study assignment
*/

public class Book {
	private String name;
	private int ISBN_number;
	private String authorName;
	private String publisher;
	
	public Book() {
		
	}
	
	public Book(String name, int ISBN_number, String authorname, String publisher) {
		this.name = name;
		this.ISBN_number = ISBN_number;
		this.authorName = authorname;
		this.publisher = publisher;
	}
	
	//set gia tri
	public void setName(String name) {
		this.name = name;
	}
	public void setISBN_number(int ISBN_number){
		this.ISBN_number = ISBN_number;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	//get gia tri
	public String getName() {
		return name;
	}
	public int gerISBN_number() {
		return ISBN_number;
	}
	public String authorName() {
		return authorName;
	}
	public String publisher() {
		return publisher;
	}
	
	//get book info
	public String getBookInfo() {
		String allInfo = "Name: " + name + "\nISBN Number: " + ISBN_number + "\nAuthorName: " + authorName + "\nPublisher: " + publisher;
		return allInfo;
	}
	

}
