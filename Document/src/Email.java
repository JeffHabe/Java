
public class Email extends Document {

	String sender;
	String recipient;
	String title;

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return "�H��H : " + sender + "\n ����H : " + recipient + "\n �D�� : " + title + "\n ���e : " + text;
	}

	public void setText(String text) {
		super.setText(text);

	}
}
