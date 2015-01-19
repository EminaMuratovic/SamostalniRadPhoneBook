import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * This class is Phonebook.
 * I used HashMap to store names and numbers and Set to store names so we can go through the phonebook.
 * @author eminamuratovic
 *
 */
public class Phonebook {
	private HashMap<String, Contact> phonebook;
	private Set<String> names;
	private int numNames;

	/**
	 * creates a phonebook
	 */
	public Phonebook() {
		phonebook = new HashMap<String, Contact>();
		names = phonebook.keySet();
		numNames = 0;
	}

	/**
	 * gets the number of names in the phonebook
	 * @return number of contacts
	 */
	public int getNumNames() {
		return numNames;
	}

	/**
	 * adds a contact to the phonebook
	 * @param name String name of the contact
	 * @param number int number of the contact
	 */
	public void addContact(String name, Long number) {
		Contact contact = new Contact(name, number);
		phonebook.put(name, contact);
		numNames++;
	}

	/**
	 * removes a contact from the phonebook
	 * @param name String name of the contact
	 */
	public void removeContact(String name) {
		phonebook.remove(name);
		numNames--;
	}

	/**
	 * adds a new number to the existing contact
	 * @param name String name of the contact
	 * @param number int number of the contact
	 */
	public void addNewNumber(String name, Long number) {
		if (phonebook.containsKey(name)) {
			phonebook.get(name).addNumber(number);
			return;
		}

		throw new IllegalArgumentException(
				"There is no contact in this PhoneBook by that name!");
	}
	
	/**
	 * removes the number of the existing contact
	 * @param name String name of the contact
	 * @param index int index of the number we want to be removed
	 */
	public void removeNumber(String name, int index) {
		if (phonebook.containsKey(name)) {
			phonebook.get(name).removeNumber(index);
			return;
		}

		throw new IllegalArgumentException(
				"There is no user in this PhoneBook by that name!");

	}

	/**
	 * prints the phonebook
	 * @return string
	 */
	public String printPhonebook() {
		String str = "";
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			str += "Name: " + s;
			str += "\nNumbers : \n";
			Iterator<Long> numberValue = phonebook.get(s).getNumbers().iterator();
			while (numberValue.hasNext()) {
				str += numberValue.next();
				str += "\n";
			}
		}
		return str;
	}
	
	/**
	 * prints the contact
	 * @param other Contact 
	 * @return
	 */
	public String printUser(Contact other) {
		return other.ContactToString();
	}

}
