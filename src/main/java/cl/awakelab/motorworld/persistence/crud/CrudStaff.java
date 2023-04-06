package cl.awakelab.motorworld.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.motorworld.persistence.entity.Staff;

public interface CrudStaff extends JpaRepository<Staff, Integer> {

}
