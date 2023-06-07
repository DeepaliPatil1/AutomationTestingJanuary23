package utility;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadData 
{


	static XSSFWorkbook  workbook;
	
	public static String [][] testData()
	
	{
		
		//We need to read excel file
		try
		{
		FileInputStream flie = new FileInputStream("C:\\Users\\icon\\eclipse-workspace\\AutomationTestingJanuary23\\TestData\\ContactData.xlsx");
		// ms excel filr
		
		 workbook = new XSSFWorkbook(flie);
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		XSSFSheet  sheet = workbook.getSheet("CreatData");

		int rows = sheet.getLastRowNum();
		
		System.out.println(rows);
		
		
		int column = sheet.getRow(0).getLastCellNum();
		System.out.println(column);
		
		String data[][] = new String[rows][column];
				
		for(int i = 0; i<rows; i++) // outer for loop will handale rows
		{
		  
			for(int j = 0; j < column; j++)// inter for loop wil handle column
			{
				 data[i][j] = sheet.getRow(i+1).getCell(j).toString();
				
			}
			
		}
		
		return data;
	}
	

}
