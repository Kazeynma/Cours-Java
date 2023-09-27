public class Exo1 {

    public static void exo1() {

        //exo 1
        String[] emails = new String[10];
        emails[0] = "toto@yahoo.com";
        emails[1] = "jun@hotmail.com";
        emails[2] = "beb@gmail.com";
        emails[3] = "steve@yahoo.com";
        emails[4] = "matt@yahoo.com";
        emails[5] = "won@hotmail.com";
        emails[6] = "iris@hotmail.com";
        emails[7] = "bratt@gmail.com";
        emails[8] = "matthiew@gmail.com";
        emails[9] = "kim@hotmail.com";

        int yahoo = 0;
        int hotmail = 0;
        int gmail = 0;

        for(String email :emails)
        {
            String fournisseurs = email.substring(email.indexOf("@") + 1, email.indexOf("."));
//            switch (fournisseurs) {
//                case "yahoo":
//                    yahoo += 1;
//                    break;
//                case "hotmail":
//                    hotmail += 1;
//                    break;
//                case "gmail":
//                    gmail += 1;
//                    break;
//            }

            if (fournisseurs.equals("yahoo")) {
                yahoo++;
            } else if (fournisseurs.equals("hotmail")) {
                hotmail++;
            } else if (fournisseurs.equals("gmail")) {
                gmail++;
            }
        }

        float pourcentageYahoo = ((float) yahoo *100)/ emails.length;
        float pourcentageHotmail = ((float) hotmail *100)/ emails.length;
        float pourcentageGmail = ((float) gmail *100)/emails.length;


        System.out.println("yahoo : " + pourcentageYahoo + "%");
        System.out.println("hotmail : " + pourcentageHotmail + "%");
        System.out.println("gmail : "+ pourcentageGmail +"%");
    }

}
