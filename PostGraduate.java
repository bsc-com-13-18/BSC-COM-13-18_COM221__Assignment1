public class PostGraduate extends Student{
	private double tuition;
	private double subsistence;
	private double researchGrant;

	PostGraduate(){

	}

	//setters
	public static void set_tuition(double tuition){
		this.tuition = tuition;
	}
	public static void set_subsistence(double subsistence){
		this.subsistence = subsistence;
	}
	public static void set_researchGrant(double researchGrant){
		this.researchGrant = researchGrant;
	}

	//getters
	 public double get_tuition(){
        return tuition;
    }
    public String get_subsistence(){
        return subsistence;
    }
    public int get_researchGrant(){
        return researchGrant;
    }

}