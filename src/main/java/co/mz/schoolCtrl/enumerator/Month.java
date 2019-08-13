package co.mz.schoolCtrl.enumerator;

import java.util.Arrays;
import java.util.List;


public enum Month   {



    JANUARY("Janeiro"),
    FEBRUARY("Fevereiro"),
    MARCH("Marco"),
    APRIL("Abril"),
    MAY("Maio"),
    JUNE("Junho"),
    JULY("Julho"),
    AGOST("Agosto"),
    SETEMBER("Setembro"),
    OCTUBER("Outubro"),

    NOVEMBER("Novembro"),
    DECEMBER("Dezembro");

    Month (String description) {
        this.description = description;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public String getName(){
        return name();
    }

    private static final List<Month> LIST;

    static {
        List<Month> list = Arrays.asList(JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,JULY,AGOST,SETEMBER,OCTUBER,NOVEMBER,DECEMBER);
        LIST = list;
    }

    public static List<Month> getAll(){
        return LIST;
    }
}
