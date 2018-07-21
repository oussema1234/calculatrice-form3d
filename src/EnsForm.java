
public class EnsForm extends Form3D {

	
	    int taille;
	    Form3D vect[];
	    int cpt;
	   
	    EnsForm(double x,double y,int z)
	    { super(x,y);
	    this.taille= z;
	    cpt=0;
	    vect=new Form3D[taille];
	}

	        
	        void ajouter(Form3D c)
	{
	vect[Form3D]= c;
	        cpt++;
	}
	        int nbreforme()
	{
	    return cpt;
	 }

	       double surfacetotal() {
	double s=0;
	   for(int i=0;i <cpt;i++)
	   {
	       s+=vect[i].surface(); 
	       return s;
	   }
	}
}


