package ua.training.controller;

public interface RegularExpressions {
    public final String FIRST_NAME_REGULAR_EXPRESSION = "[A-Z]{1}[a-z]+";
    public final String LAST_NAME_REGULAR_EXPRESSION = "[A-Z]{1}[a-z]";
    public final String MOBILE_PHONE_REGULAR_EXPRESSION = "[(]{1}[0-9]{3}[)]{1}[0-9]{3}[-]{1}[0-9]{2}[-]{1}[0-9]{2}";
    public final String NICKNAME_REGULAR_EXPRESSION = "[A-Za-z0-9]{6,15}";
    public final String EMAIL_REGULAR_EXPRESSION = "[A-Za-z0-9]{2,15}@[A-Za-z0-9]{2,8}.[a-z]{2,4}";
    public final String LAST_CHANGE_DATE_REGULAR_EXPRESSION = "\\d{1,2}[.]{1}\\d{1,2}[.]{1}\\d{4}";
}
