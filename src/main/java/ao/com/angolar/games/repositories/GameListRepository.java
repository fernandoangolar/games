package ao.com.angolar.games.repositories;

import ao.com.angolar.games.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
