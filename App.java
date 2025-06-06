class Data{
    private int DataPriv = 20; //KeyWordPrivate

    // GETTER:
    int getDataPriv(){
        return this.DataPriv;
    }

    //SETTER
    void setDataPriv(int DataPriv){
        this.DataPriv = DataPriv;
    }
}
public class App {
    public static void main(String[] args){
        Data D1 = new Data();
        System.out.println("nilai ujian fisika dodi = " + D1.getDataPriv());


    }
}
