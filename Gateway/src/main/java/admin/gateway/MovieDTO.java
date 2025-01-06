package admin.gateway;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO implements Serializable {
    private Long id;
    private String title;
    private String director;
    private String genre;
    private int year;
}