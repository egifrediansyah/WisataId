package id.wisata.service.database

import android.app.Application
import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.os.AsyncTask
import id.wisata.data.PlaceInfoList
import id.wisata.data.model.Place

@Database(entities = [Place::class], version = 1, exportSchema = false)
abstract class PlaceDB : RoomDatabase() {
    abstract fun placeDao(): PlaceDao

        companion object {
        private val lock = Any()
        private const val DB_NAME = "place.db"
        private var INSTANCE: PlaceDB? = null

        fun getInstance(application: Application): PlaceDB {
            synchronized(lock) {
                if (PlaceDB.INSTANCE == null) {
                    PlaceDB.INSTANCE =
                        Room.databaseBuilder(
                            application,
                            PlaceDB::class.java, PlaceDB.DB_NAME
                        )
                            .allowMainThreadQueries()
                            .addCallback(object : RoomDatabase.Callback() {
                                override fun onCreate(db: SupportSQLiteDatabase) {
                                    super.onCreate(db)
                                    PlaceDB.INSTANCE?.let {
                                        PlaceDB.prePopulated(it, PlaceInfoList.lstPlace)
                                    }
                                }
                            })
                            .build()
                }
                return INSTANCE!!
            }
        }

        fun prePopulated(database: PlaceDB, placeList: List<Place>) {
            for (place in placeList) {
                AsyncTask.execute { database.placeDao().insert(place) }
            }
        }
    }
}