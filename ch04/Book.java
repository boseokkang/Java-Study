package ch04;

class BookApp {
	private String title; // å �̸�
	private String author; // å ����

	public BookApp(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}
}

public class Book {
	public static void main(String[] args) {
		BookApp littlePrince = new BookApp("�����", "�����㺣��");
		String t = littlePrince.getTitle();
		String a = littlePrince.getAuthor();
		System.out.println(t + " " + a);
		
		BookApp loveStory = new BookApp("������", "�̻�");
		String t1 = loveStory.getTitle();
		String a1 = loveStory.getAuthor();
		System.out.println(t1 + " " + a1);
	}

}
