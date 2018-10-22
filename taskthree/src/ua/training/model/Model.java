package ua.training.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Model {
    private List<Entity> entities;

    public Model() {
        this.entities = new ArrayList<>();
    }

    /**
     * If nickname is taken throws NicknameTakenException else creates an entity.
     *
     * @param firstName first name
     * @param lastName last name
     * @param phone phone number
     * @param group group
     * @param nickname nickname
     * @param email email
     * @param date last date update
     */
    public void addEntity(String firstName, String lastName, String phone, String group, String nickname,
                          String email, String date) {
        Entity entity = new Entity(firstName, lastName, phone, group, nickname, email, date);
        this.entities.add(entity);
    }

    /**
     * Returns entities.
     * @return entities
     */
    public List<Entity> getEntities() {
        return this.entities;
    }

}
