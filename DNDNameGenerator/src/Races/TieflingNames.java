package Races;

public class TieflingNames {
    private String [] maleNames = {"Baggi", "Emen", "Engong", "Kansif",
            "Myev", "Neega", "Ovak", "Ownka", "Shautha", "Sutha", "Vola",
            "Volen", "Yevelda"};
    private String [] femaleNames = {"Akta", "Anakis", "Bryseis", "Criella",
            "Damaia", "Ea", "Kallista", "Lerissa", "Makaria", "Nemeia",
            "Orianna", "Phelaia", "Rieta"};

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


}
