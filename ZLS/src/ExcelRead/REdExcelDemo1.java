package ExcelRead;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class REdExcelDemo1 
{

	public static void main(String[] args) throws InvalidFormatException, IOException
	{
		//XSSFWorkbook workbook1=new XSSFWorkbook("./resources/ReadDemo.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(new FileInputStream("./resources/Readcol.xlsx"));
		XSSFSheet worksheet=workbook.getSheet("Sheet1");
		/*System.out.println(worksheet.getRow(0).getCell(0));
		System.out.println(worksheet.getRow(0).getCell(1));*/
		Iterator<Row> rows=worksheet.iterator();//give access of all the rows from workshhet which contains data.
		
		while(rows.hasNext())//hasnext check weather perticular row is having data or not.
		{
			Row rowobj=rows.next();//to get the access for particular row if data is present
			Iterator<Cell> cells=rowobj.cellIterator();
			while(cells.hasNext())
			{
				Cell cellobj=cells.next();
				System.out.println(cellobj.getStringCellValue());
			}
			
		}
		
		/*XSSFRow row= sheet.getRow(0);
		XSSFCell cell=row.getCell(0);
		System.out.println(cell);*/
		
	}

}
