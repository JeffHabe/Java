import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CellStyle {
	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet spreadsheet = workbook.createSheet("cellstyle");
		XSSFRow row = spreadsheet.createRow(1);
		row.setHeight(800);
		XSSFCell cell = row.createCell(1);
		cell.setCellValue("test of merging");
		spreadsheet.addMergedRegion(new CellRangeAddress(1, 1, 1, 4));
		row = spreadsheet.createRow(5);
		cell = row.createCell(0);
		row.setHeight(800);
		XSSFCellStyle style1 = workbook.getCellStyleAt(0);
		spreadsheet.setColumnWidth(0, 8000);
		style1.setAlignment(HorizontalAlignment.LEFT);
		style1.setVerticalAlignment(VerticalAlignment.TOP);
		cell.setCellValue("Top Left");
		cell.setCellStyle(style1);
		row = spreadsheet.createRow(6);
		cell = row.createCell(1);
		row.setHeight(800);
		XSSFCellStyle style2 = workbook.createCellStyle();
		style2.setAlignment(HorizontalAlignment.CENTER);
		style2.setVerticalAlignment(VerticalAlignment.CENTER);
		cell.setCellValue("Center Aligned");
		cell.setCellStyle(style2);
		XSSFCellStyle style3 = workbook.createCellStyle();
		style3.setAlignment(HorizontalAlignment.RIGHT);
		style3.setVerticalAlignment(VerticalAlignment.BOTTOM);
		cell.setCellValue("Bottom Right");
		cell.setCellStyle(style3);
		row = spreadsheet.createRow(8);
		cell = row.createCell(3);
		XSSFCellStyle style4 = workbook.createCellStyle();
		style4.setAlignment(HorizontalAlignment.JUSTIFY);
		style4.setVerticalAlignment(VerticalAlignment.JUSTIFY);
		cell.setCellValue("Contents are Justified in Alignment");
		cell.setCellStyle(style4);
		row = spreadsheet.createRow(10);
		row.setHeight(800);
		cell = row.createCell(1);
		cell.setCellValue("BORDER");
		XSSFCellStyle style5 = workbook.createCellStyle();
		style5.setBorderBottom(BorderStyle.THICK);
		style5.setBottomBorderColor(IndexedColors.BLUE.getIndex());
		style5.setBorderLeft(BorderStyle.DOUBLE);
		style5.setLeftBorderColor(IndexedColors.GREEN.getIndex());
		style5.setBorderRight(BorderStyle.HAIR);
		style5.setRightBorderColor(IndexedColors.RED.getIndex());
		style5.setBorderTop(BorderStyle.DASH_DOT_DOT);
		style5.setTopBorderColor(IndexedColors.CORAL.getIndex());
		cell.setCellStyle(style5);
		FileOutputStream out = new FileOutputStream(new File("cellstyle.xlsx"));
		workbook.write(out);
		out.close();
		System.out.println("cellstyle.xlsx written successfully");
	}
}