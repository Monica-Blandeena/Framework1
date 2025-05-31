//package utilities;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFCellStyle;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class excelUtility {
	
//	public static FileInputStream fl;
//    public static FileOutputStream fo;
//    public static XSSFWorkbook wb;
//    public static XSSFSheet sheet;
//    public static XSSFRow row;
//    public static XSSFCell cell;
//    public static XSSFCellStyle cellStyle;
//    
//    String path;
//    
//    public excelUtility(String path) {
//    	this.path=path;
//    }
//    
//	public int getRowCount( String xlsheet) throws IOException {
//        //xlfile path we have to provide
//        //xlsheet name we have to mention
//        fl = new FileInputStream(path);
//        wb = new XSSFWorkbook(fl);
//        sheet = wb.getSheet(xlsheet);
//        int row_count = sheet.getLastRowNum();
//        wb.close();
//        fl.close();
//        return row_count;
//
//    }
//
//    public  int getCellCount(String xlsheet, int rownum) throws IOException {
//        fl = new FileInputStream(path);
//        wb = new XSSFWorkbook(fl);
//        sheet = wb.getSheet(xlsheet);
//        row = sheet.getRow(rownum);
//        int cells = row.getLastCellNum();
//        wb.close();
//        fl.close();
//        return cells;
//    }
//
//    public  String getCellData(String xlsheet, int rownum, int cellnum) throws IOException {
//        fl = new FileInputStream(path);
//        wb = new XSSFWorkbook(fl);
//        sheet = wb.getSheet(xlsheet);
//        row = sheet.getRow(rownum);
//        cell = row.getCell(cellnum);
//        String data;
//        try {
//            data = cell.toString();
//        } catch (Exception e) {
//            data = "";
//        }
//        return data;
//
//    }
//
//    public  void setCellvalue(String xlsheet, int rownum, int cellnum,String data) throws IOException {
//        fl=new FileInputStream(path);
//        wb=new XSSFWorkbook(fl);
//        sheet=wb.getSheet(xlsheet);
//        row=sheet.getRow(rownum);
//        cell=row.createCell(cellnum);
//        cell.setCellValue(data);
//        fo=new FileOutputStream(xlfile);
//        wb.write(fo);
//        wb.close();
//        fl.close();
//        fo.close();
//
//
////    }
//
//}
