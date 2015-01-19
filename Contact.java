import java.util.Iterator;
import java.util.LinkedList;

/**
 * This class is Contact.
 * I used LinkedList to store numbers of the contact and to connect them.
 * @author eminamuratovic
 *
 */
public class Contact {
	private String name;
	private LinkedList<Long> numbers;

	/**
	 * creates a contact
	 * @param name String name of the contact
	 * @param number int number of the contact
	 */
	public Contact(String name, Long number) {
		this.name = name;
		numbers = new LinkedList<Long>();
		numbers.add(number);
	}
	

	/**
	 * gets the numbers of the contact
	 * @return the numbers
	 */
	public LinkedList<Long> getNumbers() {
		return numbers;
	}

	/**
	 * prints the contact
	 * @return string
	 */
	public String ContactToString() {
		String str = "";
		str += "Name: " + name;
		str += "\nNumbers: ";
		str += "\n";
		Iterator<Long> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			str += iterator.next();
			str += "\n";
		}

		return str;
	}

	/**
	 * prints all the numbers of the contact
	 * @return string
	 */
	public String NumbersToString() {
		String str = "";
		Iterator<Long> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			str += iterator.next();
			str += "\n";
		}
		return str;
	}

	/**
	 * adds a new number to contact
	 * @param number int new number
	 */
	public void addNumber(Long number) {
		numbers.add(number);
	}

	/**
	 * removes a number from the contact
	 * @param index int index of the number in the contact
	 */
	public void removeNumber(int index) {
		if (index < 0 || index > numbers.size())
			throw new IndexOutOfBoundsException("Index is out of bounds!");
		numbers.remove(index);
	}

}
