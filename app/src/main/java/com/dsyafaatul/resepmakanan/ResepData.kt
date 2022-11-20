package com.dsyafaatul.resepmakanan

object ResepData {
    private val title = arrayOf(
        "Resep Ceker Ayam Masak Pindang, Menu Sederhana yang Bikin Ketagihan",
        "Resep Rendang Manis, Pilihan Memasak Tepat Saat Berakhir Pekan",
        "Resep Mie Ayam Sederhana dengan Sambal Hijau Siap Menggoyang Lidah",
        "Resep Tumis Taoge Teri Asin, Enak dan Ringkas untuk Dibuat",
        "Resep Kue Lumpur Gurih dengan Topping Tumisan Ayam",
        "Resep Kue Dadar Gulung Milk Tea yang Manis dan Legit",
        "Resep Krengsengan Daging Sapi Jawa Timur, Sajian Lezat Sehari-hari di Rumah",
        "Resep Bola Tempe Keju Siram Saus Kacang, Kudapan Super Lezat",
        "Resep Yakitori Jamur a la Restoran Jepang",
        "Resep Nasi Ayam a la Mexico, Cita Rasanya Sungguh Unik"
    )

    private val thumb = arrayOf(
        R.drawable.pindang_ceker_400x240,
        R.drawable.rendang_manis_400x240,
        R.drawable.resep_mie_ayam_sederhana_400x240,
        R.drawable.tumis_taoge_teri_asin_400x240,
        R.drawable._6_2_400x240,
        R.drawable.kue_dadar_gulung_milk_tea_dinikmati_400x240,
        R.drawable.krengsengan,
        R.drawable.bola_tempe_keju_mahi_400x240,
        R.drawable.yakitori_jamur_tahu_400x240,
        R.drawable.nasi_ayam_a_la_mexico_400x240,
    )

    private val key = arrayOf(
        "resep-ceker-ayam-masak-pindang",
        "resep-rendang-manis",
        "resep-mie-ayam-sederhana",
        "resep-tumis-taoge-teri-asin",
        "resep-kue-lumpur-gurih",
        "resep-kue-dadar-gulung-milk-tea",
        "resep-krengsengan-daging-jawa-timur",
        "resep-bola-tempe-keju-siram-saus-kacang",
        "resep-yakitori-jamur",
        "resep-nasi-ayam-a-la-mexico",
    )

    private val times = arrayOf(
        "1jam",
        "2jam",
        "1jam",
        "30mnt",
        "1jam",
        "1jam 10mnt",
        "50mnt",
        "45mnt",
        "50mnt",
        "1jam",
    )

    private val serving = arrayOf(
        "4 Porsi",
        "4 Porsi",
        "4 Porsi",
        "4 Porsi",
        "25 Porsi",
        "6 Porsi",
        "4 Porsi",
        "3 Porsi",
        "4 Porsi",
        "4 Porsi",
    )

    private val difficulty = arrayOf(
        "Cukup Rumit",
        "Cukup Rumit",
        "Mudah",
        "Mudah",
        "Mudah",
        "Cukup Rumit",
        "Mudah",
        "Mudah",
        "Mudah",
        "Mudah",
    )

