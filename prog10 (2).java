class demo{
	public static void main(String[] args){
		for(int i=1;i<=6;i++){
			int N=5;
			char ch='F';
			for(int j=1;j<=6;j++){
				if(j%2==0){
					System.out.print(N+" ");
					N=N-2;
				}
				else{
					System.out.print(ch+" ");
					ch--;
					ch--;
				}
			}
		
		System.out.println();	
		}
		
		
	}
}