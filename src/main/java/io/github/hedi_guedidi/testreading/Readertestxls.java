package io.github.hedi_guedidi.testreading;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;


public class Readertestxls {
	public static void main(String[] args) throws Exception{
		

		String data;
		

		final Path infile = Path.of("src/main/resources/AARempli.xls");
		InputStream stream= Files.newInputStream(infile);
		HSSFWorkbook document=new HSSFWorkbook(stream);    
		HSSFSheet sheet=document.getSheetAt(1);
		CellAddress cellAddress = new CellAddress("B2");
		Row row = sheet.getRow(cellAddress.getRow());
		Cell cell = row.getCell(cellAddress.getColumn());
		data=cell.getStringCellValue();
		
		System.out.println(data);
		
		
	}
}
