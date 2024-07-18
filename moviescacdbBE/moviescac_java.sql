create database moviescac_java;
use moviescac_java;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
CREATE TABLE `peliculas` 
(
  `id_pelicula` int(11) NOT NULL,
  `titulo` varchar(75) NOT NULL,
  `duracion` varchar(25) NOT NULL,
  `genero` varchar(75) NOT NULL,
  `imagen` varchar(255) NOT NULL
);

INSERT INTO `peliculas` (`id_pelicula`, `titulo`, `duracion`, `genero`, `imagen`) VALUES
(2, 'El club de la Pelea', '2h 19m', 'Acción/Crimen', 'https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRIEKnHz0o-W0q9PflJ5tNotbuaYRJkt5dfitOfDHP8J8PJBnMX'),
(3, 'El Origen', '2h 28m', 'Ciencia ficción/Acción', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfzT9O0IBDumCXZjeAIhSYLANDT5ip_dwMNKr9-fBQfaSuD3sv'),
(4, 'Total Recall', '2h 10m', 'Acción/Ciencia ficción', 'https://desvariando.files.wordpress.com/2021/02/total-recall-2012-review.jpg'),
(5, 'Matrix', '2h 16m', 'Acción/Ciencia ficción', 'https://static.cinepolis.com.ar/posters/1570/w500/matrix4k-v-dd-ka-tt-2000x3000-300dpi-lmjpg'),
(6, 'John Wick', '1h 41m', 'Acción/Suspenso', 'https://static1.srcdn.com/wordpress/wp-content/uploads/2024/01/john-wick-franchise-poster.jpg'),
(7, 'Guason', '2h 2m', 'Suspenso/Crimen', 'https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTMYO-t9aVtNKNrXHGcNZu2BDEZJFoZnGZPCLOyXr4AjHGDiXFq'),
(8, 'Iron Man', '2h 6m', 'Acción/Ciencia ficción', 'https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcT95Db6V4jzEkaZjnWEV5n0qHu1a2InkUgafj3lWQDRxQIxYvL3'),
(9, 'Peaky Blinders', '6 Temporadas', 'Drama', 'https://www.ecartelera.com/carteles-series/200/271/004_m.jpg'),
(10, 'Vikingos', '6 Temporadas', 'Acción/Suspenso', 'https://pics.filmaffinity.com/vikings-616055151-large.jpg'),
(11, 'El Perfume', '1 Temporada', 'Suspenso', 'https://pics.filmaffinity.com/El_perfume_Miniserie_de_TV-187007909-large.jpg'),
(12, 'Fallout', '1 Temporada', 'Drama', 'https://es.web.img2.acsta.net/pictures/23/12/04/09/17/0878957.jpg'),
(13, 'El Jardin de Bronce', '3 Temporadas', 'Drama', 'https://pbs.twimg.com/media/EitgsVBWkAA1NsP.jpg');

ALTER TABLE `peliculas`
  ADD PRIMARY KEY (`id_pelicula`);

ALTER TABLE `peliculas`
  MODIFY `id_pelicula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;