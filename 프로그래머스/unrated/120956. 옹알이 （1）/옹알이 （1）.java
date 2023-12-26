class Solution {
    public int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        int idx = -1;
        
        String str = "";
        String str2 = "";
        for(int i = 0 ; i < babbling.length;i++) {
            int leng = 0;
            roop : for(int j = 0 ; j < arr.length;j++) {
                if(babbling[i].equals(arr[j])) {
                    answer++;
                    break roop;
                }else {
                    idx = babbling[i].indexOf(arr[j]);
                    if(idx >= 0) {
                        leng += arr[j].length();
                        
                        if(leng == babbling[i].length()) {
                            answer++;
                        }
                        System.out.println(idx+"/"+leng);
                    }
                }
                /*else {      
                    idx = babbling[i].indexOf(arr[j]);
                    if(idx >= 0) {
                        //남은 문자
                        str = babbling[i].substring(babbling[i].length()-idx,babbling[i].length());
                        //같은 문자
                        str2 = babbling[i].substring(idx,idx+arr[j].length());

                        for(int h = 0 ; h < arr.length;h++) {
                            if(str.equals(arr[h])) {            
                                answer++;                 
                            }    
                        }
                        
                    }        
                    //break roop;  
                }
                
                
            }
            System.out.println("str: "+str +" / str2:"+ str2+" / answer : "+answer+" / idx : "+idx);*/
            }
        }
        return answer;
    }
}