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

        return createdFirstName = firstThird + secondThird + thirdThird;
    }


}
