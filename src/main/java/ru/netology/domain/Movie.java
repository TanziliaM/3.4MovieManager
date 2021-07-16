package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
public class Movie {
  private int id;
  private String movieName;
  private String imgUrl;
  private String genre;
}
