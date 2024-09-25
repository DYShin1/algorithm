class Solution {
    public int[] solution(String[] park, String[] routes) {
        int parkH =park.length;
        int parkW =park[0].length();
        int robotH =0;
        int robotW =0;
        
        String[][] parkCo = new String[parkH][parkW];
        for(int i=0; i<parkH;i++){
            String[] parkap = park[i].split("");
            for(int j=0; j<parkW;j++){
                parkCo[i][j]=parkap[j];
            }
        }
        for(int i=0;i<parkH;i++){
            for(int j=0;j<parkW;j++){
                if(parkCo[i][j].equals("S")){
                    robotH=i;
                    robotW=j;
                    break;
                }
            }
        }
        for(int i=0; i<routes.length;i++){
            String[] spl = routes[i].split(" ");
            int time = Integer.parseInt(spl[1]);//반복횟수는 time으로
            boolean go = true;
            switch(spl[0]){
                case "N"://H줄이기
                    if(robotH-time<0){break;}
                    for(int n=1;n<=time;n++){
                        if(parkCo[robotH-n][robotW].equals("X")){go = false;}
                    }
                    if(go==false){break;}
                    robotH-=time;
                    break;
                case "S"://H늘리기
                    if(robotH+time>=parkH){break;}
                    for(int n=1;n<=time;n++){
                        if(parkCo[robotH+n][robotW].equals("X")){go = false;}
                    }
                    if(go==false){break;}
                    robotH+=time;
                    break;
                case "W"://W줄이기
                    if(robotW-time<0){break;}
                     for(int n=1;n<=time;n++){
                        if(parkCo[robotH][robotW-n].equals("X")){go = false;}
                    }
                    if(go==false){break;}
                    robotW-=time;
                    break;
                case "E"://W늘리기
                    if(robotW+time>=parkW){break;}
                    for(int n=1;n<=time;n++){
                        if(parkCo[robotH][robotW+n].equals("X")){go = false;}
                    }
                    if(go==false){break;}
                    robotW+=time;
                    break;
            }
        }
        int[] answer = new int[2];
        answer[0] = robotH;
        answer[1] = robotW;        
        return answer;
    }
}