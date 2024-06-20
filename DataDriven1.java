package excelOperation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataDriven1 {
	public static ArrayList<String> getData(String id) throws IOException {

		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<>();
		
		FileInputStream fis=new FileInputStream("C:\\Excelfiles\\employees.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		System.out.println("I reached the Excel");
		
		int sheets=workbook.getNumberOfSheets();
		System.out.println("The Number of sheets present in the excel = " +sheets );
		
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				 XSSFSheet sheet=workbook.getSheetAt(i);

				 Iterator<Row> rows=sheet.iterator();
				 Row firstRow=rows.next();
				 
				 Iterator<Cell> cell=firstRow.cellIterator();
				 int k=0;
				 int column=0;
				 while(cell.hasNext()) {
					 Cell value=cell.next();
					 if(value.getStringCellValue().equalsIgnoreCase("Name")) {
						 column=k;
					 }
					 k++;
					 }
					 System.out.println(column);
					 
					 while(rows.hasNext()) {
						 Row r=rows.next();
						 Cell idcell=r.getCell(column);
						 String cellvalue;
						 if(idcell.getCellType()==CellType.NUMERIC) {
							 cellvalue=NumberToTextConverter.toText(idcell.getNumericCellValue());
						 }
						 else {
							 cellvalue=idcell.getStringCellValue();
						 }
						 
						 if(cellvalue.equalsIgnoreCase(id)) {
							Iterator<Cell> cl=r.cellIterator();
							while(cl.hasNext()) {
								Cell c=cl.next();
								if(c.getCellType()==CellType.STRING) {
									a.add(c.getStringCellValue());
								}
								else{
									a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
								}	
					    }
					}	 
				 }
			}
	}
		return a;
	}

	public static void main(String[] args) throws IOException {
		ArrayList<String> data=getData("Charlie");
		
		int i=0;
		while(i<data.size()) {
			System.out.println(data.get(i));
			i++;
			
		}
		
		
	}
	}
