package cl.awakelab.motorworld.web.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.motorworld.domain.service.OrderService;
import cl.awakelab.motorworld.domain.service.StoreService;
import cl.awakelab.motorworld.persistence.entity.Order;
import cl.awakelab.motorworld.persistence.entity.Store;

@Controller
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService serviceOrder;
	
	@Autowired
	private StoreService serviceStore;
	@GetMapping("/list")
	public String mostrarBuscador(Model model) {
		List<Store> stores = serviceStore.findAll();
		List<Order> orders = serviceOrder.findAll();
		model.addAttribute("stores", stores);
		model.addAttribute("orders",orders);
		model.addAttribute("postResponse",false);
		return "orders/list";
	}
	
	@PostMapping("/list")
	public String mostrarListaOrdenesSeleccionadas(HttpServletRequest request,Model model) {
		String id = request.getParameter("store");
		String status = request.getParameter("status");
		String date1 = request.getParameter("fromDate");
		String date2 = request.getParameter("toDate");
		String orderStatusS = "";
		if(status.equals("1")) {
		  orderStatusS = "Pendiente";
		  model.addAttribute("orderStatusS",orderStatusS);
		}else if (status.equals("2")) {
		  orderStatusS = "En Proceso";
		  model.addAttribute("orderStatusS",orderStatusS);
		}else if (status.equals("3")) {
		  orderStatusS= "Rechazada";
		  model.addAttribute("orderStatusS",orderStatusS);
		}else if(status.equals("4")) {
		  orderStatusS = "Completada";
		  model.addAttribute("orderStatusS",orderStatusS);
		}
		DateTimeFormatter format= DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate fromDate = LocalDate.parse(date1,format);
		LocalDate toDate = LocalDate.parse(date2,format);
		System.out.println(fromDate);
		int idStore = Integer.parseInt(id);
		short statusInt = (short) Integer.parseInt(status);
		Store store = serviceStore.findStoreById(idStore);
		String storeName = store.getStoreName();
		List<Store> stores = serviceStore.findAll();
		List<Order> orders = serviceOrder.findByStoreAndOrderStatusOrderDate(store, statusInt, fromDate, toDate);
		model.addAttribute("orders",orders);
		model.addAttribute("stores", stores);
		model.addAttribute("storeName",storeName);
		model.addAttribute("fromDate",date1);
		model.addAttribute("toDate",date2);
		model.addAttribute("postResponse",true);
		return "orders/list";
	}
	
}
