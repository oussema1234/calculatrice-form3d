
public class parall�l�pip�de extends Form3D {

	   double largeur, longueur;
	   parall�l�pip�de(double x, double y, double la, double lo){
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
