public class Oven {

    static double mikos = 130;
    static double vathos = 100;
    static double ipsos = 100;
    static String OnomaKataskevasti = " Indesit";
    static String OnomaSiskeuis = " IFWS 3841 ";
    static String TyposSiskeuis = " Oven";
    static String KatanalosiEnergeias = " 3B+";
    static void setMikos(double x) {
        mikos = x;
    }
    static void setVathos(double y) {
        mikos = y;
    }
    static void setIpsos(double z) {
        mikos = z;
    }
    static void setOnomaKataskevasti (int a) {
        OnomaKataskevasti = String.valueOf(a);
    }
    static void setOnomaSiskeuis (int b) {
        OnomaKataskevasti = String.valueOf(b);
    }
    static void setTyposSiskeuis (int c) {
        OnomaKataskevasti = String.valueOf(c);
    }
    static void setKatanalosiEnergeias(int d) {
        OnomaKataskevasti = String.valueOf(d);
    }
    public static void main(String[] args) {
        if (mikos !=130) {
            System.out.println("ERROR");
        } else {
            System.out.println("To mikos einai:" + mikos);
        }
        if (vathos !=100) {
            System.out.println("ERROR");
        } else {
            System.out.println("To vathos einai:" + vathos);
        }
        if (ipsos !=100) {
            System.out.println("ERROR");
        } else {
            System.out.println("To ipsos einai:" + ipsos);
        }
        if(OnomaKataskevasti  == null){
            System.out.println("ERROR");
        }
        else{
            System.out.println("To onoma toy kataskevasti einai:" + OnomaKataskevasti );
        }
        if(OnomaSiskeuis  == null){
            System.out.println("ERROR");
        }
        else{
            System.out.println("To onoma tis siskeuis einai:" + OnomaSiskeuis );
        }
        if(TyposSiskeuis  == null){
            System.out.println("ERROR");
        }
        else{
            System.out.println("O typos tis siskeuis einai:" + TyposSiskeuis );
        }
        if(KatanalosiEnergeias == null){
            System.out.println("ERROR");
        }
        else{
            System.out.println("H katanalosi energeias einai:" + KatanalosiEnergeias );
        }
    }
}