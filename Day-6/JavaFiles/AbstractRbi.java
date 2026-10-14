abstract class  AbstractRbi {
    abstract void rule();
}

class Sbi extends Rbi {
    void rule() {
        System.out.println("SBI Rules");
    }
}
class IndianBank extends Rbi{
    void rule(){
        System.out.println("Indian Bank Rules");
    }
}
