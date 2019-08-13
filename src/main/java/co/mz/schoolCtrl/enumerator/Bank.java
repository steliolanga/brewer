package co.mz.schoolCtrl.enumerator;

import java.util.Arrays;
import java.util.List;


public enum Bank   {



    CAIXA("Caixa"), 
    BCI("Bci"),
    MB("Mellennium Bim"),  BIM("Banc ABC"),
    SB("Standard Bank"),
    UNICO("Banco Unico"),
    BARCLAYS("Barclays");

    Bank (String description) {
        this.description = description;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public String getName(){
        return name();
    }

    private static final List<Bank> LIST;

    static {
        List<Bank> list = Arrays.asList(CAIXA, BCI, MB,BIM, SB, UNICO, BARCLAYS);
        LIST = list;
    }

    public static List<Bank> getAll(){
        return LIST;
    }
}
