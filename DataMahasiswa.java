import javax.swing.*;
import java.util.*;

public class DataMahasiswaGUI {

    static Map<String, String[][]> dataKelas = new HashMap<>();
    static Map<String, String[]> dataByNIM = new HashMap<>();

    public static void main(String[] args) {

        dataKelas.put("A", new String[][]{
                {"1152511001","Aksay Nugraha","A"},
                {"1152511002","Alya Adzra Nurjannah","A"},
                {"1152511003","Ari Prastya","A"},
                {"1152511004","Aris","A"},
                {"1152511005","Aulia Devi Ramadhani","A"},
                {"1152511006","Camelia Ramadani Putri","A"},
                {"1152511007","Dava Anggara Putra","A"},
                {"1152511008","Denis Wibisono","A"},
                {"1152511009","Elano Insavilla","A"},
                {"1152511028","Afifah Khairunisa","A"},
                {"1152511029","Agung Juliusfifa","A"},
                {"1152511030","Alda Azaria Nailah","A"},
                {"1152511031","Ananta Dwikky Ramadhan","A"},
                {"1152511032","Andriansyah","A"},
                {"1152511033","Angky Ahmad Dani","A"},
                {"1152511034","Anindya Regita Arini","A"},
                {"1152511035","Austin Weslie Wijaya","A"},
                {"1152511036","Axelo Andrian Valentino","A"},
                {"1152511037","Cristian Jasti Gunawan","A"},
                {"1152511038","Daffa Azrieldy Rasyach","A"},
                {"1152511039","Defran Revaldo","A"},
                {"1152511040","Deryan Elno Riwanda","A"},
                {"1152511041","Destha Afriadi","A"},
                {"1152511070","Nadira Aurelia Putri","A"},
                {"1152511071","Abdi Robin Hanafi","A"},
                {"1152511072","Abil Hafiz Ramadhani","A"},
                {"1152511073","Apriansyah Putra Hidayat","A"},
                {"1152511074","Aprilardo Ng","A"},
                {"1152511075","Ar Royan Harfiyah","A"},
                {"1152511076","Arya Pratama Putra","A"}
        });

        dataKelas.put("B", new String[][]{
                {"1152511010","Elfra Vandercent","B"},
                {"1152511011","Gaysha Khairunnisa","B"},
                {"1152511012","Geysha Mauzita","B"},
                {"1152511013","Gia Olivia","B"},
                {"1152511014","Gita Ananda","B"},
                {"1152511015","Haira Annisa Ramadhani","B"},
                {"1152511016","Hans William Chandra","B"},
                {"1152511017","Ibnu Razan Muhammad Ihsan","B"},
                {"1152511018","Imey Dewita Putri","B"},
                {"1152511042","Devra Rizky Iqbalsyah","B"},
                {"1152511043","Diandra Putra Pratama Wardono","B"},
                {"1152511044","Dyah Andria Fauzi","B"},
                {"1152511045","Erika Destriyani Rustandi","B"},
                {"1152511046","Fathi Dwi Kanayah","B"},
                {"1152511047","Felika Tri Rahmadani","B"},
                {"1152511048","Ganish Harfinzra","B"},
                {"1152511049","Kayla Reynanda","B"},
                {"1152511050","Monica Selta","B"},
                {"1152511051","Muhamad Delpin","B"},
                {"1152511052","Nabila Az Zahra","B"},
                {"1152511053","Nasywa Elfinata","B"},
                {"1152511054","Novia Damayanti","B"},
                {"1152511055","Novia Pastiani","B"},
                {"1152511077","Christian Fernando Tham","B"},
                {"1152511078","Fahmi Putrado Bermani","B"},
                {"1152511079","Farid Riziqh Al Ghifari","B"},
                {"1152511080","Fatih Muhammad","B"},
                {"1152511081","Garin Syuhada","B"},
                {"1152511082","Ghisella Reva Thahirah","B"},
                {"1152511083","Gustaf Leo Fany","B"}
        });

        dataKelas.put("C", new String[][]{
                {"1152511019","Merlin Apriyanti","C"},
                {"1152511020","Mila Rahmadani","C"},
                {"1152511021","Muhamad Ariya","C"},
                {"1152511022","Muhammad Rizky Pratama","C"},
                {"1152511023","Putri Salwa","C"},
                {"1152511024","Rendy","C"},
                {"1152511025","Varian Kashira Suryananda","C"},
                {"1152511026","Yola Athifa","C"},
                {"1152511027","Zaelani","C"},
                {"1152511056","Ovi Yuliza","C"},
                {"1152511057","Qafta Al Fathir","C"},
                {"1152511058","Raiqah Nashira","C"},
                {"1152511059","Ramadhan Defry Pratama","C"},
                {"1152511060","Renaldi Januar Kelana","C"},
                {"1152511061","Reyhan Pramana Anugrah","C"},
                {"1152511062","Ridwan Hadianto","C"},
                {"1152511063","Riztyo Prayoga","C"},
                {"1152511064","Sabna Maziah","C"},
                {"1152511065","Safwan Fahrezy","C"},
                {"1152511066","Sandi Ramadani","C"},
                {"1152511067","Syaharani Amjani","C"},
                {"1152511068","Vhaldhiza Rezvaldya","C"},
                {"1152511069","Yuad Tanu Diputra","C"},
                {"1152511084","Habib Al Ula","C"},
                {"1152511085","Muhammad Ifdal Ridhani","C"},
                {"1152511086","Muhammad Ramzi Haidir","C"},
                {"1152511087","Mutiara Raphaela","C"},
                {"1152511088","Raffi Ramadhan Tio","C"},
                {"1152511089","Sirhan Muzaffar","C"},
                {"1152511090","Vanessa Ophira Pazya","C"}
        });

        for (String kelas : dataKelas.keySet()) {
            for (String[] mhs : dataKelas.get(kelas)) {
                dataByNIM.put(mhs[0], mhs);
            }
        }

        String menu = """
                **** MENU DATA MAHASISWA ****
                1. Cari berdasarkan kelas
                2. Cari berdasarkan NIM
                Pilih menu (1-2):
                """;

        String pilihStr = JOptionPane.showInputDialog(null, menu, "Input", JOptionPane.QUESTION_MESSAGE);

        if (pilihStr == null) return; // User cancel

        int pilih = Integer.parseInt(pilihStr);

        if (pilih == 1) {
            String kelas = JOptionPane.showInputDialog(null, "Masukkan kelas (A/B/C):").toUpperCase();

            if (!dataKelas.containsKey(kelas)) {
                JOptionPane.showMessageDialog(null, "Kelas " + kelas + " tidak ada!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            StringBuilder hasil = new StringBuilder("=== DATA KELAS " + kelas + " ===\n\n");

            for (String[] m : dataKelas.get(kelas)) {
                hasil.append("NIM: ").append(m[0])
                     .append(" | Nama: ").append(m[1])
                     .append(" | Kelas: ").append(m[2])
                     .append("\n");
            }

            JOptionPane.showMessageDialog(null, hasil.toString());
        }

        else if (pilih == 2) {
            String nim = JOptionPane.showInputDialog(null, "Masukkan NIM:");

            if (!dataByNIM.containsKey(nim)) {
                JOptionPane.showMessageDialog(null, "Mahasiswa tidak tersedia / NIM salah.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String[] m = dataByNIM.get(nim);

            JOptionPane.showMessageDialog(null,
                    "=== DATA MAHASISWA ===\n" +
                            "NIM   : " + m[0] + "\n" +
                            "Nama  : " + m[1] + "\n" +
                            "Kelas : " + m[2]
            );
        }

        else {
            JOptionPane.showMessageDialog(null, "Menu tidak ada!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
