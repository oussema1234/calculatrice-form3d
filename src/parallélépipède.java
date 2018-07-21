
public class parallélépipède extends Form3D {

	   double largeur, longueur;
	   parallélépipède(double x, double y, double la, double lo){
	       super(x, y);
	       largeur = la; longueur = lo;
	    }
	    double perimetre(){
	      return 2*(largeur+longueur);
	    }
	    double surface(){
	      return largeur*longueur;
	    }

}
