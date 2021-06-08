import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * ʹ�������ӳ���Ŷ��ͼ����Ϣ�����������
 * ������Ʒ���ԣ���ţ����ƣ����ۣ�������
 * ʹ����Ʒ�����Ϊӳ���е�key
 */

public class Book implements Comparable<Book>{
	int num;
	String title;
	String press;
	double price;
	public static void main(String[] args) {
		Book book1=new Book(10001, "����", "�������ճ�����", 20);
		Book book2 = new Book(16028, "��������", "�ݱ�������", 20);
		Book book3 = new Book(16029, "��¥��", "����������", 40);
		
		// ʹ��Map�洢�鼮��Ϣ
		Map<Integer, Book> bookMap = new HashMap<>();
		bookMap.put(16027, book1);
		bookMap.put(16028, book2);
		bookMap.put(16029, book3);
		
		// ����Map�����
		System.out.println("-----------HashMap-----------");
		Set<Integer> keySet = bookMap.keySet();
		for (Integer num : keySet) {
			System.out.println(bookMap.get(num));
		}

		// ʹ��list�洢�鼮��Ϣ
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
			

		// ����List�����
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
	// ���۸�ӵ͵��ߵ�˳��������ͬ�۸񰴱�Ŵ�С��������
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
