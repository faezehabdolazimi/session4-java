package ir.isc.session5;

public class liaison {
	private static liaison c2;
	private static String text;
	private static int mycounter=0;
	
	public liaison( String text) {
		super();
		liaison.text = text;
		text="conected for first time!";
	}
	public void conect1()
	{
		System.out.println(text);
	}
	public static liaison getinstance()
	{
		if (c2==null) {
			c2=new liaison(text);
			mycounter+=1;
		}
		System.out.println(mycounter);
		return c2;
	}
	public void conect()
	{
		System.out.println(text);
		
	}

	

}
