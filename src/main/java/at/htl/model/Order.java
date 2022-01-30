package at.htl.model;

import java.time.LocalDate;

public class Order {
    private Integer orderid;

    private LocalDate orderDate;
    private LocalDate requiredDate;
    private LocalDate shippedDate;
    private Integer freight;
    private String shipname;
    private String shipaddress;
    private String shipcity;
    private String shipregion;
    private String shippostalcode;
    private String shipcountry;

    // TODO Beziehung zum Customer
    // TODO Beziehung zum Employee
}
