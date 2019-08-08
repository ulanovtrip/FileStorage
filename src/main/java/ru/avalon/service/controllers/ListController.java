package ru.avalon.service.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ru.avalon.service.services.FileStorageService;
import java.util.stream.Collectors;

@Controller
public class ListController {

    private FileStorageService fileStorageService;

    public ListController(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @GetMapping("/allDownloads")
    public String allDownloads(Model model) {

        model.addAttribute("files", fileStorageService.loadAll().map(
                path -> ServletUriComponentsBuilder.fromCurrentContextPath()
                        //Добавляю указанный путь к существующему пути  компоновщика
                        .path("/download/")
                        //Возвращает имя файла или каталога, обозначенного этим путем как объект
                        .path(path.getFileName().toString())
                        .toUriString())
                .collect(Collectors.toList()));

        return "allDownloads";
    }

}
