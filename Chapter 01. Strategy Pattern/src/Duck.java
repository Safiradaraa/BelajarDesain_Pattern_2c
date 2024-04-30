abstract class Duck {
    void quack(){ System.out.println("Qwek Qwek");}

    void swim(){ System.out.println("Berenang");}

    void fly(){ System.out.println("Terbang");}
}

class mallardDuck extends Duck{
    void display(){ System.out.println("Tampilan MallardDuck");}
}

class RedHeadDuck extends  Duck{
    void display(){ System.out.println("Tampilan RedHeadduck");}
}

class RubberDuck extends  Duck{
    void display(){ System.out.println("Tampilan RubberDuck");}

    void quack(){ System.out.println("Bunyinya Squeek, bukan qwak");}

    void fly(){ // tidak ada implementasi, karena bebek mainan tidak dapat terbang
    }
}

class WoodenDuck extends Duck {
    void display() {
        System.out.println("Tampilan WoodenDuck");
    }

    void quack() { //Tidak ada implementasi, karena bebek mainan tidak dapat bersuara
    }

    void swim() {
        System.out.println("Mengambang");
    }
    void fly(){ //Tidak ada implementasi, karena bebek mainan tidak dapat terbang
    }
}
