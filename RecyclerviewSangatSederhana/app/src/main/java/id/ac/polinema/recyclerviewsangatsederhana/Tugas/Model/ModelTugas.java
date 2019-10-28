package id.ac.polinema.recyclerviewsangatsederhana.Tugas.Model;

public class ModelTugas {
    String image,nama;

    public ModelTugas(String image, String nama) {
        this.image = image;
        this.nama = nama;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
