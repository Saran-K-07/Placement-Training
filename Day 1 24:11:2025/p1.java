class Main {
  public static void main(String[] args) {
    int sal = 2500000;
    double tax = 0;
    if(sal <= 1200000){
        System.out.print(tax);
    }else if(sal>1200000 && sal<=1600000){ // 0-4, 4-8, 8-12, 12-... 
        tax = 60000.0 + ((float)sal-1200000)*0.15;
    }else if(sal>1600000 && sal<=2000000){
        tax =  60000.0 + 60000.0 + ((float)sal-1600000)*0.2;
    }else if(sal>2000000 && sal<=2400000){
        tax =  60000.0 + 60000.0 +80000.0 + ((float)sal-2000000)*0.25;
    }else{
        tax = 60000.0 + 60000.0 +80000.0 + 100000.0 + ((float)sal-2400000)*0.3;
    }
        System.out.print(tax);
    
  }
}