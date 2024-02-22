package ao.com.angolar.games.controllers;

import ao.com.angolar.games.Dto.GameDTO;
import ao.com.angolar.games.entities.Game;
import ao.com.angolar.games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    private GameService gameService;


    @GetMapping
    public List<GameDTO> findAll () {
        return gameService.findAll();
    }
}
