package ua.training.model;

public enum Group {
    FIRST, SECOND, THIRD;

    /**
     * Return RegularExpression to check if word matches any group's name.
     * @return String
     */
    public static String getRegular() {
        StringBuilder result = new StringBuilder("(");
        Group[] groups = Group.values();
        for (int i = 0; i < groups.length; i++) {
            if (i < groups.length - 1) {
                result.append(groups[i].toString().toLowerCase()).append("|");
            }
            else {
                result.append(groups[i].toString().toLowerCase()).append(")");
            }
        }
        return result.toString();
    }
}
