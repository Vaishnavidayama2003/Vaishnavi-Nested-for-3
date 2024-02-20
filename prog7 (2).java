class demo{
	public static void main(String[] args){
		int k=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				if(k%2==0){
					System.out.print(k+" ");
					k++;
				}
				else{
					System.out.print(k*k+" ");
					k++;
				}
			}
		
		System.out.println();	
		}
		
		
	}
}