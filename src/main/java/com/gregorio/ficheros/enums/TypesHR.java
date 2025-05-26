package com.gregorio.ficheros.enums;

public enum TypesHR {
    EMPLOYEE_ID(0),
    FIRST_NAME(1),
    LAST_NAME(2),
    EMAIL(3),
    PHONE_NUMBER(4),
    HIRE_DATE(5),
    JOB_ID(6),
    SALARY(7),
    COMMISSION_PCT(8),
    MANAGER_ID(9),
    DEPARTMENT_ID(10);
    
    private final int index;
    private final int COLUMNAS_NUM = 10;

    TypesHR(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
    
    public int getColumnasNum(){
        return this.COLUMNAS_NUM;
    }
}
