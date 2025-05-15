package del.alstrudat;

public class DataMobilKBT extends Data {
    private String jenis;
    private double dayaListrik; // dalam kW
    private int kapasitasBaterai; // dalam kWh
    private int kapasitasPenumpang; // jumlah orang
    private double jangkauan; // dalam km

    public void tampilData() {
        System.out.println("ID: " + id);
        System.out.println("Nama Mobil KBT: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Daya Listrik: " + dayaListrik + " kW");
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " kWh");
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang + " orang");
        System.out.println("Jangkauan: " + jangkauan + " km");
    }
}
