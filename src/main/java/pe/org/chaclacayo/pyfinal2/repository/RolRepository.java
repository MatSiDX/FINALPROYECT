/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.org.chaclacayo.pyfinal2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.org.chaclacayo.pyfinal2.entity.Rol;

/**
 *
 * @author admin
 */
@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    
}
