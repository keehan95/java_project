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
  	  
//  	  int [][] ticketTable = new int[15][10];   이 부분 때문에 인자를 제대로 호출받지 못했음 
//                              => 필드에서 변수를 선언해주었기 때문에 여기서는 선언해줄 필요가 없다.
        System.out.println();
  	  
        do {
        	
      	 
      	 // 함수호출
      	   input.choiceTicket();
           input.person_manAge();
           input.ticketOrderCount();
           input.PreferentialTreatment();
           input.additionalTicket();
           calculate.personAgeCase();
           calculate.personAgePrice();
           calculate.preferentialTreatmentPrice();
      	           	          
           System.out.printf("%d", calculate.specialPrice * input.ticketCount);
           
           // 최종가격
           total = calculate.specialPrice * input.ticketCount;
           System.out.printf("가격은 %d 원 입니다.\n감사합니다.\n", total);
           
           // 2차원 배열
           output.ticketTable[output.orderCount][0] = input.choice;     // 이용권
           output.ticketTable[output.orderCount][1] = input.ticket;     // 시간대
//           System.out.printf("%d", person);
           output.ticketTable[output.orderCount][2] = calculate.person;     // 연령대
           output.ticketTable[output.orderCount][3] = input.ticketCount; // 주문한 사람이 구입한 티켓 장 수\
           output.ticketTable[output.orderCount][4] = total;      // 합산 가격
           output.ticketTable[output.orderCount][5] = input.special;      // 우대 사항
           output.orderCount++;
           
           
           // '='의 개수 체크해주기
           // 내역에 들어갈 것은 이용권, 권종, 연령, 개수, 금액, 우대사항 : 총 6 항목
          System.out.printf("================================롯데 월드==================================\n");
          System.out.printf("%-12s %-12s %-12s %-5s %10s %20s\n", "이용권", "권종", "연령", "개수", " 금액", "우대 사항");
          System.out.printf("---------------------------------------------------------------------------\n");

//	      	System.out.printf("a : %d\n", ticketTable[0][0]);
//			System.out.printf("b : %d\n", ticketTable[0][1]);
           
          output.ticketTableLoop();

           System.out.printf("\n");
           System.out.printf("---------------------------------------------------------------------------\n");
           System.out.printf("계속 발권하시겠습니까?\n1. 계속 발권\n2. 발권 종료\n");
           int continuingTicket = sc.nextInt();
             } while(input.continuingTicket == 1);
             
           System.out.printf("티켓 발권을 종료합니다.\n");

	}

}
