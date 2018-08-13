package net.galihpratama.dongenginteraktif.model;

import net.galihpratama.dongenginteraktif.R;

/**
 * Created by galpratama on 4/7/16.
 */
public class Dongeng {
    private Halaman[] mHalamans;

    public Dongeng() {
        mHalamans = new Halaman[7];

        mHalamans[0] = new Halaman(
                R.drawable.gambar0,
                "Tom dan Jerry adalah sahabat sedari kecil. Tapi sahabat ini selalu bertengkar satu sama lain. Di satu waktu, Tom mendapati Jerry sedang memakan ayam goreng di kotak makan miliknya. Kamu, %1$s, apa yang seharusnya Tom lakukan?",
                new Pilihan("Bilang secara baik baik", 1),
                new Pilihan("Ajak ribut", 2)
        );

        mHalamans[1] = new Halaman(
                R.drawable.gambar1,
                "Tom memberi tahu Jerry secara baik baik, bahwa janganlah mengambil makanan miliknya. Jerry pun merasa bersalah. Tom merasa Jerry harus minta maaf",
                new Pilihan("Bilang ke Jerry", 3),
                new Pilihan("Balas dendam", 4));

        mHalamans[2] = new Halaman(
                R.drawable.gambar2,
                "Tom memilih untuk mengajak ribut Jerry. Tapi Jerry tidak takut dan langsung berani melawan jerry",
                new Pilihan("Kejar dan balas dendam", 4),
                new Pilihan("Tom tidak mau berkelahi", 6));

        mHalamans[3] = new Halaman(
                R.drawable.gambar3,
                "Tom bilang ke Jerry bahwa jerry harus minta maaf. Tapi Jerry tidak mendengarkan dan malah mengejek ngejek Tom. Tom pun mengejarnya. Tom punya dua rencana, tapi dia bingung rencana mana yang harus dia lakukan.",
                new Pilihan("Jebak Jerry dengan petasan", 4),
                new Pilihan("Jebak Jerry dengan keju", 5));

        mHalamans[4] = new Halaman(
                R.drawable.gambar4,
                "Tom memasang petasan dekat kamar Jerry. Tapi jerry lebih cerdik, dia pun memasang petasan dibelakang Tom. Petasan pun meledak dan Tom kesakitan",
                new Pilihan("Jebak lagi dengan keju", 5),
                new Pilihan("Berdamai", 6));

        mHalamans[5] = new Halaman(
                R.drawable.gambar5,
                "Tom mencoba menjebak jerry dengan keju. Ternyata jebakan itu berhasil dan Jerry tidak bisa berkutik kembali.");

        mHalamans[6] = new Halaman(
                R.drawable.gambar6,
                "Tom memilih berdamai dan jerry pun mengiyakan nya.");

    }

    public Halaman getHalaman(int pageNumber) {
        return mHalamans[pageNumber];
    }
}
