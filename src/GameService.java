public interface GameService {
    void add(Game game);
    void update(Game game);
    void delete(Game game);
    void sell(Game game,User user);
    void save(Game game, Campaign campaign, User user);
}
