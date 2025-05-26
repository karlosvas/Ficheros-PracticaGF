package com.gregorio.ficheros.controller;

import com.gregorio.ficheros.enums.TypesHR;
import com.gregorio.ficheros.model.CSVData;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ControllerFicheros {
    public ArrayList<CSVData> csvList = new ArrayList<>();

    public ArrayList<CSVData> getCsvList() {
        return csvList;
    }

    public void setCsvList(ArrayList<CSVData> csvList) {
        this.csvList = csvList;
    }
    
    public void getFileContentCsv(String path)  {
        try {
            CSVReader reader = new CSVReader(new FileReader(path));
            ArrayList<CSVData> dataList = new ArrayList<>();
            String[] line;
            
            reader.readNext();
            while ((line = reader.readNext()) != null) {
                CSVData data = new CSVData(
                        Integer.parseInt(line[TypesHR.EMPLOYEE_ID.getIndex()]),
                        Integer.parseInt(line[TypesHR.DEPARTMENT_ID.getIndex()]),
                        line[TypesHR.FIRST_NAME.getIndex()],
                        line[TypesHR.LAST_NAME.getIndex()]
                );
                dataList.add(data);
            }
            this.csvList = dataList;
        } catch (IOException | CsvValidationException e) {
            System.err.println("Error leyendo el CSV: " + e.getMessage());
        }
    }
    
    public CSVData BinarySearchCSVFiles(int idSearched){
        Collections.sort(csvList, Comparator.comparingInt(obj -> obj.id));
        int izquierda = 0, derecha = this.csvList.size()-1;
        while(izquierda <= derecha) {
            int medio = (izquierda+derecha)/2;
            int currentId = csvList.get(medio).getId();

            if(currentId == idSearched)
                return csvList.get(medio);
            else if(currentId > idSearched)
                derecha = medio-1;
            else
                izquierda = medio+1;
            
        }
        
        return null;
   }
    
    public void setFileContentCsv(String ruta, CSVData nuevosDatos){
        try {
            // Creamos el writer
            CSVWriter writer = new CSVWriter(new FileWriter(ruta, true));
            
            // Creamos una fila
            String[] fila = new String[10]; // 10 columnas
            fila[TypesHR.EMPLOYEE_ID.getIndex()] = String.valueOf(nuevosDatos.getId());
            fila[TypesHR.DEPARTMENT_ID.getIndex()] = String.valueOf(nuevosDatos.getIdDepartment());
            fila[TypesHR.FIRST_NAME.getIndex()] = nuevosDatos.getName();
            fila[TypesHR.LAST_NAME.getIndex()] = nuevosDatos.getLastname();
            
            // La añadimos al archivo
            writer.writeNext(fila);
        } catch (IOException e) {
            System.err.println("Error Escribiendo el CSV: " + e.getMessage());
        }
    }
}
