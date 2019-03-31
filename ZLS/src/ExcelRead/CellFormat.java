package ExcelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CellFormat
{

	public static void main(String[] args) throws FileNotFoundException, IOException 
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
						switch(cellobj.getCellTypeEnum())//enum contains cell type and here we chek the cell value type
						{
							case STRING :
								System.out.println(cellobj.getRichStringCellValue());
						        break;
						        
						    case NUMERIC:
									System.out.println(cellobj.getNumericCellValue());
							        break;  
							        
							case BOOLEAN:
										System.out.println(cellobj.getBooleanCellValue());
								        break;   
								        
						    case FORMULA:
											System.out.println(cellobj.getCellFormula());
									        break;		        
						}
					}
					
				}

	}

	private static void Switch(CellType cellTypeEnum) {
		// TODO Auto-generated method stub
		
	}

}
