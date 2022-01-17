package com.example.difutil

import com.example.difutil.model.Book

object Util {
    const val DETAIL_KEY = "Detail key"

    fun createDummyData() : List<Book>{
        return listOf(Book(id = 1, author = "Janet Evanovich", title = "GAME ON", bookCover = "https://storage.googleapis.com/du-prd/books/images/9781982154875.jpg"),
            Book(id = 2, author = "John Grisham", title = "THE JUDGE'S LIST",bookCover = "https://storage.googleapis.com/du-prd/books/images/9780385546027.jpg" ),
            Book(id = 3, author = "Mitch Albom", title = "THE STRANGER IN THE LIFEBOAT", bookCover = "https://storage.googleapis.com/du-prd/books/images/9780062888341.jpg" ),
            Book(id = 4, author = "Lee Child and Andrew Child", title = "BETTER OFF DEAD", bookCover = "https://storage.googleapis.com/du-prd/books/images/9781984818508.jpg"),
            Book(id = 5, author = "Amor Towles", title = "THE LINCOLN HIGHWAY", bookCover = "https://storage.googleapis.com/du-prd/books/images/9780735222359.jpg"),
            Book(id = 6, author = "Paul McCartney", title = "1956 TO THE PRESENT", bookCover = "https://storage.googleapis.com/du-prd/books/images/9781631492563.jpg" ),
            Book(id = 7, author = "Philipp Dettmer", title = "IMMUNE",bookCover = "https://storage.googleapis.com/du-prd/books/images/9780593241318.jpg" ),
            Book(id = 8, author = "Brian Kilmeade", title = "THE PRESIDENT AND THE FREEDOM FIGHTER", bookCover = "https://storage.googleapis.com/du-prd/books/images/9780525540571.jpg"),
            Book(id = 9, author = "Dave Grohl", title = "THE STORYTELLER",bookCover =  "https://storage.googleapis.com/du-prd/books/images/9780063076099.jpg"),
            Book(id = 10, author = "Katie Couric", title = "GOING THERE", bookCover = "https://storage.googleapis.com/du-prd/books/images/9780316535861.jpg" ),
            Book(id = 11, author = "Colleen Hoover", title = "IT ENDS WITH US",bookCover = "https://storage.googleapis.com/du-prd/books/images/9781501110375.jpg" ),
            Book(id = 12, author = "Taylor Jenkins Reid", title = "THE SEVEN HUSBANDS OF EVELYN HUGO", bookCover = "https://storage.googleapis.com/du-prd/books/images/9781501161933.jpg"),
            Book(id = 13, author = "Ali Hazelwood", title = "THE LOVE HYPOTHESIS",bookCover =  "https://storage.googleapis.com/du-prd/books/images/9780593336823.jpg"),
            Book(id = 14, author = "Delia Owens", title = "WHERE THE CRAWDADS SING", bookCover = "https://storage.googleapis.com/du-prd/books/images/9780735219090.jpg" )
        )
    }

}

