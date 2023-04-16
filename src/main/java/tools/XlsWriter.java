package tools;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import models.Statistics;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsWriter {

    public static void statisticsWrite(List<Statistics> statisticsList, String fileName) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.getSheet(workbook.createSheet("Статистика").getSheetName());
        XSSFRow row = sheet.createRow(0);

        Font font = workbook.createFont();
        font.setFontHeight((short)276);
        font.setBold(true);
        font.setFontName("Times New Roman");

        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);

        Cell cell0 = row.createCell(0);
        cell0.setCellValue("Профиль обучения");
        cell0.setCellStyle(cellStyle);

        Cell cell1 = row.createCell(1);
        cell1.setCellValue("Средний балл за экзамены");
        cell1.setCellStyle(cellStyle);

        Cell cell2 = row.createCell(2);
        cell2.setCellValue("Количество студентов");
        cell2.setCellStyle(cellStyle);

        Cell cell3 = row.createCell(3);
        cell3.setCellValue("Количество университетов");
        cell3.setCellStyle(cellStyle);

        Cell cell4 = row.createCell(4);
        cell4.setCellValue("Наименования университетов");
        cell4.setCellStyle(cellStyle);


        int i = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for(Statistics statistics: statisticsList){
            row = sheet.createRow(i);

            cell0 = row.createCell(0);
            cell0.setCellValue(statistics.getStudyProfile().getProfileName());

            cell1 = row.createCell(1);
            cell1.setCellValue(statistics.getAvgExamScore());

            cell2 = row.createCell(2);
            cell2.setCellValue(statistics.getStudentsNumber());

            cell3 = row.createCell(3);
            cell3.setCellValue(statistics.getUniNumber());

            cell4 = row.createCell(4);
            cell4.setCellValue(statistics.getUniNames());

            stringBuilder.setLength(0);
            i++;
        }


        FileOutputStream file = new FileOutputStream(fileName);
        workbook.write(file);
        file.close();
        System.out.println("Запись проведена успешно!");
    }
}
