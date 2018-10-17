package ua.training.controller;

public interface RegularExpressions {
    String FIRST_NAME_REGULAR_EXPRESSION = "[A-Z]{1}[a-z]+";
    String LAST_NAME_REGULAR_EXPRESSION = "[A-Z]{1}[a-z]+";
    String MOBILE_PHONE_REGULAR_EXPRESSION = "[(]{1}[0-9]{3}[)]{1}[0-9]{3}[-]{1}[0-9]{2}[-]{1}[0-9]{2}";
    String NICKNAME_REGULAR_EXPRESSION = "[A-Za-z0-9]{6,15}";
    String EMAIL_REGULAR_EXPRESSION = "[A-Za-z0-9]{2,15}@[A-Za-z0-9]{2,8}.[a-z]{2,4}";
    String LAST_CHANGE_DATE_REGULAR_EXPRESSION = "\\d{1,2}[.]{1}\\d{1,2}[.]{1}\\d{4}";
    String LAST_ADD_DATE_REGULAR_EXPRESSION = "\\d{1,2}[.]{1}\\d{1,2}[.]{1}\\d{4}";
    String SKYPE_REGULAR_EXPRESSION = "[a-zA-Z][a-zA-Z0-9\\.,\\-_]{5,31}";
    String ZIPCODE_REGULAR_EXPRESSION = "\\d{5}([ \\-]\\d{4})?";
    String STREET_REGULAR_EXPRESSION = "^((.){1,}(\\d){1,}(.){0,})$";
    String CITY_REGULAR_EXPRESSION = "^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
    String BUILDING_NUMBER_REGULAR_EXPRESSION = "[0-9]{1,4}";
    String FLAT_NUMBER_REGULAR_EXPRESSION = "[0-9]{1,4}";
    String COMMENT_REGULAR_EXPRESSION = "[A-Za-z0-9]";
}
