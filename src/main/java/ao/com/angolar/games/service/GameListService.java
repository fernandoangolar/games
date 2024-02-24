package ao.com.angolar.games.service;

import ao.com.angolar.games.Dto.GameListDTO;
import ao.com.angolar.games.entities.GameList;
import ao.com.angolar.games.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
        List<GameList> entity = gameListRepository.findAll();
        return  entity.stream().map( dto -> new GameListDTO(dto) ).collect(Collectors.toList());
    }
}
