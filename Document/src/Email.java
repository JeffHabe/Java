
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
		return "寄件人 : " + sender + "\n 收件人 : " + recipient + "\n 主旨 : " + title + "\n 內容 : " + text;
	}

	public void setText(String text) {
		super.setText(text);

	}
}
