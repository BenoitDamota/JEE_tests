package models.forms;

import java.util.*;
import javax.servlet.http.HttpServletRequest;
import models.beans.User;

public class BonjourForm {
	HashMap<String,String> erreurs ;
	
	public BonjourForm() {
		super();
		erreurs = new HashMap<String,String>();
	}

	public User verifierNom(HttpServletRequest request) {
		String nom = request.getParameter("nom");		
		if (( nom != null ) && ( nom.length() >= 3 )) {
			User u = new User();
			u.setNom(nom);
			return u;
		} else {
			erreurs.put("nom", 
					new String("Nom invalide (longueur < 3)"));
		}
		return null;
	}
	
	public HashMap<String, String> getErreurs() {
		return erreurs;
	}

	public void setErreurs(HashMap<String, String> erreurs) {
		this.erreurs = erreurs;
	}
	
	
}
