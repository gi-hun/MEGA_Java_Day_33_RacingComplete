//# �渶 ����
//5������ ���� �������� �ѹ��� �����Ÿ� �̵������ϴ� 
//�̵��ѰŸ��� ���� 20�̻��̸� ���� 
//��� ��� 
//����) ��! ���õ��� ����ó��

package day_36;

import java.util.Random;

public class racing {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[][] horse = new int[5][20];		//ù��° �ε����� �� ��ȣ, �ι�° �ε����� �Ÿ� ����
		int max = 20;		//�̵��Ÿ� �� max(20)�̻� �̸� ����
		int[] rank = new int[5];		//�� ���
		int[] total = new int[5];		///�� �̵� �Ÿ��� ����
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
						
						if(check>=2)		//check�� 2�̻� �̸� �ߺ��� �߻��Ǿ �ε��� i����
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
			System.out.println(num+"����: "+rank[i]+"��");
			num++;
		}
		System.out.println();
		
		//����
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
