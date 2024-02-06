package com.collins.backend.dtos;

import com.opencsv.bean.CsvBindByName;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentCsvRepresentation {

    @CsvBindByName(column = "first_name")
    private String fname;
    @CsvBindByName(column = "last_name")
    private String lname;
    @CsvBindByName(column = "age")
    private int age;
}
