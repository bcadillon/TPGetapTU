package org.ldv.sio.getap;

public class Exemple {

	Integer itg = new Integer(1);
	Long lng = new Long(1);
	Classe SIO22 = new Classe(itg, "SIO22");
	
	Discipline PPE = new Discipline(itg, "PPE");
	
	User NBR = new User(lng, "Nizar", "Ben Ragdel", SIO22, "élève");
	User OKP = new User(lng, "Olivier", "Capuozzo", SIO22, "professeur", PPE);
	
	AccPersonalise SDL = new AccPersonalise(itg, "Salon Du Libre", 1, lng);
	
}