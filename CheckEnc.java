class CheckEnc
{
 String bname;// only readable// only getter
 private float price;// only readable and writeable// getter and setter
 String ownership;// only readable
long contactno;
public CheckEnc(String bname,float price,String ownership,long contactno)
{
this.bname=bname;
this.price=price;
this.ownership=ownership;
this.ownership=ownership;
}
public float getPrice()
{
return price;
}
public void setPrice(float price)
{
this.price=price;
}
public void print()
{
System.out.println("bname="+ bname+" price="+price+" ownership="+ownership+" contactno="+ contactno);
} 
public static void main(String [] args)
{
CheckEnc a1=new CheckEnc("Babulaal",70000.35f,"housewife",973838387489l);
a1.print();
a1.setPrice(34575.34f);
System.out.println("price update is sucesfully:" +a1.getPrice());
}
}

 
