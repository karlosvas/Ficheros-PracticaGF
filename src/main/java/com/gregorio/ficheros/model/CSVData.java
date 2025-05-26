package com.gregorio.ficheros.model;

public class CSVData {
    public int id;
    public int idDepartment;
    public String name;
    public String lastname;
    
    public CSVData (int id, int idDepartment, String name, String lastname){
        this.id = id;
        this.idDepartment = idDepartment;
        this.name = name;
        this.lastname = lastname;
    }
    
    public CSVData(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "id=" + id + ", idDepartment=" + idDepartment + ", name=" + name + ", lastname=" + lastname;
    }
}
