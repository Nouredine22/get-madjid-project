package learningjava;

import java.util.HashMap;

public class UseHshMap {


    public static void main(String[] args){
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);


        // out put will be {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}


    }
}
