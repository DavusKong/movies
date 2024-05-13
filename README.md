This project provides the backend for the Front End project movie_gold_v1 project in this repository.

Project uses Maven, Spring, and Java, it provides an REST API for managing movies in a cloud based MongoDb Atlas movie database.

For Example the class MovieController has two methods:

getAllMovies(): This method handles a GET request to the "/api/v1/movies" endpoint and returns a list of all movies. It uses the movieService to fetch the movies and wraps them in a ResponseEntity with an HTTP status of OK (200).

getSingleMovie(@PathVariable String imdbId): This method handles a GET request to the "/api/v1/movies/{imdbId}" endpoint, where {imdbId} is a path variable representing the IMDB ID of a movie. It returns a single movie with the specified IMDB ID. Again, it uses the movieService to fetch the movie and wraps it in a ResponseEntity with an HTTP status of OK (200).

Access to database
An .env file not included in this repository is required to gain access to the online database, containing username password etc.

MongoDB

Database JSON format example

{
  "_id": {
    "$oid": ""
  },
  "imdbId": "",
  "title": "Puss in Boots: The Last Wish",
  "releaseDate": "2022-12-21",
  "trailerLink": "https://www.youtube.com/watch?v=tHb7WlgyaUc",
  "genres": [
    "Animation",
    "Action",
    "Adventure",
    "Comedy",
    "Family"
  ],
  "poster": "https://image.tmdb.org/t/p/w500/1NqwE6LP9IEdOZ57NCT51ftHtWT.jpg",
  "backdrops": [
    "https://image.tmdb.org/t/p/original/r9PkFnRUIthgBp2JZZzD380MWZy.jpg",
    "https://image.tmdb.org/t/p/original/faXT8V80JRhnArTAeYXz0Eutpv9.jpg",
    "https://image.tmdb.org/t/p/original/pdrlEaknhta2wvE2dcD8XDEbAI4.jpg",
    "https://image.tmdb.org/t/p/original/tGwO4xcBjhXC0p5qlkw37TrH6S6.jpg",
    "https://image.tmdb.org/t/p/original/cP8YNG3XUeBmO8Jk7Skzq3vwHy1.jpg",
    "https://image.tmdb.org/t/p/original/qLE8yuieTDN93WNJRmFSAEJChOg.jpg",
    "https://image.tmdb.org/t/p/original/vNuHqmOJRQXY0PBd887DklSDlBP.jpg",
    "https://image.tmdb.org/t/p/original/uUCc62M0I3lpZy0SiydbBmUIpNi.jpg",
    "https://image.tmdb.org/t/p/original/2wPJIFrBhzzAP8oHDOlShMkERH6.jpg",
    "https://image.tmdb.org/t/p/original/fnfirCEDIkxZnQEtEMMSgllm0KZ.jpg"
  ],
  "reviewIds": []
}
