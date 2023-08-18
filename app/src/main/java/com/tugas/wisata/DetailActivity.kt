package com.tugas.wisata

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tugas.wisata.model.Wisata

class DetailActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val wisata = Wisata(intent.getStringExtra("nama").toString(),
            intent.getStringExtra("alamat").toString(),
            intent.getStringExtra("deskripsi").toString(), intent.getIntExtra("gambar1",0),
            intent.getIntExtra("gambar2",0)
        )

        setContent {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { /* Judul TopAppBar */Text(text = getString(R.string.app_name)) },
                        actions = {
                            IconButton(onClick = { /* Fungsi saat ikon diklik */
                                val intent = Intent(this@DetailActivity, AboutActivity::class.java)
                                startActivity(intent)
                            }) {
                                Icon(
                                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_about),
                                    contentDescription = "about_page"
                                )
                            }
                        },
                        navigationIcon = {
                            IconButton(onClick = { onBackPressed() }) {
                                Icon(
                                    imageVector = Icons.Default.ArrowBack,
                                    contentDescription = "Back"
                                )
                            }
                        }
                    )
                }
            ) {
                Surface(color = MaterialTheme.colors.background) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        wisata.getGambar1().let { imageResource ->
                            Image(
                                painter = painterResource(id = imageResource),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .aspectRatio(16f / 9f)
                                    .clip(RoundedCornerShape(8.dp)),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(16.dp))


                        Text(
                            text = wisata.getNama().orEmpty(),
                            fontSize = 20.sp,
                            style = MaterialTheme.typography.h6
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = wisata.getAlamat().orEmpty(),
                            fontSize = 12.sp,
                            style = MaterialTheme.typography.caption
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = wisata.getDeskripsi().orEmpty(),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.body2
                        )
                    }
                }
            }

        }
    }
}
