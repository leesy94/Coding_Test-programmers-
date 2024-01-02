class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int count = 0;
        for(int i = 0 ; i < dic.length; i++) {
            count = 0;
            for(int j = 0 ; j < spell.length; j++) {
                if(dic[i].contains(spell[j])) {
                    count++;
                    //dic[i].replace(spell[j],"2");
                }
            }
            if(count == spell.length) {
                break;
            }
            System.out.println(count);
        }
        return (count == spell.length) ? 1 : 2 ;
    }
}