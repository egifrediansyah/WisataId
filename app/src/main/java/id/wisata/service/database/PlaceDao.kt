package id.wisata.service.database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import id.wisata.data.model.Place


@Dao
interface PlaceDao {
    @Query("select * from place order by id desc")
    fun getAll() : LiveData<List<Place>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(place: Place)

    @Query("delete from place")
    fun deleteAll()

    @Query("select * from place where id = :id")
    fun find(id : Int) : LiveData<Place>
}