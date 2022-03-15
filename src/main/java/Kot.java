import java.util.Date;

public class Kot {
    private String imie;
    private Date data;
    private Float waga;
    private String imieOpiekuna;

    public String przedstawSie() {
        return "Imie kota: " + this.imie + " | data urodzenia: " + this.data + " | opiekun: " + this.imieOpiekuna;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Float getWaga() {
        return waga;
    }

    public void setWaga(Float waga) {
        this.waga = waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }
}
