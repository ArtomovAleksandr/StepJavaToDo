package aplication.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class TableToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    @Column(columnDefinition = "text")
    String description;

    @Column(columnDefinition = "datetime")
    String datecreate;

    boolean status;
}
