package br.uniso;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class integracaoExcel {

    public static void main(String args[]){
        try {
            String nomeArquivo = "Excel.xlsx";
            File file = new File(nomeArquivo);
            FileInputStream fis = new FileInputStream(file);
            Workbook workbook = null;

            //ESPERTEZA da validaçao
            if(nomeArquivo.endsWith("xls")){
                workbook = new HSSFWorkbook(fis);
            }
            else if(nomeArquivo.endsWith("xlsx")){
                workbook = new XSSFWorkbook(fis);
            }

            Sheet planilha1 = workbook.getSheetAt(0);

            // Linha a linha

            for(int i=0; i< 4; i++){
                Row row = planilha1.getRow(i);

                // pegando as coluna (Cell)
                for(int j=0; j<2; j++){
                    Cell coluna = row.getCell(j);
                    if(coluna.getCellType() == Cell.CELL_TYPE_NUMERIC)
                        System.out.print("\t" + coluna.getNumericCellValue());

                    if(coluna.getCellType() == Cell.CELL_TYPE_STRING)
                        System.out.print("\t" + coluna.getStringCellValue());
                    System.out.println();
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
