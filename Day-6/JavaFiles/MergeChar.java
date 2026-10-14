public class MergeChar {
    public static void main(String[] args) {
        char[] arr1={'E','Z','H','I','L'};
        char[] arr2={'S','R','E','E'};
        char[] ans=new char[arr1.length+arr2.length];
        for(int i=0;i<ans.length;i++){
            if(i<arr1.length){
                ans[i]=arr1[i];
            }
            else{
            ans[i] = arr2[i - arr1.length];
            }
        }
        System.out.println(ans);
    }
    
}