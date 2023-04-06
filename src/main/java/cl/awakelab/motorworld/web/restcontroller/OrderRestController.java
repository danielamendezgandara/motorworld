package cl.awakelab.motorworld.web.restcontroller;

import java.text.ParseException;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.motorworld.domain.repository.OrderRepository;
import cl.awakelab.motorworld.domain.repository.StoreRepository;
import cl.awakelab.motorworld.persistence.entity.Order;
import cl.awakelab.motorworld.persistence.entity.Store;

@RestController
@RequestMapping("/api/order")
public class OrderRestController {

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private StoreRepository storeRepository;

	@GetMapping("/all")
	public List<Order> findAll() {
		return orderRepository.findAll();

	}

	@GetMapping("/allStoreOrderStatusOrderDate")
	public List<Order> findAllStoreOrderStatusOrderDate(@RequestParam("id") int id,
			@RequestParam("orderStatus") int orderStatus,
			@RequestParam(value = "fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
			@RequestParam(value = "toDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date2) throws ParseException {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date1F = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		String date1FS = date1F.format(format);
		LocalDate fromDate = LocalDate.parse(date1FS, format);
		LocalDate date2F = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		String date2FS = date2F.format(format);
		LocalDate toDate = LocalDate.parse(date2FS, format);

		Store store = storeRepository.findStoreById(id);
		short status = (short) orderStatus;
		List<Order> orders = orderRepository.findByStoreAndOrderStatusOrderDate(store, status, fromDate, toDate);
		return orders;
	}
}
