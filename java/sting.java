class Reverse{
	public static void main(String args){
		String str="computer";
		
		j=str.length();
		String A[] = str;
		i=0;
		while(A[i]!=A[j]){
			A[j]=A[i];
			i++;
			j--;
		}
		System.out.Println(A[j]);
		
	}
}