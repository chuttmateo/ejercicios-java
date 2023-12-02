package org.example.streams.flatMap;

import java.util.List;

public class Company {
    private List<Department> departament;

    public Company(List<Department> departament) {
        this.departament = departament;
    }

    public List<Department> getDepartament() {
        return departament;
    }

    public void setDepartament(List<Department> departament) {
        this.departament = departament;
    }
}
