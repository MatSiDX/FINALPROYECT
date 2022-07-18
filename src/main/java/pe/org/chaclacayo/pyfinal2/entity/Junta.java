package pe.org.chaclacayo.pyfinal2.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author Asus
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "junta")
@Entity

public class Junta implements Serializable{
    @Column(name="idjunta")    
    @Id
    private int idjunta; 
    @GeneratedValue(strategy = GenerationType.IDENTITY)       
    private String nombre_junta; 
    private String apellidos;
    private int dni;
    private String cargo;   
}
