package LW_TS;

public class CalculateOrder {
	
	// 연령대에 맞게 처리하기 편하도록 조건식 만들어줌
	InputData input = new InputData();
	StaticValue constant = new StaticValue();
	
	public int person;
	public int price;
	public int specialPrice;

		
	void personAgeCase() {
		      
		System.out.printf("%d", input.manAge);  
		if(input.manAge <= 3){
			person = 0;
		} else if (input.manAge > 3 && input.manAge <= 12) {
	        person = 1;
	    } else if (input.manAge > 12 && input.manAge <= 18) {
	    	person = 2;
        } else if (input.manAge > 19 && input.manAge <= 65) {
	        person = 3;
	    } else if (input.manAge >= 65) {
            person = 4;
	    }
	}

	void personAgePrice() {
	    
	    switch(input.choice){
	        case 1:   // 종합이용권 선택했을 때 
	           switch(input.ticket){
	              case 1:   // 1DAY 선택했을 때 
	                 if(input.manAge <= 3) {
	                    price = constant.GENERALPASS_1DAY_BABY_PRICE;
	                 } else if(input.manAge > 3 && input.manAge <= 12) {
	                    price = constant.GENERALPASS_1DAY_CHILDREN_PRICE;
	                 } else if(input.manAge > 12 && input.manAge <= 18) {
	                    price = constant.GENERALPASS_1DAY_TEENAGER_PRICE;
	                 } else if(input.manAge > 19 && input.manAge < 65) {
	                    price = constant.GENERALPASS_1DAY_ADULT_PRICE;
	                 } else if(input.manAge >= 65) {
	                    price = constant.GENERALPASS_1DAY_CHILDREN_PRICE;
	                 }
	                 break; 
	              
	              case 2:  // AFTER4 선택했을 때 
	                 if(input.manAge <= 3) {
	                    price = constant.GENERALPASS_AFTER4_BABY_PRICE;
	                 }    else if(input.manAge > 3 && input.manAge <= 12) {
	                    price = constant.GENERALPASS_AFTER4_CHILDREN_PRICE;
	                 }     else if(input.manAge > 12 && input.manAge <= 18) {
	                    price = constant.GENERALPASS_AFTER4_TEENAGER_PRICE;
	                 }   else if(input.manAge > 19 && input.manAge < 65) {
	                    price = constant.GENERALPASS_AFTER4_ADULT_PRICE;
	                 }   else if(input.manAge >= 65) {
	                    price = constant.GENERALPASS_AFTER4_CHILDREN_PRICE;
	                 }
	                 break;   
	           }
	           break;
	        
	        case 2:    // 파크이용권 선택했을 때 
	           switch(input.ticket){ 
	              case 1:   // 1DAY 선택했을 때 
	                 if(input.manAge <= 3) {
	                    price = constant.PARKPASS_1DAY_BABY_PRICE;
	                 } else if(input.manAge > 3 && input.manAge <= 12) {
	                    price = constant.PARKPASS_1DAY_CHILDREN_PRICE;
	                 } else if(input.manAge > 12 && input.manAge <= 18) {
	                    price = constant.PARKPASS_1DAY_TEENAGER_PRICE;
	                 } else if(input.manAge > 19 && input.manAge < 65) {
	                    price = constant.PARKPASS_1DAY_ADULT_PRICE;
	                 } else if(input.manAge >= 65) {
	                    price = constant.PARKPASS_1DAY_CHILDREN_PRICE;
	                 }
	                 break;
	                 
	              case 2:  // AFTER4 선택했을 때 
	                 if(input.manAge <= 3) {
	                    price = constant.PARKPASS_AFTER4_BABY_PRICE;
	                 }    else if(input.manAge > 3 && input.manAge <= 12) {
	                    price = constant.PARKPASS_AFTER4_CHILDREN_PRICE;
	                 }     else if(input.manAge > 12 && input.manAge <= 18) {
	                    price = constant.PARKPASS_AFTER4_TEENAGER_PRICE;
	                 }   else if(input.manAge > 19 && input.manAge < 65) {
	                    price = constant.PARKPASS_AFTER4_ADULT_PRICE;
	                 }   else if(input.manAge >= 65) {
	                    price = constant.PARKPASS_AFTER4_CHILDREN_PRICE;
	                 }
	                 break;   
	           }
	           break;
	        
	        default :
	           System.out.print("다시 입력해주세요.");
	        }
	    }

	void preferentialTreatmentPrice() {

	    switch(input.special) {
	       case 1:   // 우대사항 없음 
	             specialPrice = price; 
	             break;   
	          
	          case 2:   // 장애인 우대 
	             specialPrice = (int)((float)price * 0.5);
	             price = price - specialPrice;
	             break;
	          
	          case 3:   // 국가 유공자 우대 
	             specialPrice = (int)((float)price * 0.5);
	             price = price - specialPrice;
	             break;
	          
	          case 4:   // 휴가장병 우대 
	             if(input.choice == 1) {
	             specialPrice = (int)((float)price * 0.49);   // 휴가 장병의 경우 종합이용권만 49 % 우대
	             price = price - specialPrice; 
	             } else if(input.choice == 2) {
	                specialPrice = price;
	             }
	             break;
	          
	          case 5:  // 임산부 우대 
	             if(input.choice == 1) {
	                specialPrice = (int)((float)price * 0.5);
	                price = price - specialPrice;
	             } else if(input.choice == 2) {
	                specialPrice = price;
	             }
	             break;
	          
	          case 6:   // 다둥이 행복카드 우대 
	             if(input.choice == 1) {
	                specialPrice = (int)((float)price * 0.3);
	                price = price - specialPrice;
	             } else if(input.choice == 2) {
	                specialPrice = price;
	             }
	             break;
	    }
	 }


}
