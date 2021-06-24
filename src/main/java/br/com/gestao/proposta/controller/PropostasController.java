package br.com.gestao.proposta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.gestao.proposta.model.Proposta;
import br.com.gestao.proposta.repository.Propostas;



@Controller
public class PropostasController {
	
	@Autowired
	private Proposta propostas;

	
	@GetMapping("/propostas")
	
	public ModelAndView listar(){
		ModelAndView modelAndView = new ModelAndView("ListaProposta");
		
		//modelAndView.addObject("propostas", propostas.findAll());
		
		return modelAndView;
	}
	
	@PostMapping("/AddProposta")
	public String salvar(Proposta proposta) {
		this.propostas.save(proposta);
		return "redirect:/proposta";
	}
	
	
}
