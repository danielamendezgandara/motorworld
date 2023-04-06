package cl.awakelab.motorworld.domain.repository;

import java.util.List;

import cl.awakelab.motorworld.persistence.entity.Staff;

public interface StaffRepository {
	
	List<Staff> findAll();

	Staff findById(int id);

	Staff save(Staff staff);

	void delete(int id);
}
