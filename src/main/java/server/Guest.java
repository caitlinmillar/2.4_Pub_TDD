package server;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

import static server.Drink.*;


public class Guest {
    private String name;
    private Integer age;
    private Integer drunkenness;
    private Boolean boolVar;
    private Integer money;
    private Currency currency;



    public Guest(String name, Integer age, Integer drunkenness, Integer money) {
        this.name = name;
        this.age = age;
        this.drunkenness = drunkenness;
        this.money = money;
        Server guest = null;}

    public void favouriteDrink(){

        //guest.addAll(BEER);

        guest.add(GIN);
        guest.add(WINE);
        guest.add(COCKTAIL);
    }


    public Guest(Integer drunkenness) {
        for (Integer value = 100; value < Integer.MAX_VALUE; value++) {
            Boolean isNotTooDrunk = Boolean.TRUE;
        }
    }

    public boolean isNotBanned() {
        return boolVar;
    }

    public boolean currency() {
        return boolVar;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String ann) {
        this.name = ann;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDrunkenness() {
        return this.drunkenness;
    }

    public void setDrunkenness(Integer drunk) {
        this.drunkenness = drunk;
    }

    public Integer getMoney() {
        return this.money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public boolean getCurrency(Locale english) {
        var currency = this.currency;
        return false;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    private List<Drink> drinks;
    private List<Drink> guest = new ArrayList<Drink>();
    public void Drink() {
        this.guest = new ArrayList<Drink>();


    }
}

//    public boolean getCurrency(Locale english) {
//    }
    // public Boolean getIsNotBanned()
//    public void setCurrency(Character currency) {
//        Character £ = null;
//        Character currency1 = £;
//    }
//    public List<server.Guest> guests;





//        server.Guest must be over 18
//        server.Guest must have enough money (each drink should cost £5.00, if they have more, they can be served)
//        server.Guest must be sober enough (using an integer scale, 100-50 they are sober enough, under 50 refused!)
//        server.Guest must not be banned from the pub
//        server.Guest must have money in the local currency (Hint: Use a char for the currency symbol)