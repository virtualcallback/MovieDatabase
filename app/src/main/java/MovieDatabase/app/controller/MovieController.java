package MovieDatabase.app.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import MovieDatabase.app.model.entities.Movie;
import MovieDatabase.app.model.repositories.MovieRepository;

@Controller
@RequestMapping("movies")
public class MovieController {
	
	//private MovieRepositoryInMemory movieRepository = new MovieRepositoryInMemory();
	@Autowired
	private MovieRepository movieRepository;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String list(Model view) {
		view.addAttribute("movies", movieRepository.findAll());
		view.addAttribute("view", "templates/pages/list_all");		
		return HomeController.home(view);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public String list(@PathVariable Long id, Model view) {
		view.addAttribute("movie", movieRepository.findOne(id));
		view.addAttribute("view", "templates/pages/movie_view");		
		return HomeController.home(view);
	}
	
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String create(Model view, Movie movie) {
		view.addAttribute("view", "templates/pages/movie_create");		
		return HomeController.home(view);
	}
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String create(Movie movie) {
		movieRepository.saveAndFlush(movie);	
		return "redirect:/movies";
	}
	
	@RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable Long id, Model view, Movie movie) {
		view.addAttribute("movie", movieRepository.findOne(id));
		view.addAttribute("view", "templates/pages/movie_edit");
		return HomeController.home(view);
	}
	
	@RequestMapping(value = "update/{id}", method = RequestMethod.POST)
	public String update(@PathVariable Long id, Movie movie) {
		Movie existingMovie = movieRepository.findOne(id);
		BeanUtils.copyProperties(movie, existingMovie);
		movieRepository.saveAndFlush(existingMovie);
		return "redirect:/movies";
	}
	
	@RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
	public String delete(@PathVariable Long id) {
		Movie existingMovie = movieRepository.findOne(id);
		movieRepository.delete(existingMovie);
		return "redirect:/movies";
	}
	
	@RequestMapping(value = "{id}/play", method = RequestMethod.GET)
	public String play(@PathVariable Long id, Model view) {
		view.addAttribute("movie", movieRepository.findOne(id));
		view.addAttribute("view", "templates/pages/not_supported");
		return HomeController.home(view);
	}
	
	

}
