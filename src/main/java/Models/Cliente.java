package Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Cliente {

    private Integer dni;
    private String nombre;
    private String email;
    private Integer telefono;
}
