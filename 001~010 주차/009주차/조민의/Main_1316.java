import java.util.Arrays;
import java.util.Scanner;
// 잘 몰라서 블로그에서 보면서 같이 함
public class Main_1316{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt(); // 입력 될 문자열의 개수
        int cnt = 0; // 그룹 단어의 수 
        
        String alph[] = new String[n]; // n개의 문자열 배열 생성
        boolean alph_check[] = new boolean[26]; // 알파벳의 재등장 여부를 판단할 변수
        
        for(int i=0;i<n;i++) { // 단어 입력
        	alph[i] = in.next();
        }
        
        for(int i =0;i<alph.length;i++){  // 문자열 배열 탐색      	
            cnt++; // 그룹 단어라는 가정하에 +1 시킨 뒤 판단한다.
            Arrays.fill(alph_check, false); // 단어마다 알파벳 재등장 여부를 판단할 배열을 초기화          
            for(int j=0;j<alph[i].length();j++){ // 한 단어를 탐색
            	// 단어의 마지막 숫자가 아니며 && 등장하지 않았던 알파벳이며 && 다음 알파벳과 일치하지 않으면
            	if(j!=alph[i].length()-1 && alph_check[alph[i].charAt(j)-97] == false && alph[i].charAt(j) != alph[i].charAt(j+1)) {
            		alph_check[alph[i].charAt(j)-97] = true; // 해당 알파벳의 그룹은 끝이므로 true로 체크한 뒤 넘어간다.
            	}else if(alph_check[alph[i].charAt(j)-97] == true) { // 이미 한 번 등장했던 알파벳이라면,
            		cnt-=1; // 그룹 단어라는 가정을 파기하고 -1 후 
            		break; // 탐색종료            		
            	}
            }
        }
        
        System.out.println(cnt); // 그룹 단어의 수 출력
     
    }
}