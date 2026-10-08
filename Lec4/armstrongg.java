public class armstrongg {
    public static void main(String[] args) {
        System.out.println(arm(16384));
        // arm(1634);
    }
    public static boolean arm(int n){
	int count=0;
	int temp=n;
	int temp2=n;
	while(n>0){
	int digi=n%10;
	count++;
	n/=10;
	}
	int sum=0;
	while(temp>0){
	int digi2=temp%10;
	sum+=(int)Math.pow(digi2,count);
	temp/=10;
	}
	if( temp2!=sum){
	return false;}
	return true;
}
}
