package dao;

import twilio.PrincipalWhatsAPP;
public class DaoWhatsAPP {
	
	private PrincipalWhatsAPP principal;
	
	public DaoWhatsAPP() {
		this.principal= new PrincipalWhatsAPP();
	}
	
	public void mensajeIn(String Mensaje) {
		 principal.twilioConect(Mensaje);
	}
}
