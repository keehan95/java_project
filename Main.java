package lotteworld_ticketing;
//#include <stdio.h>
//#include <time.h>
import java.util.Scanner;
//import java.util.Calendar;
//import java.util.Date;

public class Main {

	private static int ticketNumber;
	//private static final int ticketNumber = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		//Date now = Calendar.getInstance().getTime();
		java.util.Calendar cal = java.util.Calendar.getInstance();
		int year = cal.get ( cal.YEAR );
		int month = cal.get ( cal.MONTH ) + 1 ;
		int date = cal.get ( cal.DATE ) ;
		int hour = cal.get ( cal.HOUR_OF_DAY ) ;
		int min = cal.get ( cal.MINUTE );
		

			
	//		time_t t = time(NULL);
	//		struct tm tm = *localtime(&t);
			 
	  //	printf("now: %d-%d-%d %d:%d:%d\n\n", tm.tm_year+1900, tm.tm_mon+1, tm.tm_mday, tm.tm_hour, tm.tm_min, tm.tm_sec); 
			       		
		    //int personNumber; 
			//int birth; 
			//int prefer;
			int charge1D[] = {62000, 54000, 47000, 15000};
			int chargeA4[] = {50000, 43000, 36000, 15000};
			int chargeP1D[] = {59000, 52000, 46000, 15000};
			int chargePA4[] = {47000, 41000, 35000, 15000};
			
			int plusCharge = 0;
			
			int charge = 0;
			int saleCharge = 0;
			
			int cntA = 0;
			int cntY = 0;
			int cntC = 0;
			int cntB = 0;
			
			int cnt1 = 0;
			int cnt2 = 0;
			int cnt3 = 0;
			int cnt4 = 0;
		    int cnt5 = 0;
			int cnt6 = 0;
			int ticketNumber = 0; 
			
			if (hour >21 || hour < 10)
			{
				System.out.println("������ �����ð��� �ƴմϴ�.\n�����ð�: ���� 10:00 ~ 21:00\n");
			 } 
			
