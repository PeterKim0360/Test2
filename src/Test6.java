public class Test6 {
    public static void main(String[] args) {
        int[] nums={1,3,2,6,3,2,1,6,2,1};
//        Bubble_Sort(nums);
//        Shell_Sort2(nums);
//        Insert_Sort(nums);
        Merge_Sort(nums,0,nums.length-1);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
    public static int[] temp=new int[1000];
    public static void merge(int[] nums,int l,int m,int r){
        int curl=l,curr=m+1,i=l;
        while(curl<=m&&curr<=r){
            temp[i++]=nums[curl]<=nums[curr]?nums[curl++]:nums[curr++];
        }
        while(curl<=m){
            temp[i++]=nums[curl++];
        }
        while(curr<=r){
            temp[i++]=nums[curr++];
        }
        for(int j=l;j<=r;j++){
            nums[j]=temp[j];
        }
    }
    public static void Merge_Sort(int[] nums,int l,int r){
        if(l==r){
            return;
        }else{
            int m=(l+r)/2;
            Merge_Sort(nums,l,m);
            Merge_Sort(nums,m+1,r);
            merge(nums,l,m,r);
        }
    }

    public static void Insert_Sort(int[] nums){
        int n=nums.length;
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0&&nums[j]>nums[j+1];j--){
                swap(nums,j,j+1);
            }
        }
    }

    public static void Shell_Sort2(int[] nums){
        int n=nums.length;
        int d=nums.length/2;
        while(d>0){
            for(int i=d;i<n;i++){
                for(int j=i-d;j>=0&&nums[j]>nums[j+d];j-=d){
                    swap(nums,j,j+d);
                }
            }
            d/=2;
        }
    }
    public static void Shell_Sort1(int[] nums){
        int n=nums.length;
        int d=nums.length/2;
        while(d>0){
            for(int i=d;i<n;i++){
                if(nums[i-d]>nums[i]){
                    swap(nums,i-d,i);
                    for(int j=i-2*d;j>=0;j-=d){
                        if(nums[j]>nums[j+d]){
                            swap(nums,j,j+d);
                        }else{
                            break;
                        }
                    }
                }
            }
            d/=2;
        }
    }

    public static void Bubble_Sort(int[] nums){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }

            }
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
