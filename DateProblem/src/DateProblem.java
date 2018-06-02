import com.jeff.util.Print;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProblem {
	public static void main(String[] args) {
		Date date = new Date();
		DateFormat ddFormat = DateFormat.getDateInstance();
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyyMMdd");
		Print.print(dFormat.format(date));
	}
}