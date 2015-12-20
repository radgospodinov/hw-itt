package homework1;

public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String newSimMobileNumber) {
		if (hasSimCard) {
			System.out.println("Sim already present");
			return;
		}
		boolean isDigits = true;
		for (int i = 0; i < newSimMobileNumber.length(); i++) {
			if (!Character.isDigit(newSimMobileNumber.charAt(i))) {
				isDigits = false;
			}
		}
		if (newSimMobileNumber.length() == 10 && newSimMobileNumber.startsWith("08") && isDigits) {
			hasSimCard = true;
			simMobileNumber = newSimMobileNumber;
		} else {
			System.out.println("Invalid Sim");
		}

	}

	void removeSimCard() {
		hasSimCard = false;
	}

	void call(GSM receiver, int duration) {
		if (duration > 0 && hasSimCard && receiver.hasSimCard && (!simMobileNumber.equals(receiver.simMobileNumber))) {
			
			outgoingCallsDuration += duration;

			lastOutgoingCall = new Call();
			lastOutgoingCall.caller = simMobileNumber;
			lastOutgoingCall.receiver = receiver.simMobileNumber;
			lastOutgoingCall.duration = duration;
			receiver.lastIncomingCall = new Call();
			receiver.lastIncomingCall.caller = simMobileNumber;
			receiver.lastIncomingCall.receiver = receiver.simMobileNumber;
			receiver.lastIncomingCall.duration = duration;
		} else {
			System.out.println("Invalid Call");
		}

	}

	double getSumForCall() {
		return outgoingCallsDuration * Call.priceForAMinute;
	}

	String printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall != null) {
			return lastOutgoingCall.description(true);
		} else {
			return "No outgoing calls";
		}
	}

	String printInfoForTheLastIncomingCall() {
		if (lastIncomingCall != null) {
			return lastIncomingCall.description(false);
		} else {
			return "No incoming calls";
		}
	}
}
