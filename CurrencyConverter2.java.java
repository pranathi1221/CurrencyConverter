class CurrencyConverter{

/*int usdollar=3;

int rupee=usdollar*63;

int dirham=usdollar*3;

int chilean_peso=usdollar*595;

int _yen=usdollar*107;

int $australian=usdollar*2;

int Rupee=usdollar*63;*/

void printCurrencies(){
System.out.println("LIST OF CURRENCIES");
int [] currencies={1,63,3,595,107,2,63};
/*System.out.println("usdollar:"+usdollar);

System.out.println("rupee:"+rupee);

System.out.println("dirham:"+dirham);

System.out.println("chilean_peso:"+chilean_peso);

System.out.println("_yen:"+_yen);

System.out.println("$australian:"+$australian);

System.out.println("Rupee:"+Rupee);*/
System.out.println("usdollar:"+ currencies[0]);

System.out.println("rupee:"+currencies[1]);

System.out.println("dirham:"+currencies[2]);

System.out.println("chilean_peso:"+currencies[3]);

System.out.println("_yen:"+currencies[4]);

System.out.println("$australian:"+currencies[5]);

System.out.println("Rupee:"+currencies[6]);

}

public static void main(String[] args){

CurrencyConverter cc= new CurrencyConverter();

cc.printCurrencies();
}
}