package cl.awakelab.motorworld.web.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.motorworld.domain.repository.BrandRepository;
import cl.awakelab.motorworld.persistence.entity.Brand;

@RestController
@RequestMapping("/api/brand")
public class BrandRestController {

  @Autowired	
  private BrandRepository brandRepository;
  
  @GetMapping("/all")
  public List<Brand> findAll(){
	  List<Brand> brands = brandRepository.findAll();
	  return brands;
  }

}
