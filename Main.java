package LW_TS;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	Scanner sc = new Scanner(System.in);
  	  
  	
  	  InputData input = new InputData();
  	  CalculateOrder calculate = new CalculateOrder();
  	  OutputData output = new OutputData();
  	  
  	  int total;
  	  
//  	  int [][] ticketTable = new int[15][10];   �� �κ� ������ ���ڸ� ����� ȣ����� ������ 
//                              => �ʵ忡�� ������ �������־��� ������ ���⼭�� �������� �ʿ䰡 ����.
        System.out.println();
  	  
        do {
        	
      	 
      	 // �Լ�ȣ��
      	   input.choiceTicket();
           input.person_manAge();
           input.ticketOrderCount();
           input.PreferentialTreatment();
           input.additionalTicket();
           calculate.personAgeCase();
           calculate.personAgePrice();
           calculate.preferentialTreatmentPrice();
      	           	          
           System.out.printf("%d", calculate.specialPrice * input.ticketCount);
           
           // ��������
           total = calculate.specialPrice * input.ticketCount;
           System.out.printf("������ %d �� �Դϴ�.\n�����մϴ�.\n", total);
           
           // 2���� �迭
           output.ticketTable[output.orderCount][0] = input.choice;     // �̿��
           output.ticketTable[output.orderCount][1] = input.ticket;     // �ð���
//           System.out.printf("%d", person);
           output.ticketTable[output.orderCount][2] = calculate.person;     // ���ɴ�
           output.ticketTable[output.orderCount][3] = input.ticketCount; // �ֹ��� ����� ������ Ƽ�� �� ��\
           output.ticketTable[output.orderCount][4] = total;      // �ջ� ����
           output.ticketTable[output.orderCount][5] = input.special;      // ��� ����
           output.orderCount++;
           
           
           // '='�� ���� üũ���ֱ�
           // ������ �� ���� �̿��, ����, ����, ����, �ݾ�, ������ : �� 6 �׸�
          System.out.printf("================================�Ե� ����==================================\n");
          System.out.printf("%-12s %-12s %-12s %-5s %10s %20s\n", "�̿��", "����", "����", "����", " �ݾ�", "��� ����");
          System.out.printf("---------------------------------------------------------------------------\n");

//	      	System.out.printf("a : %d\n", ticketTable[0][0]);
//			System.out.printf("b : %d\n", ticketTable[0][1]);
           
          output.ticketTableLoop();

           System.out.printf("\n");
           System.out.printf("---------------------------------------------------------------------------\n");
           System.out.printf("��� �߱��Ͻðڽ��ϱ�?\n1. ��� �߱�\n2. �߱� ����\n");
           int continuingTicket = sc.nextInt();
             } while(input.continuingTicket == 1);
             
           System.out.printf("Ƽ�� �߱��� �����մϴ�.\n");

	}

}
