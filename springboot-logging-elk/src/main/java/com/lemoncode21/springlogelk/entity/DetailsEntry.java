package com.lemoncode21.springlogelk.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document(collection = "journalEntry")
//@Document
@Data //this is provided by the lambok it will generate getter and setter at the compile time
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class DetailsEntry {
    @Id //unique id
    private ObjectId id;
    @NonNull
    private String title;
    private String content;
    private LocalDateTime date;
}
