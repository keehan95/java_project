package LW_TS;

public class CalculateOrder {
	
	// ���ɴ뿡 �°� ó���ϱ� ���ϵ��� ���ǽ� �������
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
	        case 1:   // �����̿�� �������� �� 
	           switch(input.ticket){
	              case 1:   // 1DAY �������� �� 
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
	              
	              case 2:  // AFTER4 �������� �� 
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
	        
	        case 2:    // ��ũ�̿�� �������� �� 
	           switch(input.ticket){ 
	              case 1:   // 1DAY �������� �� 
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
	                 
	              case 2:  // AFTER4 �������� �� 
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
	           System.out.print("�ٽ� �Է����ּ���.");
	        }
	    }

	void preferentialTreatmentPrice() {

	    switch(input.special) {
	       case 1:   // ������ ���� 
	             specialPrice = price; 
	             break;   
	          
	          case 2:   // ����� ��� 
	             specialPrice = (int)((float)price * 0.5);
	             price = price - specialPrice;
	             break;
	          
	          case 3:   // ���� ������ ��� 
	             specialPrice = (int)((float)price * 0.5);
	             price = price - specialPrice;
	             break;
	          
	          case 4:   // �ް��庴 ��� 
	             if(input.choice == 1) {
	             specialPrice = (int)((float)price * 0.49);   // �ް� �庴�� ��� �����̿�Ǹ� 49 % ���
	             price = price - specialPrice; 
	             } else if(input.choice == 2) {
	                specialPrice = price;
	             }
	             break;
	          
	          case 5:  // �ӻ�� ��� 
	             if(input.choice == 1) {
	                specialPrice = (int)((float)price * 0.5);
	                price = price - specialPrice;
	             } else if(input.choice == 2) {
	                specialPrice = price;
	             }
	             break;
	          
	          case 6:   // �ٵ��� �ູī�� ��� 
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
