package server;
import java.util.List;

import org.jetbrains.annotations.NotNull;

public class Server {


    private List<Drink> favouriteDrinks;


    public List<Drink> drinks(){
        return favouriteDrinks;}
    public void setDrinks(List<Drink> drinks){
        List<Drink> FavouriteDrinks = favouriteDrinks;
    }

    public void addFavouriteDrink(Drink favourite){
        this.favouriteDrinks.add(favourite);}
    public void removeFavouriteDrink(Drink favourite){
        this.favouriteDrinks.remove(favourite);}

    public boolean drinkAvailable(Drink favourite){
        Drink[] drinks = new Drink[0];
        for(Drink Drink : drinks){
            server.Drink drink = Drink;
            if(drink.equals(favourite)) return true;
        }
        return false;
    }

    

    public String canServeGuest(@NotNull Guest guest) {
        if (guest.getAge() < 18) {
            return "old Enough";
        }
        if (guest.getDrunkenness() < 100) {
            return "sober enough";
        }
        if (guest.getMoney() < 5) {
            return "has enough money";
        }
        if (guest.isNotBanned()){
            return "not banned";
        }
        if (guest.currency()){
            return "English currency: £";
        }

        return guest.toString();
    }

  
}
