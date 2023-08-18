package com.tugas.wisata

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tugas.wisata.model.Wisata
import com.tugas.wisata.ui.theme.WisataTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { /* Judul TopAppBar */Text(text = getString(R.string.app_name))  },
                        actions = {
                            IconButton(onClick = { /* Fungsi saat ikon diklik */
                                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                                startActivity(intent)
                            }) {
                                Icon(
                                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_about),
                                    contentDescription = "about_page"
                                )
                            }
                        }
                    )
                }
            ) {
                // Konten utama aplikasi
                val wisataList = listOf(
                    Wisata("Pura Tanah Lot", "Desa Beraban, Kecamatan Kediri, Kabupaten Tabanan", "Nomor 1 dalam daftar 20 tempat wisata untuk dikunjungi di Bali adalah Pura Tanah Lot Bali. Selanjutnya, Jika diterjemahkan ke bahasa Indonesia, Tanah Lot berarti daratan di tengah laut. Tanah berarti daratan, Lot artinya laut.\n" +
                            "\n" +
                            "Lebih lanjut, sesuai dengan namanya, saat Anda berlibur ke Pura Tanah Lot, Anda akan menemukan pura yang berada di atas batu karang besar dengan latar belakang laut selatan. Sementara itu, batu karang besar ini berada di tengah laut. Kemudian, pada saat air pasang, batu karang terlihat terpisah dari daratan.\n" +
                            "\n" +
                            "Daya tarik utama dari Pura Tanah Lot terdapat pada keindahan pemandangan matahari terbenam, dengan siluet pura Tanah Lot. Kemudian, berpadu dengan ombak laut selatan yang menerjang batu karang. Oleh karena itu, saat momen ini, akan terlihat banyak wisatawan yang akan mengambil foto dengan latar belakang pura Tanah Lot.", R.drawable.tanahlot, R.drawable.tanahlot),
                    Wisata("Pantai Kuta", "Jl. Pantai Kuta, Kuta, Kabupaten Badung", "Objek wisata pantai Kuta akan selalu masuk dalam daftar tempat wisata di kunjungi di pulau Bali bagi wisatawan yang pertama kali liburan ke Bali. Ada beberapa hal utama yang membuat pantai Kuta ramai mendapat kunjungan wisatawan. Seperti, menawarkan pantai pasir putih dengan bentangan garis pantai sangat panjang, serta pemandangan matahari terbenam.\n" +
                            "\n" +
                            "Kemudian, ombak di pantai Kuta lumayan besar dan cocok untuk aktivitas selancar pemula. Jika Anda ingin berenang bersama anak-anak, maka anak Anda harus selalu dalam pengawasan orang dewasa.\n" +
                            "\n" +
                            "Lebih lanjut, aktivitas utama wisatawan saat liburan ke pantai Kuta adalah duduk santai di tepi pantai, berenang, jalan-jalan, dan melihat pemandangan matahari terbenam. Karena tingginya minat wisatawan liburan ke pantai Kuta, maka hampir setiap hari jalan raya sekitar pantai Kuta akan terjadi kemacetan.\n" +
                            "\n" +
                            "Selain daya tarik pantai pasir putih, fasilitas pariwisata di sekitar area tempat wisata Kuta sangat lengkap. Anda akan dengan mudah menemukan akomodasi, tempat makan, pusat perbelanjaan, transportasi dan kelab malam.", R.drawable.kuta, R.drawable.kuta),
                    Wisata("Pura Uluwatu",
                        "Pecatu, Kecamatan Kuta Selatan, Kabupaten Badung",
                        "Uluwatu temple atau Pura Luhur Uluwatu selalu menjadi tempat wisata populer untuk wisatawan yang pertama kali liburan ke pulau Bali. Hal menarik yang wisatawan dapat lihat di pura Uluwatu seperti;\n" +
                                "\n" +
                                "Lokasi pura yang berada di ujung atas tebing tinggi, dengan ketinggian tebing sekitar 70 meter dari permukaan air laut.\n" +
                                "Keunikan arsitektur pura.\n" +
                                "Terdapat banyak kera ekor panjang sekitar area pura seperti kera yang ada di Monkey Forest Ubud.\n" +
                                "Dari atas tebing wisatawan dapat melihat pemandangan samudra Hindia.\n" +
                                "Menjelang matahari terbenam, wisatawan dapat menyaksikan pemandangan matahari terbenam Samudera Hindia dari atas tebing tanpa halangan.\n" +
                                "Lokasi menonton tari Kecak Api yang paling terkenal di pulau Bali.",
                        R.drawable.uluwatu,
                        R.drawable.uluwatu
                    ),
                    Wisata(
                        "Pura Ulun Danu Beratan Bedugul",
                        "Tepi Danau Beratan, Candikuning, Kecamatan Baturiti, Kabupaten Tabanan",
                        "Sebelum Anda berlibur ke Bali, Anda akan melihat banyak foto pura yang sangat indah di Instagram, dan Anda tidak tahu di mana lokasinya serta nama pura. Sementara itu, jika Anda pernah melihat foto sebuah pura yang terlihat berada di tengah danau, nama tempat wisata ini adalah Pura Ulun Danu Beratan Bedugul. \n" +
                                "\n" +
                                "Lebih lanjut, Pura Ulun Danu, lokasinya berada di tepi danau Beratan berada di kawasan wisata Bedugul. Kemudian, menurut Wikipedia, lokasi Danau Beratan Bedugul berada di ketinggian 1.031 meter dari permukaan air laut. Maka itu, udara di sekitar area pura Ulun Danu Beratan sangat sejuk.\n" +
                                "\n" +
                                "Sebagai contoh, hal menarik yang membuat pura Ulun Danu Beratan Bedugul populer dikunjungi wisatawan;\n" +
                                "\n" +
                                "Pemandangan unik pura Ulun Danu yang terlihat terapung tengah danau Beratan, sehingga terlihat unik di foto.\n" +
                                "Udara sejuk daerah pegunungan.\n" +
                                "Tata kebun sekitar area pura.\n" +
                                "Lokasi Pura Ulun Danu Beratan berdekatan dengan lokasi Kebun Raya Bali.",
                        R.drawable.pura_ulundanu,
                        R.drawable.pura_ulundanu
                    ),
                    Wisata(
                        "Pemandangan Danau & Gunung Batur Kintamani",
                        "Jalan Raya Penelokan, Batur Tengah, Kecamatan Kintamani, Kabupaten Bangli.",
                        "Selain area Bedugul, area wisata di pulau Bali yang juga berada di pegunungan adalah tempat wisata Kintamani. Ketinggian area Kintamani berada sekitar 1,500 meter dari permukaan air laut, sehingga udara di daerah Kintamani sangat sejuk.\n" +
                                "\n" +
                                "Lebih lanjut, daya tarik utama wisatawan liburan ke Kintamani adalah melihat pemandangan danau Batur dan pemandangan Gunung Batur. Sementara itu, ada banyak lokasi untuk melihat pemandangan pemandangan danau Batur dan pemandangan Gunung Batur. Kemudian, lokasi favorit melihat pemandangan gunung dan danau Batur berada di desa Penelokan.\n" +
                                "\n" +
                                "Sebagian besar wisatawan saat melihat pemandangan gunung dan danau Batur di desa Penelokan, sambil menikmati makan siang prasmanan di restoran Grand Puncak Sari Kintamani.",
                        R.drawable.batur_kintamani,
                        R.drawable.batur_kintamani
                    ),
                    Wisata(
                        "Bali Safari Marine Park",
                        "Jalan Raya Prof. Dr. Ida Bagus Mantra No. kilometer 19,8, Kabupaten Gianyar.",
                        "Jika Anda liburan keluarga ke pulau Bali dengan anak, maka tempat wisata Bali Safari & Marine Park wajib Anda kunjungi. Bali Safari & Marine Park adalah sebuah kebun binatang yang memiliki luas area sangat luas, sekitar 400,000 meter persegi.\n" +
                                "\n" +
                                "Lebih lanjut, keunikan Bali Safari & Marine Park, setiap jenis satwa berkeliaran bebas dalam sebuah area besar. Karena area sangat luas, agar pengunjung dapat melihat satwa secara langsung, pengunjung akan menaiki kendaraan safari. Aktivitas ini terkenal dengan nama Safari Journey.\n" +
                                "\n" +
                                "Hal menarik yang membuat banyak wisatawan tertarik liburan ke Bali Safari & Marine Park seperti;\n" +
                                "\n" +
                                "Terdapat lebih dari 400 spesies binatang.\n" +
                                "Aktivitas Safari Journey.\n" +
                                "Pengunjung dapat melihat satwa langka harimau putih India dan Komodo.\n" +
                                "Tersedia pertunjukan teater, bernama Bali Agung Show.\n" +
                                "Tersedia aktivitas menaiki Gajah.\n" +
                                "Ada pertunjukan gajah Sumatra.\n" +
                                "Juga ada pertunjukan harimau.",
                        R.drawable.safari_marine,
                        R.drawable.safari_marine
                    ),
                    Wisata(
                        "Pantai Tanjung Benoa",
                        "Jl. Pratama Tanjung Benoa, Kabupaten Badung.",
                        "Sebagian besar wisatawan yang liburan ke pantai Tanjung Benoa karena tertarik untuk mengikuti aktivitas Tanjung Benoa water sports. Aktivitas Bali water sports yang tersedia di pantai Tanjung Benoa ada banyak pilihan. Seperti, parasailing adventures, jet ski, banana boat, rolling donut, snorkeling dan masih banyak lagi pilihan lainnya.\n" +
                                "\n" +
                                "Hal yang membuat pantai Tanjung Benoa menjadi lokasi favorit aktivitas water sports di Bali karena;\n" +
                                "\n" +
                                "Gelombang ombak di pantai Tanjung Benoa sangat tenang.\n" +
                                "Perairan sangat dangkal.\n" +
                                "Bentangan garis pantai Tanjung Benoa sangat panjang, dengan tekstur pasir pantai halus berwarna putih kekuningan.\n" +
                                "Tersedia banyak pilihan wahana wisata bahari dengan harga murah.\n" +
                                "Semua pilihan wahana permainan water sports di rancang untuk pemula atau peserta yang tidak punya pengalaman dalam aktivitas water sports.\n" +
                                "Lokasi pantai Tanjung Benoa berdekatan dengan kawasan wisata Nusa Dua.",
                        R.drawable.tanjung_benoa,
                        R.drawable.tanjung_benoa
                    ),
                    Wisata(
                        "Ubud Monkey Forest",
                        "Jalan Monkey Forest, Ubud, Kecamatan Ubud, Kabupaten Gianyar, Bali.",
                        "Tempat wisata Ubud memiliki banyak pilihan objek liburan serta aktivitas liburan seperti Ayung Rafting. Dari sekian banyak pilihan objek wisata yang ada di Ubud, Ubud Monkey Forest selalu menjadi tempat wisata favorit wisatawan yang pertama kali liburan ke pulau Bali.\n" +
                                "\n" +
                                "Hal menarik yang wisatawan dapat lihat saat liburan ke Monkey Forest Ubud seperti;\n" +
                                "\n" +
                                "Area hutan lindung dengan pepohonan yang sangat tinggi.\n" +
                                "Wisatawan dapat melihat kera ekor panjang.\n" +
                                "Dalam area Monkey Forest Ubud terdapat Pura.",
                        R.drawable.ubud_monkey,
                        R.drawable.ubud_monkey
                    ),
                    Wisata(
                        "Seminyak",
                        "Kec. Kuta Kabupaten Badung Bali",
                        "Kawasan pariwisata Seminyak terkenal sebagai kawasan pariwisata mewah dan pusat perbelanjaan barang mewah di Pulau Bali. Di area tempat wisata Seminyak, Anda akan dengan mudah menemukan restoran mewah, resort mewah, butik, beach club, dan Spa.\n" +
                                "\n" +
                                "Kelengkapan fasilitas tersebut membuat area tempat wisata Seminyak menjadi salah satu destinasi wisata populer di pulau Bali.\n" +
                                "\n" +
                                "Lokasi area pariwisata Seminyak sangat strategis, karena berdekatan dengan kawasan tempat wisata Kuta serta area wisata Canggu.",
                        R.drawable.seminyak,
                        R.drawable.seminyak
                    ),
                    Wisata(
                        "Sawah Terasering Tegalalang",
                        "Jalan Raya Tegallalang, Kecamatan Tegallalang, Kabupaten Gianyar.",
                        "Selain objek wisata pantai pasir putih, pariwisata Bali juga terkenal memiliki banyak objek wisata sawah terasering. Ada dua objek wisata sawah terasering yang terkenal di Bali. Yaitu, sawah terasering Jatiluwih, serta sawah terasering Tegalalang.\n" +
                                "\n" +
                                "Karena lokasi dari sawah terasering Tegalalang berdekatan dengan pusat area pariwisata Ubud Bali, membuat sawah terasering Tegalalang lebih banyak dikunjungi wisatawan.\n" +
                                "\n" +
                                "Hal menarik yang wisatawan dapat lihat atau lakukan di area sawah terasering Tegalalang seperti,\n" +
                                "\n" +
                                "Foto dengan latar belakang sawah terasering.\n" +
                                "Nongkrong di salah satu kafe dengan pemandangan sawah terasering.\n" +
                                "Saat ini tersedia aktivitas Bali swing di area sawah terasering Tegalalang.\n" +
                                "Jalan-jalan di sekitar area persawahan.",
                        R.drawable.tegalalang,
                        R.drawable.tegalalang
                    ),
                    Wisata(
                        "Pura Besakih",
                        "Jalan.Gunung Mas Desa Besakih, Kecamatan Rendang, Kabupaten Karangasem.",
                        "Pulau Bali terkenal memiliki banyak objek wisata pura, namun tahukah Anda pura Hindu terbesar dan terluas di pulau Bali? Nama pura adalah Pura Besakih.\n" +
                                "\n" +
                                "Lokasi area pura Besakih berada di kaki Gunung Agung, kabupaten Karangasem. Sekadar informasi, Gunung Agung adalah gunung berapi aktif tertinggi di pulau Bali. Karena berada di area kaki gunung Agung, maka udara sejuk terlalu terasa saat liburan ke pura Besakih.\n" +
                                "\n" +
                                "Pengunjung yang liburan ke Pura Besakih akan melihat area pura yang sangat luas, arsitektur megah dan area yang asri. Dari area pura Besakih pengunjung juga dapat melihat pemandangan area sawah, dan bukit. Waktu terbaik berkunjung di pagi hari, karena kabut belum turun. Sehingga Anda akan dapat melihat pemandangan Gunung Agung dari area Pura Besakih Karangasem.",
                        R.drawable.besakih,
                        R.drawable.besakih
                    ),
                    Wisata(
                        "Pantai Pandawa",
                        "Desa Kutuh, Kecamatan Kuta Selatan, Kabupaten Badung.",
                        "Jika Anda berlibur bersama keluarga dan anak-anak, maka Pantai Pandawa di Desa Kutuh wajib Anda kunjungi. Anda mungkin bertanya, mengapa pantai ini diberi nama Pantai Pandawa?\n" +
                                "\n" +
                                "Pantai ini di beri nama pantai Pandawa karena pada tebing karang menuju akses masuk ke area pantai, terdapat patung dari panca Pandawa.\n" +
                                "\n" +
                                "Berapa banyak patung yang ada di area Pantai Pandawa? Ada enam patung, seperti patung Arjuna, Yudistira, Nakula, Sahadewa, Dewi Kunti, dan patung Bima.\n" +
                                "\n" +
                                "Saat ini, pantai Pandawa menjadi destinasi populer di pulau Bali terutama untuk wisatawan Indonesia. Daya tarik utama dari pantai Pandawa terdapat pada bentangan pasir putih sekitar 1 kilometer. Ombak di pantai Pandawa sangat tenang, sehingga sangat aman untuk anak-anak berenang. Selain itu, di area tepi pantai tersedia jasa penyewaan kano.\n" +
                                "\n" +
                                "Lebih lanjut, kelebihan lain dari pantai Pandawa, terdapat pada area parkir kendaraan yang sangat luas serta lokasi parkir berdekatan dengan garis pantai. Di sepanjang tepi pantai terdapat warung yang menyediakan makanan dan minuman dengan harga terjangkau.",
                        R.drawable.pantai_pandawa,
                        R.drawable.pantai_pandawa
                    ),
                    Wisata(
                        "Air Terjun Sekumpul",
                        "Desa Sekumpul, Sawan, Kabupaten Buleleng.",
                        "Salah satu objek wisata yang saat ini sedang tren di Instagram adalah tempat wisata air terjun. Pulau Bali memiliki banyak pilihan objek wisata air terjun, terutama di area bagian utara Pulau Bali.\n" +
                                "\n" +
                                "Dari sekian banyak pilihan tempat wisata air terjun yang ada di pulau Bali, air terjun Sekumpul yang paling terkenal.\n" +
                                "\n" +
                                "Lokasi destinasi wisata Air Terjun Sekumpul berada di kawasan tempat wisata Bali utara. Sekadar informasi, lokasi area Bali utara lumayan jauh dari area tempat wisata Bali selatan. Seperti Kuta, Seminyak, Legian, Canggu, Jimbaran, Tanjung Benoa, Ungasan.\n" +
                                "\n" +
                                "Untuk menuju ke lokasi air terjun Sekumpul dari area Bali selatan, Anda akan memerlukan waktu sekitar 2,5 jam.\n" +
                                "\n" +
                                "Daya tarik utama dari objek wisata Air Terjun Sekumpul terdapat pada pemandangan alam sekitar air terjun. Di lokasi air terjun Sekumpul, pengunjung akan melihat dua air terjun kembar saling berdampingan dengan ketinggian sekitar 50 meter.",
                        R.drawable.sekumpul,
                        R.drawable.sekumpul
                    ),
                    Wisata(
                        "Garuda Wisnu Kencana (GWK Bali)",
                        "Jalan Raya Uluwatu, desa Ungasan, Kecamatan Kuta Selatan, Kabupaten Badung.",
                        "Taman Budaya Garuda Wisnu Kencana atau terkenal dengan nama GWK Bali, salah satu tempat wisata keluarga populer di pulau Bali. Hampir setiap hari objek wisata Taman Budaya Garuda Wisnu Kencana ramai dikunjungi wisatawan.\n" +
                                "\n" +
                                "Daya tarik utama yang membuat wisatawan tertarik liburan ke GWK Bali karena di GWK Bali terdapat patung tertinggi di Indonesia. Patung Garuda Wisnu Kencana memiliki tinggi 75 meter, dengan lebar patung 65 meter.",
                        R.drawable.gwk,
                        R.drawable.gwk
                    ),
                    Wisata(
                        "Pantai Jimbaran",
                        "Jimbaran, Kec. Kuta Sel., Kabupaten Badung, Bali",
                        "Apakah Anda pernah melihat foto wisatawan sedang menikmati wisata kuliner tepi pantai pasir putih, pemandangan matahari terbenam, dengan menu makanan laut bakar? Jika iya, kemungkinan besar Anda akan bertanya, di manakah lokasinya di pulau Bali. Nama tempatnya adalah pantai Jimbaran Bali.\n" +
                                "\n" +
                                "Daya tarik utama yang membuat wisatawan tertarik liburan ke pantai Jimbaran karena keindahan pantai pasir putih, dengan bentangan garis pantai yang sangat panjang. Karena posisi pantai menghadap ke sisi barat, maka di sore hari pantai Jimbaran menjadi salah satu destinasi terbaik melihat pemandangan sunset di pulau Bali.\n" +
                                "\n" +
                                "Keunikan dari pantai Jimbaran, karena di bibir pantai Jimbaran terdapat banyak kafe makanan laut bakar, dengan pemandangan pantai. Suasana makan malam, dengan cahaya lilin, lokasi di tepi pantai, sambil melihat matahari terbenam inilah yang menjadi daya tarik utama pantai Jimbaran sebagai tempat wisata.",
                        R.drawable.jimbaran,
                        R.drawable.jimbaran
                    ),
                    Wisata(
                        "Pura Tirta Empul Tampak Siring",
                        "Jalan Tirta Manukaya, Tampaksiring, Kabupaten Gianyar.",
                        "Wisatawan Indonesia yang pertama kali liburan ke Bali selalu tertarik liburan ke pura Tirta Empul Tampak Siring. Daya tarik objek wisata pura Tirta Empul karena lokasinya berdekatan dengan Istana Kepresidenan Tampaksiring.\n" +
                                "\n" +
                                "Selain itu, pengunjung akan melihat banyak kolam air di pura Tirta Empul dengan keunikan arsitektur pura.\n" +
                                "\n" +
                                "Hal paling menarik yang akan pengunjung lihat saat memasuki area dalam pura. Di dalam area pura akan terdapat sebuah kolam, dan di tengah kolam terdapat sumber mata air. Karena air dari kolam berasal dari mata air, maka air terlihat sangat jernih.\n" +
                                "\n" +
                                "Air dari kolam utama kemudian dialirkan ke kolam kedua tempat umat Hindu melakukan ritual penyucian. Di lokasi kolam kedua, pengunjung akan melihat umat hindu Bali menyucikan diri menggunakan air pancuran dari kolam utama.\n" +
                                "\n" +
                                "Untuk wisatawan dapat memasuki area pura Tirta Empul Tampak Siring, wisatawan wajib memakai kain sarong dan selendang. Kain sarong, di pakai dari pinggul sampai kaki dan selendang di gunakan untuk mengikat kain sarong pada bagian pinggang.\n" +
                                "\n" +
                                "Selain itu, pada area konter tiket, sudah di sediakan kain sarong dan selendang. Anda juga dapat membawa sendiri kain Sarong dan Selendang, jika Anda merasa kurang nyaman memakai kain dan selendang yang di sediakan.",
                        R.drawable.tirta_empul,
                        R.drawable.tirta_empul
                    ),
                    Wisata(
                        "Desa Penglipuran",
                        "Jalan Penglipuran, Desa Kubu, Kecamatan Bangli, Kabupaten Bangli.",
                        "Jika Anda ingin melihat suasana desa tradisional di pulau Bali yang masih asli dan sangat bersih, maka desa Penglipuran Bangli wajib Anda kunjungi.\n" +
                                "\n" +
                                "Anda mungkin akan bertanya, apa keunikan desa Penglipuran jika di bandingkan dengan desa lainnya di pulau Bali? Daya tarik utama yang pengunjung lihat saat memasuki desa Penglipuran adalah desain rumah penduduk yang terlihat sama dengan desain Bali asli, seperti gerbang masuk rumah, desain atap, serta tata letak rumah\n" +
                                "\n" +
                                "Selain itu, pada area luar dan di dalam area rumah ditanami banyak pohon bunga dengan tatanan rapi. Daya tarik utama yang saya lihat paling menonjol dari desa Penglipuran adalah kebersihan area desa.",
                        R.drawable.penglipuran,
                        R.drawable.penglipuran
                    ),
                    Wisata(
                        "Pulau Nusa Lembongan",
                        "Jungutbatu, Nusa Penida, Klungkung, Nusa Penida, Kabupatèn Klungkung, Bali",
                        "Bagi wisatawan yang pertama kali liburan ke pulau Bali dan memiliki rentang waktu liburan di Bali lumayan panjang sekitar 8 – 10 hari, pasti akan liburan ke pulau Nusa Lembongan.\n" +
                                "\n" +
                                "Walaupun pulau Nusa Lembongan masuk dalam wilayah pulau Bali, namun pulau Nusa Lembongan dipisahkan oleh lautan dengan pulau Bali.\n" +
                                "\n" +
                                "Ada banyak hal menarik yang wisatawan dapat lakukan atau lihat saat berada di pulau Nusa Lembongan. Jika Anda ingin tahu lebih detail mengenai daya tarik pulau Nusa Lembongan, mohon klik tautan dibawah ini!",
                        R.drawable.nusa_lembongan,
                        R.drawable.nusa_lembongan
                    ),
                    Wisata(
                        "Pulau Nusa Penida",
                        "Jungutbatu, Nusa Penida, Klungkung, Nusa Penida, Kabupatèn Klungkung, Bali",
                        "Berdekatan dengan pulau Nusa Lembongan, terdapat pulau Nusa Penida yang juga masuk dalam wilayah pemerintahan provinsi Bali walaupun dipisahkan oleh laut.\n" +
                                "\n" +
                                "Pulau Nusa Penida semenjak 5 tahun terakhir, menjadi sangat populer dan mendapatkan banyak kunjungan wisatawan. Sebagian besar wisatawan yang liburan ke pulau Nusa Penida adalah wisatawan yang mencari suasana alam dan ingin mendapatkan foto bagus serta unik.\n" +
                                "\n" +
                                "Ada beberapa tempat wisata di Nusa Penida yang saat ini sangat terkenal dan sering terlihat di Instagram. Seperti pantai Kelingking, Broken Beach, Angel’s Billabong, pantai Atuh Nusa Penida. Jika Anda memiliki waktu liburan lebih saat di Bali, ada baiknya Anda juga mengunjungi pulau Nusa Penida.",
                        R.drawable.nusa_penida,
                        R.drawable.nusa_penida
                    ),
                    Wisata(
                        "Pulau Gili Trawangan",
                        "Gili Indah, Kec. Pemenang, Kabupaten Lombok Utara, Nusa Tenggara Bar.",
                        "Pulau Gili Trawangan berada dalam wilayah Provinsi Nusa Tenggara Barat (NTB). Sebagian besar wisatawan mancanegara yang memiliki waktu liburan rentang panjang akan liburan ke pulau Gili Trawangan.\n" +
                                "\n" +
                                "Sebagai tempat liburan, daya tarik utama dari pulau Gili Trawangan terdapat pada pemandangan pantai pasir putih, tidak ada kendaraan bermotor, dan kehidupan malam.",
                        R.drawable.gili_trawang,
                        R.drawable.gili_trawang
                    )
                    // Tambahkan objek Wisata lainnya sesuai kebutuhan
                )

                WisataList(this,wisataList)

            }

        }
    }
}

@Composable
fun WisataList(context: Context,wisataList: List<Wisata>) {
    LazyColumn {
        items(wisataList) { wisata ->
            WisataItem( context,wisata)
        }
    }
}

@Composable
fun WisataItem(context: Context, wisata: Wisata) {
    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .clickable {
                val intent = Intent(context, DetailActivity::class.java)
                intent.putExtra("nama", wisata.getNama())
                intent.putExtra("alamat", wisata.getAlamat())
                intent.putExtra("deskripsi", wisata.getDeskripsi())
                intent.putExtra("gambar1", wisata.getGambar1())
                intent.putExtra("gambar2", wisata.getGambar2())
                context.startActivity(intent)
            }
    ) {
        Image(
            painter = painterResource(id = wisata.getGambar1()),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .aspectRatio(1f),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(1f)
        ) {
            Text(text = wisata.getNama(), fontSize = 18.sp)
            Text(text = wisata.getAlamat(), fontSize = 14.sp)
        }
    }
}
