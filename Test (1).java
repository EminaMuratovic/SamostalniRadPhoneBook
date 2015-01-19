/**
 * The task was to make a phonebook.
 * This phonebook had to have options for the user: adding, editing, removing contact and exiting the phonebook.
 * @author eminamuratovic
 *
 */
public class Test {
	public static Phonebook test = new Phonebook();
	public static String name;
	public static Long number;
	public static int index;

	public static void main(String[] args) {
		int numb;
		do {
			System.out.println("Choose: " + "\n1. Add new contact"
					+ "\n2. Edit existing contact" + "\n3. Print the phonebook"
					+ "\n4. Exit the phonebook"
					+ "\n5. Number of contacts in the phonebook");
			numb = TextIO.getlnInt();

			if (numb == 1) {
				addUser();
			}

			if (numb == 2) {
				editUser();
			}

			if (numb == 3) {
				System.out.println(test.printPhonebook());
			}

			if (numb == 4) {
				System.out.println("You left the phonebook! ");
				return;
			}

			if (numb == 5) {
				System.out.println("Number of contacts: " + test.getNumNames());
			}

		} while (numb != 4);

	}
	
	public static void enterTheNameAndIndex() {
		System.out.println("Enter the name of the contact: ");
		name = TextIO.getln();
		System.out.println("Enter the index of the number: ");
		index = TextIO.getInt();
	}

	public static void enterTheNameAndNumber() {
		System.out.println("Enter the name of the contact: ");
		name = TextIO.getln();
		System.out.println("Enter the number of the contact: ");
		number = TextIO.getLong();
	}

	public static void addUser() {
		System.out.println("Enter the name of the contact: ");
		name = TextIO.getln();
		System.out.println("Enter the number of the contact: ");
		number = TextIO.getLong();
		test.addContact(name, number);
	}

	public static void editUser() {
		System.out.println("Do you want to: "
				+ "\n1. add new number to an existing contact"
				+ "\n2. remove number from the existing conatct"
				+ "\n3. remove the contact from the phonebook ?");
		int numb = TextIO.getInt();

		if (numb == 1) {
			enterTheNameAndNumber();
			test.addNewNumber(name, number);
			return;
		}

		if (numb == 2) {
			enterTheNameAndIndex();
			test.removeNumber(name, index);
			return;
		}

		if (numb == 3) {
			System.out.println("Enter the name of the contact: ");
			name = TextIO.getlnString();
			test.removeContact(name);
			return;
		}
	}

}
