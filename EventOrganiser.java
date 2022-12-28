public class EventOrganiser {
    private String CUSTID;
    private Sttring CUSTNAME;
    private String CUSTADDR;
    private String CUSTEMAIL;
    private String CUSTPHONE;

    public void setCUSTEMAIL(String CUSTEMAIL) {
        this.CUSTEMAIL = CUSTEMAIL;
    }

    public void setCUSTADDR(String CUSTADDR) {
        this.CUSTADDR = CUSTADDR;
    }

    public void setCUSTID(String CUSTID) {
        this.CUSTID = CUSTID;
    }

    public void setCUSTNAME(Sttring CUSTNAME) {
        this.CUSTNAME = CUSTNAME;
    }

    public void setCUSTPHONE(String CUSTPHONE) {
        this.CUSTPHONE = CUSTPHONE;
    }

    public String getCUSTADDR() {
        return CUSTADDR;
    }
    public String getCUSTPHONE() {
        return CUSTPHONE;
    }
    public Sttring getCUSTNAME() {
        return CUSTNAME;
    }
    public String getCUSTID() {
        return CUSTID;
    }

    public static void PrintGuest(Arraylist<EventOrganiser>daftar_tamu) {
        Arraylist<EventOrganiser>daftar_tamu = new Arraylist<EventOrganiser>daftar_tamu();
        int tamu = 10;
        EventOrganiser[] daftar_tamu = new EventOrganiser[10];
        for (int index =0; index< daftar_tamu.length; index++);

        System.out.println("\n ========== Data Guest ==========");
        for (EventOrganiser tamu : daftar_tamu){
            System.oout.println("Id\t:"+tamu.getCUSTID());
            System.out.println("name\t:"+tamu.getCUSTNAME());
            System.out.println("addr\t:"+tamu.getCUSTADDR());
            System.out.println("email\t:"+tamu.getCUSTEMAIL());
            System.out.println("phone\t:"+tamu.getCUSTPHONE());
        }

    }

    public void cetaktamuundanganevetorganiser(){
        System.out.println(this. getCUSTID());
        System.out.println(this. getCUSTNAME());
        System.out.println(this. getCUSTADDR());
        System.out.println(this. getCUSTEMAIL());
        System.out.println(this. getCUSTPHONE());
        System.out.println();
    }

    public EventOrganiser (String CUSTID, String CUSTNAME, String CUSTADDR, String CUSTEMAIL, String CUSTPHONE) {
        thisCUSTID();
        this. CUSTNAME();
        this. CUSTADDR();
        this. CUSTEMAIL();
        this. CUSTPHONE();

    }
}
