

	public class cylindre extends Form3D{
	    double rayon;
	    cylindre(double x, double y, double r){
	        super (x , y);
	        rayon = r;
	    }
	    double perimetre(){
	       return 2*Math.PI*rayon;
	    }
	    double surface(){
	       return Math.PI*rayon*rayon;
	    }


}
