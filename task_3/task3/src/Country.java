
public class Country {
    enum Continent {Australia, Afrika, Evrasia}

    ;
    Continent continent;

    public Continent getContinent(String countr) {
        switch (countr) {
            case "Australia":
                continent = Continent.Australia;
                break;
            case "Sudan":
            case "Uganda":
                continent = Continent.Afrika;
                break;
            case "Ukraine":
            case "France":
            case "Mongolia":
                continent = Continent.Evrasia;
            break;
            default:
                continent = null;
                System.out.println("No this country");
        }
        return continent;


    }
    public static void main(String[] args) {
    Country country = new Country();
    String countr = "Mongolia";
        System.out.println( countr + " is located on the mainland " + country.getContinent(countr));




        }
    }
