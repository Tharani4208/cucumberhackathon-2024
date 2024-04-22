package utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtility {
	public static XSSFWorkbook wb;
	public static XSSFSheet s;
	public static XSSFSheet s1;
	public static FileOutputStream file;
	public static void excelUtility() throws FileNotFoundException {
		String path = System.getProperty("user.dir")+"\\TestData\\FindingHospital.xlsx";
		file = new FileOutputStream(path);
		wb=new XSSFWorkbook();
		s=wb.createSheet("Doctors");
		s1=wb.createSheet("surgery");
		
	}
	
	public static void output1(List<String> doctor) throws FileNotFoundException {
		ExcelUtility.excelUtility();
		XSSFRow row1 = s.createRow(0);
		row1.createCell(0).setCellValue("Top 5 doctors detail");
		for(int row=1; row<=doctor.size(); row++) {
			XSSFRow rows = s.createRow(row);
			rows.createCell(0).setCellValue(doctor.get(row-1));
		}
	}	
	public static void output2(List<String> surgery) {
		XSSFRow row2 = s1.createRow(0);
		row2.createCell(0).setCellValue("Available surgery");
		for(int row=1; row<=surgery.size(); row++) {
			XSSFRow rows = s1.createRow(row);
			rows.createCell(0).setCellValue(surgery.get(row-1));
		}
	}
	
	public static void closeExcel() throws IOException {
		wb.write(file);
		wb.close();
		file.close();
	}
}
