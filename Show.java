public class Show {


    private String date;
    private int someNumber;
    private int someNumber2;
    private String Name;
    private String place;


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public int getSomeNumber() {
        return someNumber;
    }


    public void setSomeNumber(int someNumber) {
        this.someNumber = someNumber;
    }


    public int getSomeNumber2() {
        return someNumber2;
    }


    public void setSomeNumber2(int someNumber2) {
        this.someNumber2 = someNumber2;
    }


    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    public String getPlace() {
        return place;
    }


    public void setPlace(String place) {
        this.place = place;
    }


//    public Show(String date, int  someNumber, int someNumber2, String Name, String place){
//        this.date = date;
//        this.someNumber = someNumber;
//        this.someNumber2 = someNumber2;
//        this.Name = Name;
//        this.place = place;
//    }


    @Override
    public String  toString() {
        String output = "";
//        output += "Date "+ getDate()+"\n";
//        output += "Some Number1 "+ getSomeNumber()+"\n";
//        output += "Some Number2 "+ getSomeNumber2()+"\n";
//        output += "Name "+ getName()+"\n";
//        output += "Place "+ getPlace()+"\n";\
        for(int i = 0; i< TicketMaster.allShows.size()-1; i++){
            output += TicketMaster.allShows.get(i);
        }
        return output;
    }

}

