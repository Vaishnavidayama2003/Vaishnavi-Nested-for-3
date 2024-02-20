class demo{
	public static void main(String[] args){
		int k=26;
		char ch='Z';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==1){
					System.out.print(k+" ");
					k--;
				}
				else{
					System.out.print(ch+" ");
					ch--;
				}	
				
			}
		
		System.out.println();	
		}
		
		
	}
}