    private val ingredient = arrayOf(
        arrayListOf(
            "400 g ceker ayam, kupas kulit, potong kukunya, dan memarkan",
            "1 L air",
            "1 sdt garam",
            "1 sdt gula merah",
            "½ sdt merica putih bubuk",
            "5 buah belimbing sayur, belah 2",
            "3 buah tomat hijau, potong dadu",
            "2 sdt Bango Kecap Manis",
            "2 sdm minyak, untuk menumis",
            "5 butir bawang merah",
            "3 siung bawang putih",
            "3 buah cabai merah",
            "2 cm kunyit",
            "1 cm jahe"
        ),
        arrayListOf(
            "1 kg daging sapi, potong dadu",
            "1.5 l santan kental",
            "1 lembar daun kunyit",
            "1 ruas lengkuas",
            "50 ml Bango Kecap Manis",
            " garam, secukupnya",
            "5 lembar daun jeruk",
            "100 g cabai merah",
            "100 g bawang merah",
            "4 siung bawang putih",
            "1 ruas jahe"
        ),
        arrayListOf(
            "150 g dada ayam, potong dadu",
            "1 bungkus Royco Kaldu Ayam",
            "3 sdm minyak",
            "600 g mie basah",
            "2 siung bawang putih cincang kasar",
            "5 sdm minyak sayur",
            "100 g cabai hijau besar",
            "10 buah cabai rawit",
            "2 butir bawang merah",
            "2 siung bawang putih",
            "2 lembar daun jeruk",
            " minyak",
            " garam"
        ),
        arrayListOf(
            "200 g taoge, siangi",
            "3 siung bawang putih, memarkan",
            "10 batang kucai, potong",
            "1.25 sdt Royco Kaldu Ayam",
            "5 sdm air",
            "2 sdm minyak, untuk menumis",
            " teri siap santap"
        ),
        arrayListOf(
            "300 g tepung terigu",
            "400 ml air",
            "175 ml santan kental",
            "175 ml susu rendah lemak",
            "2 butir telur ayam",
            "3 sdm minyak",
            "¼ sdt garam",
            "½ sdt merica putih bubuk",
            "1 sdt gula",
            "1 sdt Royco Kaldu Ayam",
            "2 sdt Bango Kecap Manis Light",
            "150 g kentang, kukus, haluskan",
            "250 g daging ayam cincang",
            "½ buah bawang bombay, potong dadu kecil",
            "2 siung bawang putih, cincang halus",
            "35 g daun seledri, cincang halus",
            "6 buah cabai rawit merah, iris tipis"
        ),
        arrayListOf(
            "125 g tepung terigu",
            "3 sachet SariWangi Milk Tea Caramel",
            "2 butir telur ayam",
            "150 ml susu cair",
            "100 ml air",
            "50 g tepung maizena",
            "50 g margarin",
            "100 g gula pasir",
            "½ sdt garam",
            "500 ml susu rendah lemak",
            "60 g tepung maizena",
            "100 g gula pasir",
            "1 sdt garam",
            "3 sachet SariWangi Milk Tea Caramel",
            "2 kuning telur",
            "½ sdt ekstrak vanilla",
            "1 sdm mentega tawar"
        ),
        arrayListOf(
            "650 g daging dan iga sapi, potong-potong",
            "2 buah tomat, potong-potong ",
            "2 sdm petis udang",
            "3 sdm Bango Kecap Manis",
            "300 ml air",
            "3 sdm minyak, untuk menumis",
            "6 butir bawang merah ",
            "4 siung bawang putih ",
            "4 buah cabai merah keriting",
            "4 cm jahe",
            "1 sdm merica butiran",
            "1 sdt garam"
        ),
        arrayListOf(
            "100 g tempe, kukus dan hancurkan",
            "50 g keju parut",
            "¼ batang daun bawang, cincang halus",
            "1 batang seledri, cincang halus",
            "100 g tepung tapioka",
            "120 g tepung terigu serbaguna",
            "1 sdt Royco Kaldu Ayam",
            "½ sdt garam",
            "½ sdt garlic powder",
            "1 sdm saus tiram",
            "200 ml air panas",
            "1 sdm bawang merah goreng",
            "100 g kacang tanah, goreng",
            "3 siung bawang putih",
            "2 lembar daun jeruk purut, goreng",
            "120 g gula merah",
            "2 sdm air asam jawa",
            " cabai merah",
            " cabai rawit",
            " garam",
            " gula",
            "1 sdt Royco Kaldu Ayam"
        ),
        arrayListOf(
            "200 g jamur hioko, potong 2 bagian",
            "200 g jamur kancing, potong 2 bagian",
            "200 g tahu sutera, potong dadu 3 cm",
            "100 g cabai hijau, potong 3 cm",
            "4 batang daun bawang, ambil bagian putihnya",
            " Tusuk satai, rendam dalam air es",
            "1 sdm Royco Kaldu Jamur",
            "1 sdm saus tiram",
            "1 sdt gula pasir",
            "1 sdt merica putih bubuk",
            "2 sdm minyak",
            " Jawara Saus Sambal Extra Hot"
        ),
        arrayListOf(
            "500 g beras",
            "15 g bawang putih",
            "15 g saus tomat",
            "30 g bawang bombay",
            "15 g cabai hijau besar",
            "120 g kacang merah",
            "1 potong dada ayam",
            "3 sdt paprika bubuk",
            "50 g Royco Kaldu Ayam"
        )
    )

