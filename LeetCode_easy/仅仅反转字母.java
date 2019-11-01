public static String reverseOnlyLetters(String S) {
        char tmp;
        char[] A = S.toCharArray();
        int j = A.length-1;
        for(int i=0;i<A.length;i++){
            if((A[i] >='A'&& A[i]<='Z')||(A[i]>='a'&&A[i]<='z'))
            {
  
                while(j!=0){
                    if((A[j] >='A' && A[j]<='Z')||(A[j]>='a'&& A[j]<='z')){
                        tmp = A[i];
                        A[i] = A[j];
                        A[j] = tmp;
                        if(i == j) {
                            break;
                        }
                        j--;
                        break;
                    }
                    else
                        j--;
                }
            }
            if(i == j)
                break;
            else
            	continue;
        }
    String s = String.valueOf(A);
    System.out.println(A);
    System.out.println(s);
    return s
    }

}
