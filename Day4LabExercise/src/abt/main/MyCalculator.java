package abt.main;

 class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int number) {
		// TODO Auto-generated method stub
			int answer=0;
			for(int i=1;i<=number;i++)
					{
				if(number%i==0)
				{
					answer+=i;
				}
					}
			return answer;
		}
	}


