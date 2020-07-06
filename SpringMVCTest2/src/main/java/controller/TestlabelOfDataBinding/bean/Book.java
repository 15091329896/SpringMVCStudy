package controller.TestlabelOfDataBinding.bean;

public class Book {
	private long id; // 书的id
	private String isbn; // 书的目录
	private String title; // 书的标题
	private Category category; // 书的类别
	private String author; // 书的作者

	public Book() {
	}

	public Book(long id, String isbn, String title, Category category, String author) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.category = category;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", category=" + category + ", author="
				+ author + "]";
	}

}