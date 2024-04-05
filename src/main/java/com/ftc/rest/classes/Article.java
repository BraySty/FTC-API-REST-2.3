package com.ftc.rest.classes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    private String id;
    private String title;
    private String abstractString;
    private String content;
}
