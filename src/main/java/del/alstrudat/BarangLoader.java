package del.alstrudat;

public class BarangLoader {
    private LinkedList<DataBarang> daftarBarang;

    public BarangLoader() {
        this.daftarBarang = new LinkedList<>();
        initData();
    }

    private void initData() {
        // Data awal barang
        daftarBarang.add(new DataBarang("B001", "Baterai Lithium-ion", "Komponen", 5000000));
        daftarBarang.add(new DataBarang("B002", "Motor Listrik 150kW", "Penggerak", 20000000));
        daftarBarang.add(new DataBarang("B003", "Converter DC/DC", "Elektronik", 3500000));
        daftarBarang.add(new DataBarang("B004", "Inverter AC", "Elektronik", 7500000));
        daftarBarang.add(new DataBarang("B005", "Charger Onboard", "Pengisian", 4500000));
    }
