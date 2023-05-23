package week2.day1;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainText = "We learn java basics as part of java sessions in java week1";
		
		
		String[] textArr = mainText.split(" ");
		
		for (int i = 0; i < textArr.length; i++) {
			int count=0;
			for(int j = 0; j < textArr.length; j++) {
				if(textArr[i].equals(textArr[j])) {
					count++;
				}
			}
			if(count>1) {
				textArr[i]="";
			}
		}
		
		System.out.println("Duplicate words in a given string : ");
		System.out.println(String.join(" ", textArr));
//        for(int i = 0; i < text1.length; i++) {    
//            count = 1;    
//            for(int j = i+1; j < text1.length; j++) {    
//                if(text1[i].equals(text1[j])) {    
//                    count++;      
//                    text1[j] = "0";    
//                }    
//            }    
//                  
//            if(count > 1 && text1[i] != "0")    
//                System.out.println(text1[i]);
//                String replaceString= text1.replace(text1[i],"");
//                System.out.println(replaceString);
//        }    
    }    
}    