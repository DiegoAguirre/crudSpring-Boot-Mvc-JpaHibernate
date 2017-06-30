package com.test.pe.view.controller;

import java.util.List;

import javax.validation.Valid;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.pe.domain.Auditory;
import com.test.pe.domain.Employee;
import com.test.pe.domain.Shop;
import com.test.pe.domain.exception.CustomHibernateException;
import com.test.pe.service.AuditoryService;
import com.test.pe.service.EmployeeService;
import com.test.pe.service.ShopService;
import com.test.pe.view.form.AuditoryForm;

@Controller
@EnableAutoConfiguration
@RequestMapping("/main")
public class MainController {

	@Autowired
	ShopService shopService;

	@Autowired
	EmployeeService employeeService;

	@Autowired
	AuditoryService auditoryService;

	@Autowired
	Mapper dozerBeanMapper;

	@RequestMapping(value = "/say", method = RequestMethod.GET)
	public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		String message = "";
		try {
			List<Shop> shops = shopService.getAll();
			List<Employee> employees = employeeService.getAll();
			model.addAttribute("auditory", new AuditoryForm());
			model.addAttribute("name", name);
			model.addAttribute("shops", shops);
			model.addAttribute("employees", employees);
		} catch (CustomHibernateException e) {
			message = e.getMessage();
		} catch (Exception e) {
			message = "Error ha ocurrido";
		}
		model.addAttribute("message", message);
		return "greeting";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String processProductBrand(@Valid @ModelAttribute("auditory") AuditoryForm auditoryForm,
			BindingResult result, final Model model) {

		String message = "";
		if (result.hasErrors()) {
			message = result.getAllErrors().get(0).getDefaultMessage();
			model.addAttribute("message", message);
			return "showMessage";
		} else {

			Auditory auditory = auditoryForm.GetAuditory();

			try {
				auditoryService.add(auditory);
				message = "Insertado Correctamente";
			} catch (CustomHibernateException ex) {
				message = "Error = " + ex.getMessage();
			} catch (Exception ex) {
				message = "error ha ocurrido";
			} finally {
				model.addAttribute("message", message);
			}
			return "showMessage";
		}
	}
}
