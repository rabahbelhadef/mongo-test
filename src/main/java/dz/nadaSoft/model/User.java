package dz.nadaSoft.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by rabah on 14/05/16.
 */
@Data
public class User {

    @Id
    private String id;

    private String firstName ;

    private String lastName ;

}
