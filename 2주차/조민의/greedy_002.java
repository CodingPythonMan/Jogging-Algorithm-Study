import java.util.*;
//1. 문자열의 문자인 i를 하나씩 체크하며 A 가 아니면 상, 하 두개 중 최솟값을 구한다
//2. i 다음문자가 A로 시작한다면 A가 끝나는 점에서 인덱스를 구한다.
class Solution {
    public int solution(String name) {
        int answer = 0;//답변
        int n=name.length(); //이름의 길이
        int minWay=n-1; // 오른쪽으로 계속 이동하는 경우
       //A에서 시작한다면 ch-A이고, Z부터는 Z-ch+1이다(1은 A에서 Z로 가기 위함).
           for(int i=0;i<n;i++){
            char ch=name.charAt(i);
            if(ch!='A') answer+=Math.min(ch-'A', 'Z'-ch+1); // 상, 하
            
            int next=i+1;
            // i 다음 문자가 A로 시작한다면 A가 끝나는 위치 찾기
            while(next<n && name.charAt(next)=='A') next++;
            minWay=Math.min(minWay, i+i+n-next); 
        }
           //이동 방향을 체크한다
            //-이동 방향의 최댓값은 한 방향으로만 가는 경우이다. 따라서 minWay를 n-1로 초기화한다.
	//-i번째 문자를 A로 바꿨다면, 다음 문자가 A인지 체크한다. A라면 A가 아닌 문자가 나오는 지점을 next를 통해 찾는다.
	//-이동 방향은 양쪽 가능한데, minWay는 오른쪽으로만 이동하는 경우이다. 더 빨리 알파벳을 완성하기 위해서는 왼쪽으로도 이동해야 한다. next를 통해 왼쪽으로 가는 경우를 찾는다.
	//-next는 오른쪽 방향으로 i 뒤에 A가 아닌 다른 알파벳으로 가는 거리이다. 왼쪽으로 그곳까지 가기 위해서는 i+i+n-next가 된다.
	//-i(현재 내 위치. 원점에서 내 위치까지 가는데 거리)+i(현재 위치에서 시작점으로 돌아가는 거리)+n-next(끝에서 next까지 가는 거리)
	//-따라서 기존 minWay(오른쪽으로 가는 경우), i+i+n-next(왼쪽으로 가는 경우)의 최솟값을 택해서 minWay에 넣으면 된다.
        answer+=minWay;
        return answer;
    }
}