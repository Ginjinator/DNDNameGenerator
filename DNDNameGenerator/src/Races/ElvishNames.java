package Races;

public class ElvishNames {

    private String [] maleNames = {"Adran", "Aelar", "Aramil", "Arannis",
            "Aust", "Beiro", "Berrian", "Carric" , "Enialis", "Erdan", "Erevan",
            "Galinndan", "Hadarai", "Heian", "Himo", "Immeral", "Ivellios",
            "Laucian", "Mindartis", "Paelias", "Peren", "Quarion", "Riardon",
            "Rolen", "Soveliss", "Thamior", "Tharivol", "Theren", "Varis"};
    private String [] femaleNames = {"Adrie", "Althaea", "Anastrianna",
            "Andraste", "Antinua", "Bethrynna", "Birel", "Caelynn",
            "Drusilia", "Enna", "Felosial", "Ielenia", "Jelenneth", "Keyleth",
            "Leshanna", "Lia", "Meriele", "Meialee", "Naivara", "Quelenna",
            "Quillathe", "Sariel", "Shanairra", "Shava", "Silaqui",
            "Theirastra", "Thia", "Vadania", "Valanthe", "Xanaphia"};
    private String [] familyNames = {"Amakiir", "Amastacia", "Galanodel",
            "Holimion", "Ilphelkiir", "Liadon", "Meliamne",
            "Nai'lo", "Siannodel", "Xiloscient"};

    private String createdFirstName = "";
    private String createdFamilyName = "";

    public String createMaleName(){
        //Pick first name
        int random = (int)(Math.random() * maleNames.length + 1);
        String randomName = maleNames[random-1];
        //get middle of name
        int third = (int)(randomName.length()/3);

        String firstThird = randomName.substring(0, third);

        //Pick second name
        random = (int)(Math.random() * maleNames.length + 1);
        randomName = maleNames[random-1];

        third = (int)(randomName.length()/3);

        String secondThird = randomName.substring(third);

        //Pick third name
        random = (int)(Math.random() * maleNames.length + 1);
        randomName = maleNames[random-1];

        third = (int)(randomName.length()/3);

        String thirdThird = randomName.substring(third);

        return createdFirstName = firstThird + secondThird + thirdThird;
    }

    public String createFemaleName(){
        //Pick first name
        int random = (int)(Math.random() * femaleNames.length + 1);
        String randomName = femaleNames[random-1];
        //get middle of name
        int third = (int)(randomName.length()/3);

        String firstThird = randomName.substring(0, third);

        //Pick second name
        random = (int)(Math.random() * femaleNames.length + 1);
        randomName = femaleNames[random-1];

        third = (int)(randomName.length()/3);

        String secondThird = randomName.substring(third);

        //Pick third name
        random = (int)(Math.random() * femaleNames.length + 1);
        randomName = femaleNames[random-1];

        third = (int)(randomName.length()/3);

        String thirdThird = randomName.substring(third);

        return createdFirstName = firstThird + secondThird + "\'" + thirdThird;
    }

    public String createFamilyName(){
        int random = (int)(Math.random() * familyNames.length + 1);
        String randomName = familyNames[random-1];
        //get middle of name
        int half = (int)(randomName.length()/2);

        String firstHalf = randomName.substring(0, half);

        //Pick second name
        random = (int)(Math.random() * familyNames.length + 1);
        randomName = familyNames[random-1];

        half = (int)(randomName.length()/2);

        String secondHalf = randomName.substring(half);

        return createdFamilyName = firstHalf + secondHalf;
    }

}
