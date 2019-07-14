package Adnotacje;

import java.lang.reflect.Field;

public class TeddyBearAgeValidator {
    public static boolean validate(Object o) throws IllegalAccessException{
        Field[] fields = o.getClass().getDeclaredFields();
        for (Field field: fields){
            MaxLenght annotation = field.getAnnotation(MaxLenght.class);
            if (annotation != null){
                field.setAccessible(true);
                String age = (String) field.get(o);
                if (age.length() >annotation.minValue() && age.length() < annotation.maxValue()) {
                    return true;
                }
                field.setAccessible(false);
            }
        }
        return false;
    }
}
