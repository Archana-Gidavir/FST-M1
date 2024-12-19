package fsthello;

public class Activity5 {

	public static void main (String[] arg) {
		
		MyBook b1 = new MyBook("Dreams");
		
		System.out.println("Title of my book is - " + b1.getTitle());
		b1.setTitle("Java Testing");
		System.out.println("New Title of my book is - " + b1.getTitle());
		
	}
}
