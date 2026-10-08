package _leetcode_practice;

public class get_the_max_score {
    public static void main(String[] args) {
        
    }
    public static int get_max_score(int arr1[],int arr2[]){
        long sum1=0;
        long sum2=0;
        int i=0,j=0;
        while(i!=arr1.length && j!=arr2.length){
            if(arr1[i]==arr2[j]){
                long best=Math.max(sum1,sum2)+arr1[i];
                sum1=best;
                sum2=best;
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                sum1+=arr1[i];
                i++;
            }
            else if(arr1[i]>arr2[j]){
                sum2+=arr2[j];
                j++;
            }
        }
        while(i<arr1.length){
            sum1+=arr1[i];
            i++;
            
        }
        while(j<arr2.length){
            sum2+=arr2[j];
            j++;
            
        }
        
        long max=Math.max(sum1,sum2);
        return (int)(max%(long)(Math.pow(10,9)+7));
    }
}