			if (hour >= 10 && hour < 21)
			{
				do {
					System.out.println("������ �����ϼ���.\n1. �����̿��(�̿����: �Ե�����+�μӹڹ���)\n2. ��ũ�̿��(�̿����: �Ե�����)\n");
					
					ticketNumber = sc.nextInt();
					
				//scanf("%d", &ticketNumber);
				}while(ticketNumber < 1 && ticketNumber > 2);
				
				System.out.println("\n��� �ֹ��Ͻðڽ��ϱ�?\n");               //("\n����ֹ��Ͻðڽ��ϱ�?\n");
					//scanf("%d", &personNumber);
				
					int personNumber = sc.nextInt();
				
				 
				
					
					
				if (ticketNumber == 1 && hour >= 10 && hour < 16)
				{					
					for (int index = 1; index <= personNumber; index++)
					{
						System.out.println("������� 8�ڸ��� �Է��ϼ���.  ex) 19950708\n"); 
						//scanf("%d", &birth);
						int birth = sc.nextInt();											
						int birY = birth / 10000; // �¾ �⵵�� ���� 
						int birM = (birth % 1000) / 100; // �¾ ���� ���� 
						int birD = birth % 100; // �¾ ���� ���� 
						
						int age = 0;
						
						if ((birM > month) || (birM == month && birD >= date ) )      //������ �����̰ų� �̹� ������ ��� 
						{
						
							age = year - birY;
							
							if (age >= 19 && age < 65)
							{
								charge = charge1D[0];
								cntA++;
							} else if (age >= 13 && age <= 18)
							{
								charge = charge1D[1];
								cntY++;
							} else if (age >= 3 && age <= 12)
							{
								charge = charge1D[2];
								cntC++;
							} else if (age <= 2)
							{
								charge = charge1D[3];
								cntB++;
							} else if (age >= 65)
							{
								charge = charge1D[3];
								cntA++;
							}		
						} else if (birM < month)//���� ������ ������ �ʾ��� ��� 
						{
							age = year - birY -1;
							
							if (age >= 19 && age < 65)
							{
								charge = charge1D[0];
								cntA++;
							} else if (age >= 13 && age <= 18)
							{
								charge = charge1D[1];
								cntY++;
							} else if (age >= 3 && age <= 12)
							{
								charge = charge1D[2];
								cntC++;
							} else if (age <= 2)
							{
								charge = charge1D[3];
								cntB++;
							} else if (age >= 65)
							{
								charge = charge1D[3];
								cntA++;
							}
						}
						
						System.out.printf("\n�������� �����ϼ���.\n");
						System.out.printf("1. ���� (���� ���� �ڵ�ó��)\n2. �����\n3. ����������\n4. �ް��庴\n5. �ӻ��\n6. �ٵ���\n");
						//scanf("%d", &prefer);
						int prefer = sc.nextInt();
						
						switch (prefer)
						{
						case 1:
							saleCharge = charge;
							plusCharge = plusCharge + saleCharge;
							cnt1++;
							break;
						case 2:
							saleCharge = (int)((float)charge * 0.5);
							plusCharge = plusCharge + saleCharge;
							cnt2++;
							break;
						case 3:
							saleCharge = (int)((float)charge * 0.5);
							plusCharge = plusCharge + saleCharge;
							cnt3++;
							break;
						case 4:
							saleCharge = (int)((float)charge * 0.61);
							plusCharge = plusCharge + saleCharge;
							cnt4++;
							break;
						case 5:
							saleCharge = (int)((float)charge * 0.5);
							plusCharge = plusCharge + saleCharge;
							cnt5++;
							break;
						case 6:
							saleCharge = (int)((float)charge * 0.7);
							plusCharge = plusCharge + saleCharge;
							cnt6++;
							break;
						default:
							System.out.printf("default\n");		
							break;
						}
						System.out.printf("���: %d��\n\n", saleCharge);
					} 
					
				} else if (ticketNumber == 1 && hour >= 16 && hour < 21)
				{
					int index;
					
					for (index = 1; index <= personNumber; index++)
					{
						System.out.println("������� 8�ڸ��� �Է��ϼ���.  ex) 19950708\n"); 
						//scanf("%d", &birth);
						int birth = sc.nextInt();
						
						int birY = birth / 10000; // �¾ �⵵�� ���� 
						int birM = (birth % 1000) / 100; // �¾ ���� ���� 
						int birD = birth % 100; // �¾ ���� ���� 
						
						int age = 0;
						
						if (birM > month || (birM == month && birD >= date)) //������ �����̰ų� �̹� ������ ��� 
						{
							age = year - birY;
							
							if (age >= 19 && age < 65)
							{
								charge = chargeA4[0];
								cntA++;
							} else if (age >= 13 && age <= 18)
							{
								charge = chargeA4[1];
								cntY++;
							} else if (age >= 3 && age <= 12)
							{
								charge = chargeA4[2];
								cntC++;
							} else if (age <= 2)
							{
								charge = chargeA4[3];
								cntB++;
							} else if (age >= 65)
							{
								charge = chargeA4[3];
								cntA++;
							}		
						} else if (birM < month)//���� ������ ������ �ʾ��� ��� 
						{
							age = year - birY -1;
							
							if (age >= 19 && age < 65)
							{
								charge = chargeA4[0];
								cntA++;
							} else if (age >= 13 && age <= 18)
							{
								charge = chargeA4[1];
								cntY++;
							} else if (age >= 3 && age <= 12)
							{
								charge = chargeA4[2];
								cntC++;
							} else if (age <= 2)
							{
								charge = chargeA4[3];
								cntB++;
							} else if (age >= 65)
							{
								charge = chargeA4[3];
								cntA++;
							}
						}
						
						System.out.println("\n�������� �����ϼ���.\n");
						System.out.println("1. ���� (���� ���� �ڵ�ó��)\n2. �����\n3. ����������\n4. �ް��庴\n5. �ӻ��\n6. �ٵ���\n");
						//scanf("%d", &prefer);
						int prefer = sc.nextInt();
						
						switch (prefer)
						{
						case 1:
							saleCharge = charge;
							plusCharge = plusCharge + saleCharge;
							cnt1++;
							break;
						case 2:
							saleCharge = (int)((float)charge * 0.5);
							plusCharge = plusCharge + saleCharge;
							cnt2++;
							break;
						case 3:
							saleCharge = (int)((float)charge * 0.5);
							plusCharge = plusCharge + saleCharge;
							cnt3++;
							break;
						case 4:
							saleCharge = (int)((float)charge * 0.61);
							plusCharge = plusCharge + saleCharge;
							cnt4++;
							break;
						case 5:
							saleCharge = (int)((float)charge * 0.5);
							plusCharge = plusCharge + saleCharge;
							cnt5++;
							break;
						case 6:
							saleCharge = (int)((float)charge * 0.7);
							plusCharge = plusCharge + saleCharge;
							cnt6++;
							break;
						default:
							System.out.println("default\n");		
							break;
						}
						System.out.printf("���: %d��\n\n", saleCharge);
					}
				} else if (ticketNumber == 2 && hour >= 10 && hour < 16)
				{
					int index;
					
					for (index = 1; index <= personNumber; index++)
					{
						System.out.println("������� 8�ڸ��� �Է��ϼ���.  ex) 19950708\n"); 
						//scanf("%d", &birth);
						int birth = sc.nextInt();
						
						int birY = birth / 10000; // �¾ �⵵�� ���� 
						int birM = (birth % 1000) / 100; // �¾ ���� ���� 
						int birD = birth % 100; // �¾ ���� ���� 
						
						int age = 0;
						
						if ((birM > cal.get ( cal.MONTH ) + 1) || (birM == cal.get ( cal.MONTH ) + 1 && birD >= cal.get ( cal.MONTH ) + 1)) //������ �����̰ų� �̹� ������ ��� 
						{
							age = cal.get ( cal.YEAR ) - birY;
							
							if (age >= 19 && age < 65)
							{
								charge = chargeP1D[0];
								cntA++;
							} else if (age >= 13 && age <= 18)
							{
								charge = chargeP1D[1];
								cntA++;
							} else if (age >= 3 && age <= 12)
							{
								charge = chargeP1D[2];
								cntA++;
							} else if (age <= 2)
							{
								charge = chargeP1D[3];
								cntA++;
							} else if (age >= 65)
							{
								charge = chargeP1D[3];
								cntA++;
							}		
						} else if (birM < cal.get ( cal.MONTH ) + 1)//���� ������ ������ �ʾ��� ��� 
						{
							age = cal.get ( cal.YEAR ) - birY -1;
							
							if (age >= 19 && age < 65)
							{
								charge = chargeP1D[0];
								cntA++;
							} else if (age >= 13 && age <= 18)
							{
								charge = chargeP1D[1];
								cntY++;
							} else if (age >= 3 && age <= 12)
							{
								charge = chargeP1D[2];
								cntC++;
							} else if (age <= 2)
							{
								charge = chargeP1D[3];
								cntB++;
							} else if (age >= 65)
							{
								charge = chargeP1D[3];
								cntA++;
							}
						}
						
						System.out.printf("\n�������� �����ϼ���.\n");
						System.out.printf("1. ���� (���� ���� �ڵ�ó��)\n2. �����\n3. ����������\n4. �ް��庴\n5. �ӻ��\n6. �ٵ���\n");
						//scanf("%d", &prefer);
						int prefer = sc.nextInt();
						
						switch (prefer)
						{
						case 1:
							saleCharge = charge;
							plusCharge = plusCharge + saleCharge;
							cnt1++;
							break;
						case 2:
							saleCharge = (int)((float)charge * 0.5);
							plusCharge = plusCharge + saleCharge;
							cnt2++;
							break;
						case 3:
							saleCharge = (int)((float)charge * 0.5);
							plusCharge = plusCharge + saleCharge;
							cnt3++;
							break;
						case 4:
							saleCharge = (int)((float)charge * 0.61);
							plusCharge = plusCharge + saleCharge;
							cnt4++;
							break;
						case 5:
							saleCharge = (int)((float)charge * 0.5);
							plusCharge = plusCharge + saleCharge;
							cnt5++;
							break;
						case 6:
							saleCharge = (int)((float)charge * 0.7);
							plusCharge = plusCharge + saleCharge;
							cnt6++;
							break;
						default:
							System.out.println("default\n");		
							break;
						}
						System.out.printf("���: %d��\n\n", saleCharge);
					}
				} else if (ticketNumber == 2 && hour >= 16 && hour < 21)
				{
					int index;
					
					for (index = 1; index <= personNumber; index++)
					{
						System.out.println("������� 8�ڸ��� �Է��ϼ���.  ex) 19950708\n"); 
						//scanf("%d", &birth);
						int birth = sc.nextInt();
						
						int birY = birth / 10000; // �¾ �⵵�� ���� 
						int birM = (birth % 1000) / 100; // �¾ ���� ���� 
						int birD = birth % 100; // �¾ ���� ���� 
						
						int age = 0;
						
						if ((birM > month) || (birM == month && birD >= month)) //������ �����̰ų� �̹� ������ ��� 
						{
							age = year - birY;
							
							if (age >= 19 && age < 65)
							{
								charge = chargePA4[0];
								cntA++;
							} else if (age >= 13 && age <= 18)
							{
								charge = chargePA4[1];
								cntY++;
							} else if (age >= 3 && age <= 12)
							{
								charge = chargePA4[2];
								cntC++;
							} else if (age <= 2)
							{
								charge = chargePA4[3];
								cntB++;
							} else if (age >= 65)
							{
								charge = chargePA4[3];
								cntA++;
							}		
						} else if (birM < month)//���� ������ ������ �ʾ��� ��� 
						{
							age = year - birY -1;
							
							if (age >= 19 && age < 65)
							{
								charge = chargePA4[0];
								cntA++;
							} else if (age >= 13 && age <= 18)
							{
								charge = chargePA4[1];
								cntY++;
							} else if (age >= 3 && age <= 12)
							{
								charge = chargePA4[2];
								cntC++;
							} else if (age <= 2)
							{
								charge = chargePA4[3];		
								cntB++;		
							} else if (age >= 65)
							{
								charge = chargePA4[3];	
								cntA++;		
							}
						}
						
						System.out.println("\n�������� �����ϼ���.\n");
						System.out.println("1. ���� (���� ���� �ڵ�ó��)\n2. �����\n3. ����������\n4. �ް��庴\n5. �ӻ��\n6. �ٵ���\n");
						//scanf("%d", &prefer);
						int prefer = sc.nextInt();
						
						switch (prefer)
						{
						case 1:
							saleCharge = charge;
							plusCharge = plusCharge + saleCharge;
							cnt1++;
							break;
						case 2:
							saleCharge = (int)((float)charge * 0.5);
							plusCharge = plusCharge + saleCharge;
							cnt2++;
							break;
						case 3:
							saleCharge = (int)((float)charge * 0.5);
							plusCharge = plusCharge + saleCharge;
							cnt3++;
							break;
						case 4:
							saleCharge = (int)((float)charge * 0.61);
							plusCharge = plusCharge + saleCharge;
							cnt4++;
							break;
						case 5:
							saleCharge = (int)((float)charge * 0.5);
							plusCharge = plusCharge + saleCharge;
							cnt5++;
							break;
						case 6:
							saleCharge = (int)((float)charge * 0.7);
							plusCharge = plusCharge + saleCharge;
							cnt6++;
							break;
						default:
							System.out.println("default\n");		
							break;
						}
						System.out.printf("���: %d��\n\n", saleCharge);
					}
				}
				System.out.println("\n\nƼ�� �߱��� �����մϴ�. �����մϴ�.\n\n");
				System.out.println("---------------�Ե�����---------------\n");
				System.out.printf("��  �� x %d\nû�ҳ� x %d\n��� x %d\n���̺� x %d\n\n", cntA, cntY, cntC, cntB);
				System.out.printf("����� �Ѿ���  %d�� �Դϴ�.", plusCharge);
				}
		
	}
	

}


