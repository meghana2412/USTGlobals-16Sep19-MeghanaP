package com.ustglobal.demo;

public class Super {

	public Number test()
	{
		return new  Integer(10);
	}
}

class Sub extends Super
{
	@Override
	public Integer test()
	{
		return new  Integer(10);
	}

}
