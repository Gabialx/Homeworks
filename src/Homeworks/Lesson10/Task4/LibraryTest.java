package Homeworks.Lesson10.Task4;

public class LibraryTest {

	public static void main(String[] args) {
		Library library = new Library();
		Book book1 = new Book();
		book1.setAuthor("Stivan King");
		book1.setTitle("No");
		book1.setYear(1995);
		Book book2 = new Book();
		book2.setAuthor("Stivan King");
		book2.setTitle("Yes");
		book2.setYear(1997);
		Book book3 = new Book();
		book3.setAuthor("Mariq Mariana");
		book3.setTitle("Ti");
		book3.setYear(2000);
		Book book4 = new Book();
		book4.setAuthor("Ivan Ivanov");
		book4.setTitle("AZ");
		book4.setYear(2015);
		Book book5 = new Book();
		book5.setAuthor("Dinitar Ivanov");
		book5.setTitle("To");
		book5.setYear(2017);
		library.add(book1);
		library.add(book2);
		library.add(book3);
		library.add(book4);
		library.add(book5);

		library.printAll();
		
		Book skBook= library.find("Stivan King");
		while (skBook != null) {
			library.remove(skBook);
			skBook= library.find("Stivan King");
		} 
		
		System.out.println();
		
		library.printAll();
		
	}

}