    private val step = arrayOf(
        arrayListOf(
            "1 Dalam panci, rebus ceker ayam hingga empuk.",
            "2 Masukkan bumbu halus, garam, gula merah, merica, dan Bango Kecap Manis. Aduk rata.",
            "3 Masukkan belimbing sayur dan tomat hijau. Masak hingga bumbu meresap.",
            "4 Angkat dan sajikan."
        ),
        arrayListOf(
            "1 Tumis bumbu halus hingga harum. Angkat dan sisihkan.",
            "2 Rebus santan hingga mendidih kurang lebih selama 10 menit. Tambahkan bumbu halus yang sudah matang, daun jeruk, daun kunyit, dan lengkuas. Aduk hingga rata.",
            "3 Masukkan daging sapi, lalu aduk. Tambahkan Bango Kecap Manis, aduk kembali hingga merata.",
            "4 Masak hingga air menyusut, kurang lebih selama satu jam.",
            "5 Angkat, dan sajikan dengan nasi hangat."
        ),
        arrayListOf(
            "1 Sambal hijau: Rebus cabe hijau bersama cabe rawit serta bawang putih dan bawang merah hingga melunak.",
            "2 Ulek semua bahan hingga halus atau menggunakan food processor.",
            "3 Panaskan wajan dan minyak. Tumis sambal yang dihaluskan serta tambahkan garam secukupnya beserta daun jeruk.",
            "4 Minyak bawang: Panaskan wajan dan minyak. Tumis bawang putih kecokelatan, lalu sisihkan bersama minyaknya.",
            "5 Mie dan ayam sambal hijau: Panaskan wajan dan minyak di atas api sedang. Masukkan ayam dan sambal hijau. Tumis hingga matang. Angkat kemudian sisihkan.",
            "6 Rebus mie dalam air mendidih sampai matang. Tiriskan.",
            "7 Di dalam masing-masing mangkuk saji, masukkan 1 sdm minyak bawang dan ¼ sendok teh Royco Kaldu Ayam. Tambahkan mie dan aduk rata. Kemudian tata tumisan ayam dan sambal hijau di atasnya.",
            "8 Bila ingin, sajikan dengan tambahan tomat ataupun pangsit goreng."
        ),
        arrayListOf(
            "1 Panaskan minyak, tumis bawang putih hingga harum. Masukkan taoge, aduk rata.",
            "2 Masukkan air dan Royco Kaldu Ayam, aduk rata. Tambahkan kucai, masak sebentar. Angkat.",
            "3 Tata di atas piring saji. Taburi dengan ikan teri goreng.",
            "4 Sajikan segera ditemani nasi putih atau nasi merah."
        ),
        arrayListOf(
            "1 Kocok telur dengan mixer hingga mengembang. Kemudian masukkan tepung terigu, air, santan kental, susu rendah lemak, kentang, minyak, garam, merica, gula, Royco Kaldu Ayam, dan Bango Kecap Manis Light. Aduk semua hingga tercampur rata. Sisihkan.",
            "2 Panaskan minyak, tumis bawang bombay dan bawang putih hingga harum. Masukkan daging ayam, masak hingga berubah warna.",
            "3 Masukkan daun seledri cincang dan cabai rawit, aduk rata dan masak hingga ayam matang. Angkat dan sisihkan.",
            "4 Panaskan wajan cetakan kue lumpur, olesi masing-masing cetakan secara tipis dengan sisa minyak. Masukkan adonan, sampai 3/4 cetakan, tutup. Masak hingga setengah matang, taburi dengan daging ayam.",
            "5 Tutup kembali wajan, masak hingga kue lumpur matang. Angkat dan sajikan."
        ),
        arrayListOf(
            "1 Kulit dadar gulung: Aduk semua bahan adonan kulit dadar gulung termasuk SariWangi Milk Tea Caramel hingga tercampur rata. Saring.",
            "2 Olesi wajan datar antilengket dengan mentega. Panaskan wajan di atas api kecil. Tuang 1 sendok sayur adonan, masak hingga matang. Angkat. Ulangi proses serupa hingga adonan habis. Sisihkan.",
            "3 Vla milk tea: Aduk rata susu cair bersama tepung maizena. Masukkan gula, garam, dan SariWangi Milk Tea Caramel. ",
            "4 Panaskan sambil terus diaduk hingga mulai berbuih. Ambil 1 sdm adonan susu, aduk cepat bersama kuning telur hingga tercampur rata. Masukkan kembali ke dalam campuran susu cair, aduk. Masak hingga mendidih. Angkat. Tambahkan ekstrak vanilla, aduk rata.",
            "5 Ambil 1 lembar kulit dadar gulung. Taruh vla milk tea ke atasnya. Gulung membentuk amplop. Ulangi proses serupa pada sisa bahan. Sajikan."
        ),
        arrayListOf(
            "1 Di dalam wadah, aduk rata dan remas-remas daging serta iga sapi dengan bumbu halus. Diamkan selama 15 menit hingga bumbu lebih meresap.",
            "2 Panaskan minyak goreng, tumis daging beserta bumbu hingga berubah warna.",
            "3 Masukkan tomat dan air, didihkan. Tutup wajan dan kecilkan api. Masak hingga daging empuk.",
            "4 Masukkan Bango Kecap Manis dan petis udang. Aduk hingga rata. Masak hingga bumbu meresap. Angkat dan sajikan."
        ),
        arrayListOf(
            "1 Cara membuat bola tempe kenyal: Didihkan air untuk merebus tepung tapioka. Tambahkan 1 sdm minyak goreng.",
            "2 Campur semua bahan termasuk Royco Kaldu Ayam, tuang air panas, dan aduk rata. Setelah hangat uleni sebentar dengan tangan dan bentuk bulat-bulat.",
            "3 Rebus bola tempe kenyal dalam air mendidih hingga mengapung. Angkat dan tiriskan.",
            "4 Cara membuat saus kacang: Blender semua bahan hingga halus. Masak hingga mengental.",
            "5 Penyajian: Sajikan bola tempe bersama saus kacang, perasan jeruk purut, dan Kecap Manis Bango."
        ),
        arrayListOf(
            "1 Tusukkan jamur hioko, jamur kancing, tofu, cabai hijau, dan daun bawang secara berseling. ",
            "2 Bumbu marinasi: Aduk rata semua bahan bumbu termasuk Royco Kaldu Jamur. Letakkan dalam piring. ",
            "3 Lumuri sate yakitori dengan bumbu marinasi secara merata. Sisihkan. ",
            "4 Panaskan grill pan, masak yakitori hingga matang dan kecokelatan di permukaannya. Angkat. Sajikan dengan cocolan Jawara Saus Sambal Extra Hot. "
        ),
        arrayListOf(
            "1 Iris bawang bombay, lalu tumis hingga beraroma. Masukkan bawang putih cincang, tunggu sebentar hingga harum. Masukkan saus tomat dan dimasak hingga rata.",
            "2 Kemudian masukkan beras yang telah dicuci dan aduk rata.",
            "3 Masukkan cabai hijau besar yang telah dipotong seukuran jari dan kacang merah matang. Letakkan ayam dada yang telah dibalur oleh bubuk paprika di atas beras tersebut.",
            "4 Masukkan air yang telah dicampur dengan Royco Kaldu Ayam seperlunya untuk memasak nasi. Sajikan setelah matang."
        )
    )

    val listData: ArrayList<Resep>
        get(){
            val list = arrayListOf<Resep>()
            for(position in title.indices){
                val resep = Resep(
                    title[position],
                    thumb[position],
                    key[position],
                    this.times[position],
                    serving[position],
                    difficulty[position],
                    ingredient[position],
                    step[position],
                )
                list.add(resep)
            }
            return list
        }
}