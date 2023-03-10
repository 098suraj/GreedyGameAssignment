package com.example.template.data.mainModel


import com.google.gson.annotations.SerializedName

data class ArtistModel(
    @SerializedName("topartists")
    val topartists: Topartists
) {
    data class Topartists(
        @SerializedName("artist")
        val artist: List<Artist>,
        @SerializedName("@attr")
        val attr: Attr
    ) {
        data class Artist(
            @SerializedName("@attr")
            val attr: Attr,
            @SerializedName("image")
            val image: List<Image>,
            @SerializedName("mbid")
            val mbid: String?,
            @SerializedName("name")
            val name: String,
            @SerializedName("streamable")
            val streamable: String,
            @SerializedName("url")
            val url: String
        ) {
            data class Attr(
                @SerializedName("rank")
                val rank: String
            )

            data class Image(
                @SerializedName("size")
                val size: String,
                @SerializedName("#text")
                val text: String
            )
        }

        data class Attr(
            @SerializedName("page")
            val page: String,
            @SerializedName("perPage")
            val perPage: String,
            @SerializedName("tag")
            val tag: String,
            @SerializedName("total")
            val total: String,
            @SerializedName("totalPages")
            val totalPages: String
        )
    }
}