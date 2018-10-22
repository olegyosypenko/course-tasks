package ua.training.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Entity {
    private String firstName;
    private String lastName;
    private String phone;
    private String group;
    private String nickName;
    private String email;
    private String date;
    private static Set<String> nicknames;

    static {
        nicknames = new HashSet<String>();
        nicknames.add("qwerty");
        nicknames.add("asdfgh");
    }


    public Entity(String firstName, String secondName, String phone, String group, String nickName,
                  String email, String date) {
        if (!nicknames.add(nickName)) {
            throw new NicknameTakenException();
        }
        this.firstName = firstName;
        this.lastName = secondName;
        this.phone = phone;
        this.group = group;
        this.nickName = nickName;
        this.email = email;
        this.date = date;
    }

    /**
     * Converts entity to String.
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("First name: ").append(firstName).append(";\n");
        result.append("Last name: ").append(lastName).append(";\n");
        result.append("Phone Number: ").append(phone).append(";\n");
        result.append("Group: ").append(group).append(";\n");
        result.append("Nickname: ").append(nickName).append(";\n");
        result.append("Email: ").append(email).append(";\n");
        result.append("Last change date: ").append(date).append(";");

        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(nickName, entity.nickName);
    }

    @Override
    public int hashCode() {
        return this.nickName.hashCode();
    }
}
