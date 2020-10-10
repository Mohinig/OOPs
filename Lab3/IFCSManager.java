package Lab3;

import java.util.*;
class Equipment
{
private String id, description;
public Equipment (String id,String description)
{
this.id=id;
this.description=description;
}
public String getId()
{
return id;
}
public String getDesc()
{
return description;
}
}
class IFCSManager
{
private Equipment eqpList[];
private int c ;
public IFCSManager ()
{
eqpList = new Equipment[10];
c=0;
}
public boolean insert (Equipment eqp)
{
if (eqp.getId().equals("null") || eqp.getDesc().equals("null"))
{
if (eqp.getId().equals("null"))
{
System.out.println("Error - id cannot be null");
}
else
{
System.out.println("Error - description cannot be null");
}
}
else
{
if (c==0)
{
eqpList[c]=eqp;
c++;
}
else if(c<10)
{
eqpList[c]=eqp;
c++;
for(int i = 0; i<c-1; i++) 
{
for (int j = i+1; j<c; j++)
{
if(eqpList[i].getId().compareTo(eqpList[j].getId())>0)
{
Equipment temp = eqpList[i];
eqpList[i] = eqpList[j];
eqpList[j] = temp;
}
}
}
}
return true;
}
return false;
}
public boolean remove (String id)
{
if(id.equals("null"))
{
System.out.println ("Error - id cannot be null");
return false;
}
int f=0,i;
for (i=0;i<c;i++)
{
if(eqpList[i].getId().equals(id))
{
f=1;
break;
}
}
if(f==1)
{
for(int j=i+1;j<c;j++)
{
eqpList[j-1]=eqpList[j];
}
c--;
return true;
}
return false;
}
public boolean find (String id)
{
if (id.equals("null"))
{
System.out.println( "Error - id cannot be null");
return false;
}
int f=0,i;
for (i=0;i<c;i++)
{
if(eqpList[i].getId().equals(id))
{
f=1;
break;
}
}
if(f==1)
return true;
else
return false;
}
public void display()
{
for(int i=0;i<c;i++)
{
System.out.println("id= "+eqpList[i].getId()+" desc= "+eqpList[i].getDesc());
}
}
public static void main(String args[])
{
int ch,i;
String id, desc;
Scanner sc=new Scanner(System.in);
Equipment myEqp;
IFCSManager myMgr = new IFCSManager();
do
{
System.out.println("1. Add new equipment");
System.out.println("2. Remove an equipment");
System.out.println("3. Report an equipment");
System.out.println("4. Display list");
System.out.println("5. Exit");
ch=sc.nextInt();
switch (ch)
{
case 1:
System.out.println("ID= ");
id=sc.next();
System.out.print("Description= ");
desc=sc.next();
myEqp= new Equipment (id, desc);
if(myMgr.insert(myEqp))
{
System.out.println("Equipment added to Lab");
}
break;
case 2: System.out.println("ID= ");
id=sc.next();
if(myMgr.remove(id))
{
System.out.println("Equipment removed from Lab");
}
else
System.out.println("Equipment with id "+id+"cannot be found");
break;
case 3: System.out.println("ID= ");
id=sc.next();
if(myMgr.find(id))
{
System.out.println("Equipment available in Lab");
}
else
System.out.println("Equipment not in lab ");
break;
case 4: myMgr.display();
break;
case 5: break;
default: System.out.println("Invlaid choice");
break;
}
} while(ch!=5);
}}