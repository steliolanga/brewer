package co.mz.schoolCtrl.enumerator;

import java.util.Arrays;
import java.util.List;


public enum Period   {



    MATUTUINO("Matutuino"),
    VESPERTINO("Vespertino"),
    NOCTURNO("Nocturno");



    Period (String description) {
        this.description = description;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public String getName(){
        return name();
    }

    private static final List<Period> LIST;

    static {
        List<Period> list = Arrays.asList(MATUTUINO, VESPERTINO, NOCTURNO);
        LIST = list;
    }

    public static List<Period> getAll(){
        return LIST;
    }
}
