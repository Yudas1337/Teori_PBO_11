package exercise_1;

public class Programmer extends Pegawai {

    private int bonus;

    Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    public int getGaji() {
        return super.getGaji();
    }

    public int getBonus() {
        return this.bonus;
    }

}
