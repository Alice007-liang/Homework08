import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * 使用链表和映射存放多个图书信息，遍历并输出
 * 其中商品属性：编号，名称，单价，出版社
 * 使用商品编号作为映射中的key
 */

public class Book implements Comparable<Book>{
	int num;
	String title;
	String press;
	double price;
	public static void main(String[] args) {
		Book book1=new Book(10001, "红岩", "长江文艺出版社", 20);
		Book book2 = new Book(16028, "封神演义", "捷豹出版社", 20);
		Book book3 = new Book(16029, "红楼梦", "艺术出版社", 40);
		
		// 使用Map存储书籍信息
		Map<Integer, Book> bookMap = new HashMap<>();
		bookMap.put(16027, book1);
		bookMap.put(16028, book2);
		bookMap.put(16029, book3);
		
		// 遍历Map并输出
		System.out.println("-----------HashMap-----------");
		Set<Integer> keySet = bookMap.keySet();
		for (Integer num : keySet) {
			System.out.println(bookMap.get(num));
		}

		// 使用list存储书籍信息
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
			

		// 遍历List并输出
		System.out.println("-----------ArrayList-----------");

		for (Book temp : bookList) {
			System.out.println(temp);
		}



	}

	public Book() {
		super();
	}

	public Book(int num, String title, String press, double price) {
		super();
		this.num = num;
		this.title = title;
		this.press = press;
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "num: " + num + "\ttitle: " + title + "\tprice: " + price + "\tpress: " + press;
	}

	@Override
	// 按价格从低到高的顺序排序，相同价格按编号从小到大排序
	public int compareTo(Book o) {
		if (this.price < o.price) {
			return -1;
		} else if (this.price > o.price) {
			return 1;
		} else {
			if (this.num < o.num) {
				return -1;
			} else if (this.num > o.num) {
				return 1;
			} else {
				return 0;
			}
		}
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Book other = (Book) obj;
		if (num != other.num) {
			return false;
		}

		if (price != other.price) {
			return false;
		}

		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}

		if (press == null) {
			if (other.press != null) {
				return false;
			}
		} else if (!press.equals(other.press)) {
			return false;
		}

		return true;

	}
}
