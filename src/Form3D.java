
abstract class Form3D {
	
	    double x, y;
	    Form3D(double x, double y){
	       this.x = x; this.y = y;
	    }
	    public void deplaceDe( double dx,double dy){ 
	      x+=dx; y+=dy ; }
	    
	    abstract double perimetre();
	   abstract double surface();
	 

	

}
