package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        String caminhoArquivo = "C:\\Users\\lucas.teles\\Documents\\NCMs.xlsx";
        String dtPeriodoIni = "2019.01";
        String dtPeriodoFim = "2022.12";

        List<Map<String, String>> resultados = new ArrayList<>();
        Map<String, LocalDate> ultimoPeriodoNcm = new HashMap<>();
        Map<String, String> ultimoDtFim = new HashMap<>();

        // Simulando a leitura do arquivo Excel
        // Suponha que os dados são lidos do arquivo Excel aqui

        // Simulando a contagem dos NCMs
        Map<String, Integer> contagemNcm = new HashMap<>();
        contagemNcm.put("NCM1", 3);
        contagemNcm.put("NCM2", 4);
        contagemNcm.put("NCM3", 2);

        for (Map.Entry<String, Integer> entry : contagemNcm.entrySet()) {
            String ncm = entry.getKey();
            int count = entry.getValue();
            LocalDate[] periodos = LocalDate.now().datesUntil(LocalDate.now().plusYears(4)).toArray(LocalDate[]::new); // Simulando períodos

            ultimoPeriodoNcm.put(ncm, periodos[count]);

            for (int i = 0; i < periodos.length - 1; i++) {
                String dtIni = periodos[i].format(DateTimeFormatter.ofPattern("yyyy.MM"));
                String dtFim = periodos[i + 1].format(DateTimeFormatter.ofPattern("yyyy.MM"));

                if (ultimoDtFim.containsKey(ncm) && ultimoDtFim.get(ncm).equals(dtIni)) {
                    dtIni = periodos[i].plusMonths(1).format(DateTimeFormatter.ofPattern("yyyy.MM"));
                }

                ultimoDtFim.put(ncm, dtFim);

                Map<String, String> resultado = new HashMap<>();
                resultado.put("NCM", ncm);
                resultado.put("dt_periodo_ini", dtIni);
                resultado.put("dt_periodo_fim", dtFim);
                resultados.add(resultado);
            }
        }

        // Ordenando os resultados por NCM e dt_periodo_ini (Java 8+)
        resultados.sort((a, b) -> {
            int cmp = a.get("NCM").compareTo(b.get("NCM"));
            if (cmp != 0) return cmp;
            return a.get("dt_periodo_ini").compareTo(b.get("dt_periodo_ini"));
        });

        // Salvando os resultados em um arquivo Excel
        try (XSSFWorkbook workbook = new XSSFWorkbook()) {
            XSSFSheet sheet = workbook.createSheet("Resultados");

            int rowNum = 0;
            for (Map<String, String> map : resultados) {
                Row row = sheet.createRow(rowNum++);
                int cellNum = 0;
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    Cell cell = row.createCell(cellNum++);
                    cell.setCellValue(entry.getValue());
                }
            }

            Path arquivo = Paths.get("C:\\Users\\lucas.teles\\Documents\\NCMsAjustado.xlsx");
            try (FileOutputStream outputStream = new FileOutputStream(arquivo.toFile())) {
                workbook.write(outputStream);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}