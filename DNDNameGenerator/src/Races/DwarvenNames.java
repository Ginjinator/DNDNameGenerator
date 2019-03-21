package Races;

public class DwarvenNames {
    private String [] maleNames = {"Alberich", "Baern", "Barendd", "Brottor",
        "Bruenor", "Dain", "Darrak", "Delg", "Eberk", "Einkil", "Fargrim",
        "Flint", "Gardain", "Harbek", "Kildrak", "Morgran", "Orsik",
        "Oskar", "Rangrim", "Rurik", "Taklinn", "Thoradin", "Thorin",
        "Tordek", "Traubon", "Travok", "Ulfgar", "Veit", "Vondal"};

    private String [] femaleNames = {"Amber", "Artin", "Audhild", "Bardryn",
            "Dagnal", "Diesa", "Eldeth", "Falkrunn", "Finellen", "Gunnloda",
            "Gurdis", "Helja", "Hlin", "Kathra", "Kristryd", "Ilde", "Liftrasa",
            "Mardred", "Riswynn", "Sannl", "Torbera", "Torgga", "Vistra"};

    private String [] clanNames = {"Balderk", "Battlehammer", "Brawnanvil",
            "Dankil", "Fireforge", "Frostbeard", "Gorunn", "Holderhek",
            "Ironfist", "Loderr", "Lutgehr", "Rumnaheim", "Strakeln",
            "Torunn", "Ungart"};

    private String createdFirstName = "";
    private String createdClanName = "";

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

        return createdClanName = firstHalf + secondHalf;
    }

}
