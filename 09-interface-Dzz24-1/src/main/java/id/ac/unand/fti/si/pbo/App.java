package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {
        Member memberA = new MemberReguler();
        Member memberB = new MemberSilver();
        Member memberC = new MemberGold();
        Member memberD = new MemberPlatinum();

        int totalReguler = memberA.hitungTotalBayar(120000);
        int totalSilver = memberB.hitungTotalBayar(720000);
        int totalGold = memberC.hitungTotalBayar(90000);
        int totalPlatinum = memberD.hitungTotalBayar(750000);
    
        System.out.println("Total bayar member reguler: " + totalReguler);
        System.out.println("Total bayar member silver: " + totalSilver);
        System.out.println("Total bayar member gold: " + totalGold);
        System.out.println("Total bayar member platinum: " + totalPlatinum);
    }
    
}
