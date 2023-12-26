class Solution {
    public String solution(int age) {
        String answer = "";
        char[] ch = new char[26];
		
		for (int i=0; i<ch.length ; i++){ 
			ch[i] = (char)(i+97); 
		}
        String[] arr = String.valueOf(age).split("");
        for(int i = 0 ; i < arr.length ;i++) {
            answer += String.valueOf(ch[Integer.parseInt(arr[i])]);
        }
        //System.out.println(ch[0]);
        /*int num1 = (int)(age*0.1);
        int num2 = age - num1*10;
        System.out.println(ch[num1]);
        
        return String.valueOf(ch[num1])+String.valueOf(ch[num2]);*/
        return answer;
    }
}