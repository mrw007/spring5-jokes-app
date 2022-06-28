package mrw007.springframework.spring5jokesapp.controllers;

import mrw007.springframework.spring5jokesapp.services.ChuckNorrisQuotesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final ChuckNorrisQuotesServiceImpl chuckNorrisQuotesServiceImpl;

    public JokesController(ChuckNorrisQuotesServiceImpl chuckNorrisQuotesServiceImpl) {
        this.chuckNorrisQuotesServiceImpl = chuckNorrisQuotesServiceImpl;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", chuckNorrisQuotesServiceImpl.getRandomQuote());
        return "index";
    }


}
