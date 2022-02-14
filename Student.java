Public class Student{
    private name;
    private programOfStudy;
    private yearOfStudy;

    Student(){

    }
    //Setters
    static void set_name(String name){
        this.name = name;
    }
    static void set_programOfStudy(String programOfStudy){
        this.programOfStudy = programOfStudy;
    }
    static int set_yearOfStudy(int yearOfStudy){
        this.yearOfStudy = yearOfStudy;
    }

    //Getters
    public String get_name(){
        return name;
    }
    public String get_programOfStudy(){
        return programOfStudy;
    }
    public int get_yearOfStudy(){
        return yearOfStudy;
    }
}