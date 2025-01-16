public class Participant {
private String Name;
private int dorsalNumber;
private double bestRecord2000,bestRecord2001,bestRecord2002;




public Participant() {
}

public Participant(String name, int dorsalNumber, double bestRecord2000, double bestRecord2001, double bestRecord2002) {
    Name = name;
    this.dorsalNumber = dorsalNumber;
    this.bestRecord2000 = bestRecord2000;
    this.bestRecord2001 = bestRecord2001;
    this.bestRecord2002 = bestRecord2002;
}

public String getName() {
    return Name;
}
public void setName(String name) {
    Name = name;
}
public int getDorsalNumber() {
    return dorsalNumber;
}
public void setDorsalNumber(int dorsalNumber) {
    this.dorsalNumber = dorsalNumber;
}
public double getBestRecord2000() {
    return bestRecord2000;
}
public void setBestRecord2000(double bestRecord2000) {
    this.bestRecord2000 = bestRecord2000;
}
public double getBestRecord2001() {
    return bestRecord2001;
}
public void setBestRecord2001(double bestRecord2001) {
    this.bestRecord2001 = bestRecord2001;
}
public double getBestRecord2002() {
    return bestRecord2002;
}
public void setBestRecord2002(double bestRecord2002) {
    this.bestRecord2002 = bestRecord2002;
}

}
