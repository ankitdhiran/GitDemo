
class GeneralStore
{
private String bname;// only readable// only getter
private float price;// only readable and writeable// getter and setter
private String ownership;// only readable
long contactno;

public String getBnane()
{
return bname;
}

public float getPrice()
{
return price;
}

public String getownerShip()
{
return ownership;
}
public long getcontactno()
{
return contactno;
}
}

public float setprice(float  price )
{
this.price=price;
System.out.println("price updated sucessfully"+price);
}

public GeneralStore(String banme,float price,String ownership,long contactno)
{
this.bname=bname;
this.price=price;
this.ownership=ownership;
this.contactno=contactno;
}
}



