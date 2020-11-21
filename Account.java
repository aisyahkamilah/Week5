//arrayofobject
//bila takde keyword piblic before keyword class
//naming the file can be either Account.java compile name
//ObjectArray.java as run name
//kalau ada public dia dominan

class Account {
  int a, b;
  public void setData (int c,int d) {
  	a=c;
  	b=d;
  }

  public void showData() {
  	 System.out.println("Value of a = " + a);
  	 System.out.println("Value of b = " + b);
  	}
}

