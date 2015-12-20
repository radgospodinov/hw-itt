package homework1;

public class CallGSMDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSM pesho = new GSM();
		pesho.model = "HTC One M7";
		pesho.insertSimCard("0888444222");
		GSM gosho = new GSM();
		gosho.model = "iPhone 6S";
		gosho.insertSimCard("0888144221");

		pesho.call(gosho, 4);
		gosho.call(pesho, 8);
		pesho.call(gosho, 10);

		System.out.println("Pesho has to pay: " + pesho.getSumForCall());
		System.out.println("Gosho has to pay: " + gosho.getSumForCall());

		System.out.println("Pesho's last outgoing: " + "\n" + pesho.printInfoForTheLastOutgoingCall());
		System.out.println("Pesho's last incoming: " + "\n" + pesho.printInfoForTheLastIncomingCall());

		System.out.println("Gosho's last outgoing: " + "\n" + gosho.printInfoForTheLastOutgoingCall());
		System.out.println("Gosho's last incoming: " + "\n" + gosho.printInfoForTheLastIncomingCall());

		pesho.removeSimCard();

		gosho.call(pesho, 5);

		pesho.insertSimCard("08abc12345");
	}

}
