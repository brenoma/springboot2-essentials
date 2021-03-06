package academy.breno.springboot2.controller;

import academy.breno.springboot2.domain.Anime;
import academy.breno.springboot2.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
@AllArgsConstructor
public class AnimeController {

    private DateUtil dateUtil;

    @GetMapping("list")
    public List<Anime> list() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));

        return List.of(new Anime("Attack on Titan"),
                new Anime("Demon Slayer"),
                new Anime("Code Geass")
        );
    }
}
