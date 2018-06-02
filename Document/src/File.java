
public class File extends Document {
	String pathName;

	public String getPathName() {
		return pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	public void setText(String text) {
		super.setText(text);

	}

	public String toString() {
		return "¸ô®| : " + pathName + "\n" + "¤º®e : " + text;
	}
}
