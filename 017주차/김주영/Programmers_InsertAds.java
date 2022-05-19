package week17;

public class Programmers_InsertAds {
	public static void main(String[] args) {
		String[] logs = { "01:20:15-01:45:14", "00:40:31-01:00:00", "00:25:50-00:48:29", "01:30:59-01:53:29",
				"01:37:44-02:02:30" };
		System.out.println(solution("02:03:55", "00:14:15", logs));
	}

	public static String solution(String play_time, String adv_time, String[] logs) {
String answer = "";
        
        int playTime = makeTimeInt(play_time);
        int advTime = makeTimeInt(adv_time);
        
        int[] time = new int[playTime+1];
        for(int i=0; i<logs.length; i++){
            String[] temp = logs[i].split("-");
            int startTime = makeTimeInt(temp[0]);
            int endTime = makeTimeInt(temp[1]);
            
            for(int j=startTime; j<endTime; j++){
                time[j] ++;
            }
        }
        
        int maxId = 0;
        long sum = 0;
        long maxSum = 0;
        
        for(int i=0; i<advTime; i++){
            sum += time[i];
        }
        maxSum = sum;

        for(int i=advTime; i<playTime; i++){    
            sum += time[i] - time[i-advTime];
            if(sum > maxSum){
                maxSum = sum;
                maxId = i-advTime+1;
            }
        }
        
        answer = makeTimeStr(maxId);
        
        return answer;
	}

	public static int makeTimeInt(String timeStr) {
		String[] temp = timeStr.split(":");
		int hour = Integer.parseInt(temp[0]);
		int min = Integer.parseInt(temp[1]);
		int sec = Integer.parseInt(temp[2]);

		int time = 3600 * hour + 60 * min + sec;

		return time;
	}

	public static String makeTimeStr(int timeSec) {
		int[] time = new int[3];
		time[0] = (timeSec / 3600);
		timeSec %= 3600;
		time[1] = (timeSec / 60);
		timeSec %= 60;
		time[2] = timeSec;

		String[] timeStr = new String[3];
		for (int i = 0; i < 3; i++) {
			String temp = String.valueOf(time[i]);
			if (time[i] < 10) {
				timeStr[i] = "0" + temp;
			} else {
				timeStr[i] = temp;
			}
		}

		return (timeStr[0] + ":" + timeStr[1] + ":" + timeStr[2]);
	}
}
