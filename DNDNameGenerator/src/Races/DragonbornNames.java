package Races;

public class DragonbornNames {

    private String [] maleNames = {"Arjhan", "Balasar", "Bharash", "Donaar", "Ghesh",
            "Heskan", "Kriv", "Medrash", "Mehen", "Nadarr", "Pandjed",
            "Patrin", "Rhogar", "Shamash", "Shedinn", "Tarhun", "Torinn"};
    private String [] femaleNames = {"Akra", "Biri", "Daar", "Farideh", "Harann",
            "Flavilar", "Jheri", "Kava", "Korinn", "Mishann", "Nala", "Perra",
            "Raiann", "Sora", "Surina", "Thava", "Uadjit"};
    private String [] clanNames = {"Clethtinthiallor", "Daardendrian", "Delmirev",
            "Drachedandion", "Fenkenkabradon", "Kepeshkmolik",
            "Kerrhylon", "Kimbatuul", "Linxakasendalor", "Myastan",
            "Nemmonis", "Norixius", "Ophinshtalajiir", "Prexijandilin",
            "Shestendeliath", "Turnuroth", "Verthisathurgiesh", "Yarjerit"};

    private String createdFirstName = "";
    private String createdClanName = "";

    public String createMaleName(){
        int random = (int)(Math.random() * 10 + 1);
        String randomName = "";
        if(random > 5) {
            //Pick first name
            random = (int) (Math.random() * maleNames.length + 1);
            randomName = maleNames[random - 1];
            //get middle of name
            int half = (int) (randomName.length() / 2);

            String firstHalf = randomName.substring(0, half);

            //Pick second name
            random = (int) (Math.random() * maleNames.length + 1);
            randomName = maleNames[random - 1];

            half = (int) (randomName.length() / 2);

            String secondHalf = randomName.substring(half);

            return createdFirstName = firstHalf + secondHalf;
        } else {
            //Pick first name
            random = (int) (Math.random() * maleNames.length + 1);
            randomName = maleNames[random - 1];
            //get middle of name
            int third = (int) (randomName.length() / 3);

            String firstThird = randomName.substring(0, third);

            //Pick second name
            random = (int) (Math.random() * maleNames.length + 1);
            randomName = maleNames[random - 1];

            third = (int) (randomName.length() / 3);

            String secondThird = randomName.substring(third);

            //Pick third name
            random = (int) (Math.random() * maleNames.length + 1);
            randomName = maleNames[random - 1];

            third = (int) (randomName.length() / 3);

            String thirdThird = randomName.substring(third);

            return createdFirstName = firstThird + secondThird + thirdThird;
        }
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
        //Pick first name
        int random = (int)(Math.random() * clanNames.length + 1);
        String randomName = clanNames[random-1];
        //get middle of name
        int third = (int)(randomName.length()/3);

        String firstThird = randomName.substring(0, third);

        //Pick second name
        random = (int)(Math.random() * clanNames.length + 1);
        randomName = clanNames[random-1];

        third = (int)(randomName.length()/2);

        String secondThird = randomName.substring(third);

        //Pick third name
        random = (int)(Math.random() * clanNames.length + 1);
        randomName = clanNames[random-1];

        third = (int)(randomName.length()/2);

        String thirdThird = randomName.substring(third);

        return createdFirstName = firstThird + secondThird + thirdThird;
    }
}
