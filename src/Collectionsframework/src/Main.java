package Collectionsframework.src;

import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println(isValid("())"));
//        int[] arr1 = new int[]{3,2,3};
//        int[] arr2 = new int[]{2,7,11,15};
//        int[] arr3 = {-1,0,1,2,-1,-4};
//        int[] arr4 = {0,1,0,2,1,0,1,3,2,1,2,1};

//        System.out.println(Arrays.toString(twoSum(arr2, 18)));
//        System.out.println(threeSum(arr3));
//        System.out.println(trap(arr4));
        arrayhalves();
    }

    public static void arrayhalves() {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int t = 0; t < testCases; t++) {
            int listLength = scanner.nextInt(), index=0;

            List<Integer> list = new ArrayList<>();
            List<Integer> swapelement = new ArrayList<>();
            HashMap<Integer,Integer> mapping1 = new HashMap<>();

            for (int i = 0; i < listLength*2; i++) {
                list.add(scanner.nextInt());
            }
//            list.forEach(System.out::println);
            for(Integer i: list){
                mapping1.put(i, index++);
            }

            Collections.sort(list);
            for (int i = 0; i < listLength; i++) {
                  if(mapping1.get(list.get(i))>listLength){
                      swapelement.add(mapping1.get(list.get(i)));
                  }
            }
            for(Integer i: swapelement){
                System.out.printf(i+" ");
            }
            Integer thresold = listLength, incremant=0, ans=0;
            Collections.sort(swapelement);
            for (int i = swapelement.size()-1; i>=0 ; i--) {
                ans = ans + swapelement.get(i)-thresold+incremant;
                incremant++;
            }
            System.out.println(ans);
        }
        scanner.close();
    }

    public static int trap(int[] height) {
        int ans=0;
        int mini=Integer.MAX_VALUE;


        for (int i = 0; i < height.length; i++) {

        }


        return ans;
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans=new ArrayList<>();
        TreeSet<List<Integer>> s = new TreeSet<>((l1, l2)->{
            for (int i = 0; i < 3; i++) {
                int cmp = l1.get(i).compareTo(l2.get(i));
                if (cmp != 0) return cmp;
            }
            return 0; // If all elements are equal, return 0
        });

        Arrays.sort(nums);
        for(int k=0; k<nums.length; k++){
            int i=k+1, j=nums.length-1;
            while(i<j){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                    s.add(temp);
                    i++;
                    j--;
                }
                else if(nums[i]+nums[j]<0){
                    i++;
                }
                else{
                    j--;
                }
            }
        }

        for(List<Integer> l: s){
            ans.add(l);
        }

        return ans;

    }

    public static Object[] twoSum(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        List<AbstractMap.SimpleEntry<Integer, Integer>>indexmapping = new ArrayList<>();
        int k=0;
        for(int v: nums){
            indexmapping.add(new AbstractMap.SimpleEntry<>(v, k++));
        }
        int i=0, j=nums.length-1;
        Arrays.sort(nums);

        while(nums[i]+nums[j]!=target){
            if(nums[i]+nums[j]<target){
                i++;
            }
            else{
                j--;
            }
        }

        for(AbstractMap.SimpleEntry<Integer, Integer> p:indexmapping){
            if(nums[i]==p.getKey() || nums[j]==p.getKey()){
                ans.add(p.getValue());
            }
        }
        return ans.toArray();
    }

    public static boolean isValid(String s) {
        Stack<Character> sc = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character curr=s.charAt(i);
            if(curr=='(' || curr=='{' || curr=='['){
                sc.push(curr);
            }
            else{
                if(!sc.isEmpty()){
                    if (curr == ')' && sc.peek() == '(' || curr == '}' && sc.peek() == '{' || curr == ']' && sc.peek() == '[') {
                        sc.pop();
                    } else {
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        if(!sc.isEmpty()){
            return false;
        }
        return true;
    }
}

