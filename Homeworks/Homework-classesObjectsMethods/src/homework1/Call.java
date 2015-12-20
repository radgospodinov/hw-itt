package homework1;

public class Call {
	static double priceForAMinute = 0.45;
	String caller;
	String receiver;
	int duration;

	String description(boolean isOutgoing) {
		StringBuilder sb = new StringBuilder();
		sb.append("Caller = " + caller + "\n");
		sb.append("Receiver = " + receiver + "\n");
		sb.append("Duration = " + duration + "\n");
		if (isOutgoing) {
			sb.append("Sum to pay = " + (duration * priceForAMinute));
		}
		return sb.toString();
	}
}
