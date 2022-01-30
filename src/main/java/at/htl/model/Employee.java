package at.htl.model;

import java.time.LocalDate;

public class Employee {
    private Integer employeeid;

    private String lastname;
    private String firstname;
    private String title;
    private String titleofcourtesy;
    private LocalDate birthdate;
    private LocalDate hiredate;
    private String address;
    private String city;
    private String region;
    private String postalcode;
    private String country;
    private String homephone;
    private String extension;
    private byte[] photo;

    // TODO Die Spalte notes soll 2000 Zeichen aufnehmen können!
    private String notes;
    private String photopath;

    // TODO Beziehung zum Vorgesetzten herstellen
}
