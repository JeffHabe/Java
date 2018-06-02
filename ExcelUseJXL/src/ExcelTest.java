import java.io.File;
import java.io.IOException;
import java.util.Date;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelTest {
	public static void main(String[] args) {
		ExcelTest excelTest = new ExcelTest();
		excelTest.checkOrcreateSheet();
	}

	private static Date Date() {
		return new Date();
	}

	public void checkOrcreateSheet() {
		try {
			Workbook e = Workbook.getWorkbook(new File("Test.xls"));
			Sheet rSheet = e.getSheet(0);
			String test = "text10";
			if (!test.equals(rSheet.getName())) {
				WritableWorkbook wkdata = Workbook.createWorkbook(new File("Test.xls"), e);
				WritableSheet wSheet = wkdata.createSheet("test1", 0);
				Label lbTime = new Label(0, 0, "時間");
				wSheet.addCell(lbTime);
				Label lbTemp = new Label(1, 0, "溫度");
				wSheet.addCell(lbTemp);
				wkdata.write();
				wkdata.close();
				e.close();
			}

			e.close();
		} catch (IOException | BiffException arg7) {
			arg7.printStackTrace();
		} catch (RowsExceededException arg8) {
			arg8.printStackTrace();
		} catch (WriteException arg9) {
			arg9.printStackTrace();
		}

	}
}