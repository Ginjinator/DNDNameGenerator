package Races;

public class HalflingNames {

    private String [] maleNames = {"Alton", "Ander", "Cade", "Corrin", "Eldon", "Errich",
            "Finnan", "Garret", "Lindal", "Lyle", "Merric", "Milo", "Osborn",
            "Perrin", "Reed", "Roscoe", "Wellby"};
    private String [] femaleNames = {"Andry", "Bree", "Callie", "Cora", "Euphemia",
            "Jillian", "Kithri", "Lavinia", "Lidda", "Merla", "Nedda", "Paela",
            "Portia", "Seraphina", "Shaena", "Trym", "Vani", "Verna"};
    private String [] familyNames = {"Brushgather", "Goodbarrel", "Greenbottle",
            "High-hill", "Hilltopple", "Leagallow", "Tealeaf", "Thorngage",
            "Tosscobble", "Underbough"};

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
