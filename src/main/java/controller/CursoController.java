package controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import service.CursoService;
import domain.Curso;

@Controller
public class CursoController {
	
	@Autowired
	CursoService cursoService;
	@RequestMapping(value = "/curso", method = RequestMethod.POST)
	String findCurso(@ModelAttribute Curso codigo, ModelMap model) {
		Curso curso=cursoService.getCod(codigo.codigo);
		model.addAttribute("curso", curso);
		return "curso";
	}
	@RequestMapping(value = "/curso2", method = RequestMethod.POST)
	String findCurso2(@ModelAttribute Curso nombre, ModelMap model) {
		Curso curso=cursoService.getNom(nombre.nombre);
		model.addAttribute("curso2", curso);
		return "curso2";
	}
	@RequestMapping(value = "/curso", method = RequestMethod.GET)
	String showCurso(@RequestParam(required = false) Long id, ModelMap model) {
		if (id != null) {
			Curso curso = cursoService.get(id);
			model.addAttribute("curso", curso);
			return "curso";
		} else {
			Collection<Curso> cursos = cursoService.getAll();
			model.addAttribute("cursos", cursos);
			return "cursos";
		}
	}
	@RequestMapping(value = "/buscar-curso", method = RequestMethod.GET)
	String findCod(@RequestParam(required = false) Long id, ModelMap model) {
		return "buscar-curso";
	}
	@RequestMapping(value = "/buscar-curso-part-nom", method = RequestMethod.GET)
	String findNom(@RequestParam(required = false) Long id, ModelMap model) {
		return "/buscar-curso-part-nom";
	}

}
