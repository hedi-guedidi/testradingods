package io.github.hedi_guedidi.testreading;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.odftoolkit.simple.SpreadsheetDocument;
import org.odftoolkit.simple.table.Cell;
import org.odftoolkit.simple.table.Table;

import java.io.IOException;



public class Readertest {

	
	public static void main(String[] args) throws Exception{
		
		ODSReader reader;
		SpreadsheetDocument document = null;
		Table sheet = null;
		Cell cell;
		String data;
		
		final Path infile = Path.of("src/main/resources/AARempli.ods");
		InputStream stream= Files.newInputStream(infile);
		document = SpreadsheetDocument.loadDocument(stream);
		sheet=document.getTableByName("Emplois du temps");
		cell =sheet.getCellByPosition("B2");
		data=cell.getDisplayText();
		
		System.out.println(data);
		System.out.println(sheet.getCellByPosition("F2").getDisplayText());
		
		
	}
}
