package mypack;
import jakarta.persistence.*;
import java.util.*;
@Entity
@Table(name = "BOOK")
public class Book {
	private int id;
	private String title;
	private int cost;
	private Set<Author> authors;
	public Book() {
		
	}
	public Book(String title,Set<Author> authors) {
		this.title = title;
		this.authors = authors;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Book_id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "Bid", referencedColumnName = "Book_id")
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", cost=" + cost + ", authors=" + authors + "]";
	}
   
}









