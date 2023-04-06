package cl.awakelab.motorworld.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.motorworld.persistence.entity.Brand;

public interface CrudBrand extends JpaRepository<Brand, Integer> {


}
