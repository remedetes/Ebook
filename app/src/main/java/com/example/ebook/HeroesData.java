package com.example.ebook;

import java.util.ArrayList;

public class HeroesData {
    public static String[][] data = new String[][]{
            {"Judul : Si Anak Pemberani", "''Aku, Eliana si anak pemberani, anak sulung Bapak dan Mamak yang akan menjadi pembela kebenaran dan keadilan. Berdiri paling gagah''. Buku ini tentang Eliana, si anak pemberani yang membela tanah, sungai, hutan, dan lembah kampungnya. Saat kerakusan dunia datang, Eliana pun melakukan perlawanan.", "https://ssvr.bukukita.com/babacms/displaybuku/110165_f.jpg"},
            {"Judul : Si Anak Spesial", "Kenapa Bapak dan Mamak sejak kecil selalu bilang, “Kau spesial, Burlian”. Itu cara terbaik bagi Bapak dan Mamak untuk menumbuhkan percaya diri yang menjadi pegangan penting setiap kali aku terbentur masalah, kau selalu spesial. Buku ini tentang Burlian, si anak keras kepala yang memiliki masa kecil sangat spesial. ", "https://ssvr.bukukita.com/babacms/displaybuku/110163_f.jpg"},
            {"Judul : Si Anak Kuat", "''Kau anak paling kuat di keluarga ini, Amel. Itu benar sekali. Bukan kuat secara fisik, tapi kuat dari dalam. Kau adalah anak yang paling teguh hatinya, paling kokoh dengan pemahaman baik. Buku ini tentang Amelia, kisah anak yang memiliki mimpi-mimpi hebat untuk kampung tercintanya.", "https://ssvr.bukukita.com/babacms/displaybuku/110162_f.jpg"},
            {"Judul : Si Anak Cahaya", "''Nama kau Nurmas, itu nama yang indah sekali. Nur itu cahaya, mas atau emas itu logam mulia yang berharga. Aku harap, suatu saat cahaya dan kemuliaan kau akan menyatu''. Buku ini tentang Nurmas, si anak cahaya yang memiliki petualangan masa kecil yang penuh keceriaan. Apa yang sebenarnya dilakukan oleh Nurmas hingga penduduk seluruh kampung selalu mengingat kejadian yang membuatnya anak cahaya?", "https://ssvr.bukukita.com/babacms/displaybuku/110112_f.jpg"},
            {"Judul : Negeri Para Bedebah", "Di negeri para bedebah, kisah fiksi kalah seru dibanding kisah nyata. Di negeri para bedebah, musang berbulu domba berkeliaran di halaman rumah. Tetapi setidaknya, Kawan, petarung sejati tidak akan pernah berkhianat.", "https://ssvr.bukukita.com/babacms/displaybuku/106623_f.jpg"},
            {"Judul : Pulang", "Aku tahu sekarang, lebih banyak luka di hati bapakku dibanding di tubuhnya. Juga mamakku, lebih banyak tangis di hati Mamak dibanding di matanya.\nSebuah kisah tentang perjalanan pulang, melalui pertarungan demi pertarungan, untuk memeluk erat semua rasa sakit.'", "https://ssvr.bukukita.com/babacms/displaybuku/106055_f.jpg"},
            {"Judul : Matahari", "Namanya Ali, 15 tahun, kelas X. Jika saja orangtuanya mengizinkan, seharusnya dia sudah duduk di tingkat akhir ilmu fisika program doktor di universitas ternama. Ali tidak menyukai sekolahnya, guru-gurunya, teman-teman sekelasnya. Semua membosankan baginya. ", "https://ssvr.bukukita.com/babacms/displaybuku/94692_f.jpg"},
            {"Judul : Earth", "Namaku Raib, usiaku 15 tahun, kelas sepuluh. Aku anak perempuan seperti kalian, adik-adik kalian, tetangga kalian. Aku punya dua kucing, namanya si Putih dan si Hitam. Mama dan papaku menyenangkan. Guru-guru di sekolahku seru. Teman-temanku baik dan kompak.", "https://ssvr.bukukita.com/babacms/displaybuku/111319_f.jpg"},
            {"Judul : Bulan", "Namanya Seli, usianya 15 tahun, kelas sepuluh. Dia sama seperti remaja yang lain. Menyukai hal yang sama, mendengarkan lagu-lagu yang sama, pergi ke gerai fast food, menonton serial drama, film, dan hal-hal yang disukai remaja. Tetapi ada sebuah rahasia kecil Seli yang tidak pernah diketahui siapa pun. Sesuatu yang dia simpan sendiri sejak kecil. Sesuatu yang menakjubkan dengan tangannya. ", "https://s4.bukalapak.com/img/9270130133/w-300/JUAL_BARU_Buku_Bulan__Tere_Liye___Gramedia_BERKUALITAS.jpg.webp"},
            {"Judul : Pergi", "Sebuah kisah tentang menemukan tujuan, ke mana hendak pergi, melalui kenangan demi kenangan masa lalu, pertarungan hidup-mati, untuk memutuskan ke mana langkah kaki kita akan dibawa. Dibawa pergi entah kemana..", "https://ssvr.bukukita.com/babacms/displaybuku/105875_f.jpg"},
            {"Judul : Rindu", "Apalah arti cinta? Ketika kami menangis terluka atas perasaan yang seharusnya indah? Bagaimana mungkin, kami terduduk patah hati atas sesuatu yang seharusnya suci dan tidak menuntut apapun? Wahai, bukankah banyak kerinduan saat kami hendak melupakan? Dan tidak terbilang keinginan melupakan saat kami dalam rindu?", "https://ssvr.bukukita.com/babacms/displaybuku/101787_f.jpg"},
            {"Judul : Hujan", "Novel HUJAN ini berkisah tentang persahabatan, tentang cinta, tentang perpisahan, tentang melupakan, dan tentang hujan yang susah dilupakan...", "https://ssvr.bukukita.com/babacms/displaybuku/106243_f.jpg"},

    };
    public static ArrayList<Hero> getListData(){
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data) {
            Hero hero = new Hero();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);
            list.add(hero);
        }
        return list;
    }
}

