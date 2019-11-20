package com.ustglobal.exception.customizedcheckedexception;

public class ValidateAmount {
void checkamount(int amount) throws InvalidAmountException 
{
	if(amount > 40000)
	{
		throw new InvalidAmountException();
	}
}
}