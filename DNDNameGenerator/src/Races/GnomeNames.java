package Races;

public class GnomeNames {
    private String [] maleNames = {"Alvyn", "Boddynock", "Brocc", "Burgell",
            "Dimble", "Eldon", "Erky", "Fonkin", "Frug", "Gerbo", "Gimble",
            "Glim", "Jebeddo", "Kellen", "Namfoodle", "Orryn", "Roondar",
            "Seebo", "Sindri", "Warryn", "Wrenn", "Zook"};
    private String [] femaleNames = {"Bimpnottin", "Breena", "Caramip", "Carlin",
            "Donella", "Duvamil", "Ella", "Ellyjobell", "Ellywick", "Lilli",
            "Loopmottin", "Lorilla", "Mardnab", "Nissa", "Nyx", "Oda", "Orla",
            "Roywyn", "Shamil", "Tana", "Waywocket", "Zanna"};
    private String [] clanNames = {"Beren", "Daergel", "Folkor", "Garrick", "Nackle",
            "Murnig", "Ningel", "Raulnor", "Scheppen", "Timbers", "Turen", "Abren",
            "Aelnor", "Bachin", "Banilor", "Blackrock", "Blimth", "Danask", "Durim", "Fasketel", "Furnak",
            "Galeb", "Greatorm", "Grosko", "Hardin", "Hymnir", "Jarnak", "Kellen", "Kyri", "Lundor", "Merren",
            "Nessik", "Pernor", "Quindal", "Ranadal", "Rivenstone", "Rustek", "Rutvor", "Sasken", "Shasto",
            "Skerrit", "Tamble", "Tavartarr", "Terrick", "Turco", "Urvor", "Uvarkk", "Vandek", "Vilio", "Walnir",
            "Whitehorn", "Yimble"};

    private String createdFirstName = "";
    private String createdFamilyName = "";

    public String createMaleName(){
        //Pick first name
        int random = (int)(Math.random() * maleNames.length + 1);
        String randomName = maleNames[random-1];
        //get middle of name
        int half = (int)(randomName.length()/2);

        String firstHalf = randomName.substring(0, half);

        //Pick second name
        random = (int)(Math.random() * maleNames.length + 1);
        randomName = maleNames[random-1];

        half = (int)(randomName.length()/2);

        String secondHalf = randomName.substring(half);

        return createdFirstName = firstHalf + secondHalf;
    }

    public String createFemaleName(){
        //Pick first name
        int random = (int)(Math.random() * femaleNames.length + 1);
        String randomName = femaleNames[random-1];
        //get middle of name
        int half = (int)(randomName.length()/2);

        String firstHalf = randomName.substring(0, half);

        //Pick second name
        random = (int)(Math.random() * femaleNames.length + 1);
        randomName = femaleNames[random-1];

        half = (int)(randomName.length()/2);

        String secondHalf = randomName.substring(half);

        return createdFirstName = firstHalf + secondHalf;
    }

    public String createClanName(){
        int random = (int)(Math.random() * clanNames.length + 1);
        String randomName = clanNames[random-1];
        //get middle of name
        int half = (int)(randomName.length()/2);

        String firstHalf = randomName.substring(0, half);

        //Pick second name
        random = (int)(Math.random() * clanNames.length + 1);
        randomName = clanNames[random-1];

        half = (int)(randomName.length()/2);

        String secondHalf = randomName.substring(half);

        return createdFamilyName = firstHalf + secondHalf;
    }
}
