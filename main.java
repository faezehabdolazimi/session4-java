package ir.isc.session5;

public class main {

	public main(String[] args) {
		liaison a=new liaison("frst new");
		liaison b=new liaison("2th new");
		liaison c=new liaison("3th new");
		
		a.conect();
		b.conect();
		c.conect();
		
		liaison.getinstance();
		liaison.getinstance();
		liaison.getinstance();


	}

}
