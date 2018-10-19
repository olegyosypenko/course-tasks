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

    public void addEntity(String firstName, String secondName, String phone, String group, String nickName,
                          String email, String date) {
        Entity entity = new Entity();
        entity.initEntity(firstName, secondName, phone, group, nickName, email, date);
        this.entities.add(entity);
    }

    public List<Entity> getEntities() {
        return this.entities;
    }

    public void checkNickname(String nickname) {
        if (!this.nicknames.add(nickname)) {
            throw new NicknameTakenException();
        }
    }
}
