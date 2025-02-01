package com.sample;

public class FinalizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeDemo  demo=new FinalizeDemo();
		demo.mone();
		demo=null;
		System.gc();
	}
	public void mone()
	{
		try {
			System.out.println("###########################");
		}
		catch(Exception ex)
		{
			System.out.println("#######################"+ex.getLocalizedMessage());
		}
	
	}
	@Override
	protected void finalize() throws Throwable
	{
           System.out.println("=========Finalize Method ###     ");
	}
}
