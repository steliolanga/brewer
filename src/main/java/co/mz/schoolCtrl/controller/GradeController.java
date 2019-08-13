package co.mz.schoolCtrl.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.mz.schoolCtrl.model.Grade;
import co.mz.schoolCtrl.service.GradeServices;


@Controller
public class GradeController {

	@Autowired 
	private GradeServices gradeServices;
		
	//Metedo que inicia que chama a Pagina Inicial
	@RequestMapping("grade/new")
	public ModelAndView novo(Grade grade) {
		ModelAndView mv = new ModelAndView("gradee/insert-gradee");
			return mv;
	}
	
	//Metedo que insere os Dados do formulario para Base de dados
	@RequestMapping(value="grade/new", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Grade grade, BindingResult 
			result, Model model, 
			RedirectAttributes attributes) {
//		
//		
		if (result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Erro ao salvar");
			return novo(grade);
		}
	
		gradeServices.save(grade);
		
		
		attributes.addFlashAttribute("mensagem", "A classe "+grade.getDescription()+" foi inserida");
		
		return new ModelAndView("redirect:/grade/new");
	}
	

	//Metedo que faz  listagem na tabela
	@RequestMapping("/allGrades")
	public ModelAndView list(Grade grade) {
		ModelAndView mv = new ModelAndView("gradee/table-gradee");
		mv.addObject("grades",gradeServices.findAll());
	
		return mv;
	}
	
	

}
