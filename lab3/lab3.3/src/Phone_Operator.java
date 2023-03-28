class Phone_Operator {  // имя
    private static int all_clients=0;
    private int id = all_clients++;
    private String Last_name, First_name, Patron, Address; // ФИО и адрес
    private long credit_card;
    private double debet,credit,town_time,intercity_time;


    public Phone_Operator() {
    }

    public Phone_Operator(String last_name, String first_name, String patron, String address,
                          long credit_card, double debet, double credit, double town_time, double intercity_time) {
        Last_name = last_name;
        First_name = first_name;
        Patron = patron;
        Address = address;
        this.credit_card = credit_card;
        this.debet = debet;
        this.credit = credit;
        this.town_time = town_time;
        this.intercity_time = intercity_time;
    }

    public String getFirst_name() {
        return First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public String getPatron() {
        return Patron;
    }

    public String getAddress() {
        return Address;
    }

    public double getId() {
        return id;
    }

    public double getDebet() {
        return debet;
    }

    public double getCredit() {
        return credit;
    }

    public double getTown_time() {
        return town_time;
    }

    public double getIntercity_time() {
        return intercity_time;
    }

    public long getCredit_card() {
        return credit_card;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public void setPatron(String patron) {
        Patron = patron;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDebet(double debet) {
        this.debet = debet;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setTown_time(double town_time) {
        this.town_time = town_time;
    }

    public void setIntercity_time(double intercity_time) {
        this.intercity_time = intercity_time;
    }

    public void setCredit_card(long credit_card) {
        this.credit_card = credit_card;
    }

    @Override
    public String toString() {
        return "Phone_Operator{" +
                "all_clients=" + all_clients +
                ", id=" + id +
                ", Last_name='" + Last_name + '\'' +
                ", First_name='" + First_name + '\'' +
                ", Patron='" + Patron + '\'' +
                ", Address='" + Address + '\'' +
                ", credit_card=" + credit_card +
                ", debet=" + debet +
                ", credit=" + credit +
                ", town_time=" + town_time +
                ", intercity_time=" + intercity_time +
                '}';
    }
}