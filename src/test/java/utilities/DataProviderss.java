//package utilities;
//
//import java.io.IOException;
//
//import org.testng.annotations.DataProvider;
//
//public class DataProviderss {
//	
//		@DataProvider(name="LoginData")
//		public String [][] getData() throws IOException{
//			String path="C:\\Users\\hp\\eclipse-workspace\\Framework1\\src\\test\\java\\utilities\\excelUtility.java";
//			excelUtility xlutil=new  excelUtility(path);
//			
//			int totalrows=xlutil.getRowCount("sheet1");
//			int totalcells=xlutil.getCellCount("sheet1",1);
//			
//			String loginData[][]=new String[totalrows][totalcells];
//			
//			for(int i=1;i<=totalrows;i++) {
//				for(int j=0;j<totalcells;j++) {
//					loginData[i-1][j]=xlutil.getCellData("sheet1", i, j);
//				}
//			}
//			return loginData;
//		}
//
//}
