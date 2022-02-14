public class Undergraduate extends Student{
	private double tuition;
	private double subsistence;
	private double stationary;

	Undergraduate(){

	}

	//setters
	public static void set_tuition(double tuition){
		this.tuition = tuition;
	}
	public static void set_subsistence(double subsistence){
		this.subsistence = subsistence;
	}
	public static void set_stationary(double stationary){
		this.stationary = stationary;
	}

	//getters
	 public double get_tuition(){
        return tuition;
    }
    public String get_subsistence(){
        return subsistence;
    }
    public int get_stationary(){
        return stationary;
    }
}