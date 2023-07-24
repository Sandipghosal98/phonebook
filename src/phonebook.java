import java.util.Scanner;

public class phonebook {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		boolean r = true;
		do {
			System.out.println("1.Create Contact\n2.Display Contact\n3.Edit Contact\n4.Delete Contact\n5.Exit");
			int n = sc.nextInt();
			switch(n) {
			case 1: {
				Createcontract.create();
			}break;
			case 2:{
				DisplayContact.display();
			}break;
			case 3: {
				EditContact.edit();
			}break;
			case 4: {
				DeleteContack.delete();
			}break;
			case 5: {
				r = false;
			}
		}
	}
		while(r); {
		}
	}

}
