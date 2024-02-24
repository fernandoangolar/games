package ao.com.angolar.games.projections;

public interface GameMinProjection {

    // Esses gets tem que ser em relação as propriedades da query.

    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
