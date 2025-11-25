class Main {
  public static void main(String[] args) {
    long v = 8000L;
    if(v<1000){
        System.out.print(v);
    }else if(v>=1000 && v<10000){
        if(v%1000 == 0){
            System.out.print(v/1000+"k");
        }
        else{
        double k = (v/100)/10.0;
        System.out.print(k+"k");
        }
    }else if(v>=10000 && v<1000000){
        System.out.print(v/1000+"k");
    }else if(v>=1000000 && v<10000000){
        if(v%1000000 == 0){
        System.out.print(v/1000000+"M");
        }
        else{
            double k = (v/100000)/10.0;
            System.out.print(k+"M");
        }
    }else if(v>=10000000 && v<1000000000){
        System.out.print(v/1000000+"M");
    }
    else{
        System.out.print(v/1000000000+"B");
        
    }
  }
}
