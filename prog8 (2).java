class demo{
	public static void main(String[] args){
		char A='A';
		char a='b';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==0){
					System.out.print(a+" ");
					a++;
					a++;
				}
				else{
					System.out.print(A+" ");
					A++;
					A++;
				}
			}
		
		System.out.println();	
		}
		
		
	}
}