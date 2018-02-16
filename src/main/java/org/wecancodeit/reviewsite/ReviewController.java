package org.wecancodeit.reviewsite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	MovieRepo movieRepo;

	@RequestMapping("/movies")
	public String getAllMovies(Model model) {
		model.addAttribute("reviews", movieRepo.findAll());
		return "movies";
	}

	@RequestMapping("/movie")
	public String getAMovie(@RequestParam Long id, Model model) {
		model.addAttribute("reviews", movieRepo.findOne(id));
		return "movie";
	}

}
