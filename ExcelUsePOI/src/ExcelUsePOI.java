import com.jeff.util.Print;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUsePOI {
	XSSFWorkbook workbook;

	public static void main(String[] args) throws Exception {
		ExcelUsePOI ePoi = new ExcelUsePOI();
		ePoi.changeSheetindex();
	}

	public void createWorkBook() throws Exception {
		this.workbook = new XSSFWorkbook();
		this.workbook.createSheet("info");
		FileOutputStream out = new FileOutputStream(new File("Writesheet.xlsx"));
		this.workbook.write(out);
		out.close();
		Print.println("success");
	}

	public void openWB() {
		File file = new File("Writesheet.xlsx");

		try {
			FileInputStream e = new FileInputStream(file);
			this.workbook = new XSSFWorkbook(e);
			if (file.exists() && file.isFile()) {
				Print.println("Opened successful");
			} else {
				Print.println("Opened file");
			}
		} catch (FileNotFoundException arg2) {
			arg2.printStackTrace();
		} catch (IOException arg3) {
			arg3.printStackTrace();
		}

	}

	public void SelectedSheet() throws IOException {
		Throwable arg0 = null;
		Object arg1 = null;

		try {
			XSSFWorkbook wb = new XSSFWorkbook();

			try {
				wb.createSheet("row sheet");
				wb.createSheet("another sheet");
				Sheet sheet3 = wb.createSheet(" sheet 3 ");
				sheet3.setSelected(true);
				wb.setActiveSheet(2);
				XSSFRow row = (XSSFRow) sheet3.createRow(0);
				XSSFCell cell = row.createCell(1);
				cell.setCellValue("Temperature");
				sheet3 = wb.createSheet("2");
				TreeMap inputinfo = new TreeMap();
				inputinfo.put("1", new Object[]{"12:2", "T1", "27.4"});
				inputinfo.put("2", new Object[]{"12:2", "T2", "26.5"});
				inputinfo.put("3", new Object[]{"12:2", "T3", "26.5"});
				inputinfo.put("4", new Object[]{"12:2", "T4", "26.5"});
				inputinfo.put("5", new Object[]{"12:2", "T5", "26.5"});
				Set keyid = inputinfo.keySet();
				int rowID = 0;
				Iterator arg10 = keyid.iterator();

				while (arg10.hasNext()) {
					String key = (String) arg10.next();
					row = (XSSFRow) sheet3.createRow(rowID++);
					Object[] fileOut = (Object[]) inputinfo.get(key);
					int cellID = 0;
					Object[] arg16 = fileOut;
					int arg15 = fileOut.length;

					for (int arg14 = 0; arg14 < arg15; ++arg14) {
						Object obj = arg16[arg14];
						cell = row.createCell(cellID++);
						cell.setCellValue((String) obj);
					}
				}

				Throwable arg37 = null;
				arg10 = null;

				try {
					FileOutputStream arg38 = new FileOutputStream("selectedSheet.xlsx");

					try {
						wb.write(arg38);
					} finally {
						if (arg38 != null) {
							arg38.close();
						}

					}
				} catch (Throwable arg34) {
					if (arg37 == null) {
						arg37 = arg34;
					} else if (arg37 != arg34) {
						arg37.addSuppressed(arg34);
					}

					throw arg37;
				}
			} finally {
				if (wb != null) {
					wb.close();
				}

			}
		} catch (Throwable arg36) {
			if (arg0 == null) {
				arg0 = arg36;
			} else if (arg0 != arg36) {
				arg0.addSuppressed(arg36);
			}

			throw arg0;
		}
	}

	public void changeSheetindex() {
		File file = new File("Writesheet.xlsx");

		try {
			FileInputStream e = new FileInputStream(file);
			this.workbook = new XSSFWorkbook(e);
			Print.println(this.workbook.getSheetName(0));
			Print.println(Integer.valueOf(this.workbook.getActiveSheetIndex()));
			Print.println(this.workbook.getSheetName(this.workbook.getActiveSheetIndex()));
			XSSFSheet rSheet = this.workbook.createSheet("125");
			this.workbook.setActiveSheet(this.workbook.getSheetIndex(rSheet.getSheetName()));
			String lastDay = this.workbook.getSheetName(0);
			FileOutputStream out = new FileOutputStream(new File("WriteSheet.xlsx "));
			this.workbook.write(out);
			out.close();
			Print.println("Writed successful");
		} catch (FileNotFoundException arg5) {
			arg5.printStackTrace();
		} catch (IOException arg6) {
			arg6.printStackTrace();
		}

	}

	public void createaAndWriteSheet() {
		File file = new File("Writesheet.xlsx");

		try {
			FileInputStream e = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(e);
			XSSFSheet rSheet = workbook.createSheet("1");
			rSheet = workbook.cloneSheet(0, "113");
			workbook.removeSheetAt(0);
			XSSFRow row = rSheet.createRow(0);
			XSSFCell cell = row.createCell(1);
			cell.setCellValue("Temperature");
			rSheet = workbook.createSheet("2");
			TreeMap inputinfo = new TreeMap();
			inputinfo.put("1", new Object[]{"12:2", "T1", "27.4"});
			inputinfo.put("2", new Object[]{"12:2", "T2", "26.5"});
			inputinfo.put("3", new Object[]{"12:2", "T3", "26.5"});
			inputinfo.put("4", new Object[]{"12:2", "T4", "26.5"});
			inputinfo.put("5", new Object[]{"12:2", "T5", "26.5"});
			Set keyid = inputinfo.keySet();
			int rowID = 0;
			Iterator arg10 = keyid.iterator();

			while (arg10.hasNext()) {
				String out = (String) arg10.next();
				row = rSheet.createRow(rowID++);
				Object[] objArr = (Object[]) inputinfo.get(out);
				int cellID = 0;
				Object[] arg16 = objArr;
				int arg15 = objArr.length;

				for (int arg14 = 0; arg14 < arg15; ++arg14) {
					Object obj = arg16[arg14];
					cell = row.createCell(cellID++);
					cell.setCellValue((String) obj);
				}
			}

			FileOutputStream arg19 = new FileOutputStream(new File("WriteSheet.xlsx "));
			workbook.write(arg19);
			arg19.close();
			Print.println("Writed successful");
		} catch (FileNotFoundException arg17) {
			arg17.printStackTrace();
		} catch (IOException arg18) {
			arg18.printStackTrace();
		}

	}

	public void readSheet() {
		try {
			FileInputStream e = new FileInputStream(new File("Writesheet.xlsx"));
			OPCPackage pkg = OPCPackage.open(e);
			XSSFWorkbook workbook = new XSSFWorkbook(pkg);

			for (int i = 0; i < workbook.getNumberOfSheets(); ++i) {
				XSSFSheet rsSheet = workbook.getSheetAt(i);
				Print.println(workbook.getSheetName(i));
				Print.println("rowNum : " + rsSheet.getLastRowNum());
				Iterator arg6 = rsSheet.iterator();

				while (arg6.hasNext()) {
					Row row = (Row) arg6.next();
					Print.println("Row num" + row.getRowNum());
					Iterator arg8 = row.iterator();

					while (arg8.hasNext()) {
						Cell cell = (Cell) arg8.next();
						Print.print(cell + "  ");
					}

					Print.println();
				}
			}

			pkg.close();
		} catch (FileNotFoundException arg9) {
			arg9.printStackTrace();
		} catch (IOException arg10) {
			arg10.printStackTrace();
		} catch (InvalidFormatException arg11) {
			arg11.printStackTrace();
		}

	}

	public void writeSheet() {
		try {
			OPCPackage e = OPCPackage.open(new FileInputStream("Writesheet.xlsx"));
			Workbook workbook = WorkbookFactory.create(e);
			Sheet rsSheet = workbook.getSheetAt(0);
			int rowNum = rsSheet.getLastRowNum();
			++rowNum;
			Row row = rsSheet.createRow(rowNum);
			Print.println(Integer.valueOf(rowNum));
			Cell cell = row.createCell(0);
			SimpleDateFormat sDF = new SimpleDateFormat("hh:mm:ss");
			cell.setCellValue(sDF.format(new Date()));
			cell = row.createCell(1);
			cell.setCellValue("T" + Math.random() * 10.0D);
			cell = row.createCell(2);
			cell.setCellType(CellType.NUMERIC);
			DecimalFormat dlFormat = new DecimalFormat("#.##");
			double val = Double.parseDouble(dlFormat.format(Math.random() * 10.0D + 20.0D + Math.random()));
			cell.setCellValue(val);
			FileOutputStream out = new FileOutputStream("Writesheet.xlsx");
			workbook.write(out);
			out.close();
			e.close();
		} catch (InvalidFormatException arg11) {
			arg11.printStackTrace();
		} catch (IOException arg12) {
			arg12.printStackTrace();
		}

	}

	public void loopWrite() {
		try {
			for (int e = 0; e < 100; ++e) {
				OPCPackage oPackage = OPCPackage.open(new FileInputStream("Writesheet.xlsx"));
				XSSFWorkbook workbook = new XSSFWorkbook(oPackage);
				XSSFSheet rsSheet = workbook.getSheetAt(0);
				int rowNum = rsSheet.getLastRowNum();
				++rowNum;
				XSSFRow row = rsSheet.createRow(rowNum);
				Print.println(Integer.valueOf(rowNum));
				XSSFCell cell = row.createCell(0);
				SimpleDateFormat sDF = new SimpleDateFormat("hh:mm:ss");
				cell.setCellValue(sDF.format(new Date()));
				cell = row.createCell(1);
				cell.setCellValue("T" + (int) (Math.random() * 10.0D + 1.0D));
				cell = row.createCell(2);
				cell.setCellType(CellType.NUMERIC);
				DecimalFormat dlFormat = new DecimalFormat("#.##");
				double val = Double.parseDouble(dlFormat.format(Math.random() * 10.0D + 20.0D + Math.random()));
				cell.setCellValue(val);
				FileOutputStream out = new FileOutputStream("Writesheet.xlsx");
				workbook.write(out);
				out.close();
				oPackage.close();
			}
		} catch (IOException arg12) {
			arg12.printStackTrace();
		} catch (InvalidFormatException arg13) {
			arg13.printStackTrace();
		}

	}
}