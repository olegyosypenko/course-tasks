package ua.training.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Model {
    private Set<String> nicknames;
    private List<Entity> entities;

    public Model() {
        this.nicknames = new HashSet<>();
        this.nicknames.add("qwertyu");
        this.nicknames.add("asdfghj");
        this.entities = new ArrayList<>();
    }

    /**
     * If nickname is taken throws NicknameTakenException else creates an entity.
     *
     * @param firstName
     * @param lastName
     * @param phone
     * @param group
     * @param nickname
     * @param email
     * @param date
     */
    public void addEntity(String firstName, String lastName, String phone, String group, String nickname,
                          String email, String date) {
        this.checkNickname(nickname);
        Entity entity = new Entity();
        entity.initEntity(firstName, lastName, phone, group, nickname, email, date);
        this.entities.add(entity);
    }

    /**
     * Returns entities.
     * @return
     */
    public List<Entity> getEntities() {
        return this.entities;
    }

    private void checkNickname(String nickname) {
        if (!this.nicknames.add(nickname)) {
            throw new NicknameTakenException();
        }
    }
}
