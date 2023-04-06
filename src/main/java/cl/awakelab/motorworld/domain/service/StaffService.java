package cl.awakelab.motorworld.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.motorworld.domain.repository.StaffRepository;
import cl.awakelab.motorworld.persistence.crud.CrudStaff;
import cl.awakelab.motorworld.persistence.entity.Staff;


@Service
public class StaffService implements StaffRepository{

	@Autowired
	CrudStaff repoStaff;
	
	@Override
	public List<Staff> findAll() {
		// TODO Auto-generated method stub
		return repoStaff.findAll();
	}

	@Override
	public Staff findById(int id) {
		// TODO Auto-generated method stub
		Optional<Staff> opcional = repoStaff.findById(id);
		Staff staff = null;
		if (opcional.isPresent())
			staff = opcional.get();
		return staff;
	}

	@Override
	public Staff save(Staff staff) {
		
		return repoStaff.save(staff);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repoStaff.deleteById(id);
	}

}
