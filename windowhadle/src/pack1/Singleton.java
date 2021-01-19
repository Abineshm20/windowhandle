package pack1;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class Singleton {
  public static Singleton obj;
	private Singleton ()
	{
		System.out.println("inside private method");
	}
	
	public static Singleton getinstance() 
	{
		if(obj==null) 
		{
			obj=new Singleton();
		}
		return obj;
	}
	public static void main(String[] args) {

    Singleton obj=new Singleton();
    Singleton obj1=new Singleton();

	}
}

