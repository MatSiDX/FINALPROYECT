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
@Table(name = "os")
@Entity

public class Os implements Serializable{
    @Column(name="idos")    
    @Id
    private int idos; 
    @GeneratedValue(strategy = GenerationType.IDENTITY)       
    private String nombre_os; 
    private String dirigente;
    private String tipo_organizacion;
    private String fecha_entrega;
    private String fecha_informe;
    private String vigencia;
}
