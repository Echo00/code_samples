class Wahrheitstabelle {
    // main-Methode gibt die Wahrheitstabelle der drei booleschen 
    // Operatoren aus
    public static void main(String[] args) {
        boolean a;
        boolean b;
	boolean c;
	boolean d;

        // Titelzeile
        System.out.println("a     b     !a    !(a||b)  (a&&(!b))||((!a)&&b)");

        // 1. Inhaltszeile der Tabelle
        a = true; b = true; c = false;
        System.out.println(a+"  "+b+"  "+a+" "+c+" "+c+" ");

        // 2. Inhaltszeile der Tabelle
        a = true; b = false;
        System.out.println(a+"  "+b+" "+a+" "+b+" "+a+" ");

	// 3. Inhaltszeile der Tabelle
        a = false; b = true;
        System.out.println(a+"  "+b+" "+a+" "+a+" "+b+" ");

	// 4. Inhaltszeile der Tabelle
        a = false; b = false; c = true;
        System.out.println(a+"  "+b+" "+a+" "+c+" "+a+" ");
    }
}
