//# 경마 게임
//5마리의 말이 랜덤으로 한번에 일정거리 이동가능하다 
//이동한거리의 합이 20이상이면 도착 
//등수 출력 
//조건) 단! 동시도착 예외처리

package day_36;

import java.util.Random;

public class racing {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[][] horse = new int[5][20];		//첫번째 인덱스는 말 번호, 두번째 인덱스는 거리 총합
		int max = 20;		//이동거리 합 max(20)이상 이면 도착
		int[] rank = new int[5];		//말 등수
		int[] total = new int[5];		///말 이동 거리의 총합
		int count=1;
		
		for(int i=0;i<20;i++)
		{
			int check = 0;
			for(int j=0;j<5;j++)
			{
				if(total[j]>=max)
				{
					horse[j][i] = 0;
				}
				else
				{
					int random = ran.nextInt(5)+1;
					horse[j][i] = random;
					total[j] += horse[j][i];
					
					if(total[j]>=max)
					{
						rank[j] = count++;
						check++;
						System.out.println("j:"+j+" i:"+i+" rank[j]:"+rank[j]+" count:"+count);
						
						if(check>=2)		//check가 2이상 이면 중복이 발생되어서 인덱스 i감소
						{
							i=-1;
							horse = new int[5][20];
							total = new int[5];
							rank = new int[5];
							count=1;
							break;
						}
					}
				}
			}	
		}
		
		int num=1;
		for(int i=0;i<5;i++)
		{
			System.out.println(num+"번말: "+rank[i]+"등");
			num++;
		}
		System.out.println();
		
		//총합
		for(int i=0;i<5;i++)
		{
			System.out.println("j["+i+"] ");
			for(int j=0;j<20;j++)
			{
				System.out.print(horse[i][j]);
			}
			System.out.println();
		}
		
		int[][] show = new int[5][20];
		int[] index = new int[5];

	}
}
