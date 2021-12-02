/*방문 리스트를 만들고
처음 0번부터 DFS를 돌려주고 방문한 컴퓨터에다가 체크한다 (처음 방문하는거 횟수 1올려주고 시작)
방문을 하지 않은 컴퓨터를 계속 DFS 돌려줘서
DFS를 돌려준 횟수를 센다 (재귀한거 세는게 아니라 처음 실행한 횟수)*/
// 깊이 우선 탐색(DFS)이란 루트 노드(혹은 다른 임의의 노드)에서 시작
//다음 분기(branch)로 넘어가기 전에 해당 분기를 완벽하게 탐색하는 방법
class Solution {
    static int answer=0;     //나오는 값  
    public static void bfs(int i, int[][] computers) {
        computers[i][i]=0;// computers[i][j]를 1로 표현
        for(int j=0;j<computers.length;j++) {
            if(computers[i][j]==1) {
                computers[i][j]=0;
                bfs(j,computers);
            }
        }

    }
	//자기 자신만 0으로 바꾸고 들어가지 않고, 연결돤 값들을 거칠 때 마다 모두 0으로 바꿔주며,
            //전제적으로 돌 수 있게 해 놓음
  public int solution(int n, int[][] computers) {
        for(int i=0;i<n;i++) {
            if(computers[i][i]==1) {
                answer+=1;
                bfs(i,computers);
            }
        }       
        return answer;
    }
}