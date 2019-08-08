package ru.avalon.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.avalon.service.services.FileStorageService;
import ru.avalon.service.transfer.UserDto;
import ru.avalon.service.security.details.UserDetailsImpl;

@Controller
public class IndexController {

    @GetMapping("/")
    public String getProfilePage(ModelMap model, Authentication authentication) {
        if (authentication == null) {
            return "redirect:/login";
        }

        UserDetailsImpl details = (UserDetailsImpl)authentication.getPrincipal();
        UserDto user = UserDto.from(details.getUser());
        //добавление атрибута
        model.addAttribute("user", user);
        return "upload";
    }
}
