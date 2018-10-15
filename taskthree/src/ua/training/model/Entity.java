package ua.training.model;

public class Entity {
    private String firstName;
    private String lastName;
    private String phone;
    private String group;
    private String nickName;
    private String email;
    private String date;

    public void initEntity(String firstName, String secondName, String phone, String group, String nickName,
                           String email, String date) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.phone = phone;
        this.group = group;
        this.nickName = nickName;
        this.email = email;
        this.date = date;
    }

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
}
