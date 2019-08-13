package co.mz.schoolCtrl.enumerator;

import java.util.Arrays;
import java.util.List;


public enum Year   {



    FIRST("2019"),
    SECOND("2020"),
    THIRD("2021");



    Year (String description) {
        this.description = description;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public String getName(){
        return name();
    }

    private static final List<Year> LIST;

    static {
        List<Year> list = Arrays.asList(FIRST, SECOND, THIRD);
        LIST = list;
    }

    public static List<Year> getAll(){
        return LIST;
    }
}
