create database peliculas_db;

use peliculas_db;

create table `peliculas`
(
	`idpel` int not null,
	`nombre` varchar (75) not null,
	`descrip` varchar(500) not null,
	`portada` varchar (250) not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `peliculas` (`idpel`, `nombre`,`descrip`,`portada`) VALUES
(1, "El club de la Pelea", "Un empleado de oficina insomne en busca de una manera de cambiar su vida se cruza con un vendedor y crean un club de lucha clandestino como forma de terapia.", "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRIEKnHz0o-W0q9PflJ5tNotbuaYRJkt5dfitOfDHP8J8PJBnMX"),
(2, "El Origen", "Dom Cobb es un ladrón capaz de adentrarse en los sueños de la gente y hacerse con sus secretos. Sin embargo, ahora tiene que llevar a cabo una misión diferente a lo que ha hecho siempre: realizar una incepción para implantar una idea en el subconsciente de una persona. El plan se complica debido a la intervención de alguien que parece predecir cada uno de los movimientos de Cobb, alguien a quien solo él puede enfrentarse.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfzT9O0IBDumCXZjeAIhSYLANDT5ip_dwMNKr9-fBQfaSuD3sv"),
(3, "Total Recall", "El empleado de una fábrica decide tomarse unas pequeñas vacaciones mentales contratando a una empresa de viajes virtuales para que le implante recuerdos de un inexistente viaje turístico a Marte.", "https://desvariando.files.wordpress.com/2021/02/total-recall-2012-review.jpg"),
(4, "Matrix", "El programador informático Thomas Anderson, más conocido en el mundo de los hacker como Neo, está en el punto de mira del temible agente Smith. Otros dos piratas informáticos, Trinity y Morfeo, se ponen en contacto con Neo para ayudarlo a escapar. Matrix te posee. Sigue al conejo blanco.", "https://static.cinepolis.com.ar/posters/1570/w500/matrix4k-v-dd-ka-tt-2000x3000-300dpi-lmjpg"),
(5, "John Wick", "En Nueva York, John Wick, un asesino a sueldo retirado, vuelve otra vez a la acción para vengarse de los gánsteres que le quitaron todo.", "https://static1.srcdn.com/wordpress/wp-content/uploads/2024/01/john-wick-franchise-poster.jpg"),
(6, "Guason", "La pasión de Arthur Fleck, un hombre ignorado por la sociedad, es hacer reír a la gente. Sin embargo, una serie de trágicos sucesos harán que su visión del mundo se distorsione considerablemente convirtiéndolo en un brillante criminal.", "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTMYO-t9aVtNKNrXHGcNZu2BDEZJFoZnGZPCLOyXr4AjHGDiXFq"),
(7, "Iron Man", "Tony Stark es un inventor de armamento brillante que es secuestrado en el extranjero. Sus captores son unos terroristas que le obligan a construir una máquina destructiva pero Tony se construirá una armadura para poder enfrentarse a ellos y escapar.", "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcT95Db6V4jzEkaZjnWEV5n0qHu1a2InkUgafj3lWQDRxQIxYvL3"),
(8, "Peaky Blinders", "Peaky Blinders es un drama de BBC que narra la historia de la familia gitana Shelby y su banda de gángsters, un grupo de personas características por sus boinas con cuchillas y dueñas de los asuntos ilegales, que dominan las apuestas clandestinas y se rigen mediante extorsiones.", "https://www.ecartelera.com/carteles-series/200/271/004_m.jpg"),
(9, "Vikingos", "El programa retrata a Ragnar como un granjero que ha conseguido construir barcos revolucionarios con instrumentos de navegación también revolucionarios. Con ellas puede hacer exitosas incursiones en Inglaterra, alcanzar la fama y convertirse en un rey escandinavo, con la ayuda de su familia y sus guerreros.", "https://pics.filmaffinity.com/vikings-616055151-large.jpg"),
(10, "Pefume", "Tras encontrar a una cantante asesinada con las glándulas odoríferas extirpadas, los detectives investigan a un grupo de amigos que asistió al mismo internado que ella. Ve todo lo que quieras. Philipp Kadelbach, ganador del Emmy Internacional, dirige esta adaptación del clásico contemporáneo de Patrick Süskind.", "https://pics.filmaffinity.com/El_perfume_Miniserie_de_TV-187007909-large.jpg"),
(11, "Fallout", "Basada en una de las franquicias de videojuegos más grande de todos los tiempos, Fallout es la historia de lo que se tiene y lo que no en un mundo donde ya no queda casi nada por tener. 200 años después del apocalipsis, la habitante pacífica de un cómodo refugio antinuclear se ve forzada a regresar a la superficie y se sorprende al descubrir lo que le espera en el yermo.", "https://es.web.img2.acsta.net/pictures/23/12/04/09/17/0878957.jpg"),
(12, "El Jardin de Bronce", "El jardín de bronce cuenta la historia del arquitecto Fabián Danubio y su incansable lucha por encontrar a su hija, que desapareció de la forma más misteriosa y extraña. Sin casi respuestas ni explicaciones por parte de la policía, Fabián se embarca en su propia investigación hasta el punto de ser su obsesión.", "https://pbs.twimg.com/media/EitgsVBWkAA1NsP.jpg");

ALTER TABLE `peliculas`
  ADD PRIMARY KEY (`idpel`);

ALTER TABLE peliculas
  MODIFY `idpel` int NOT NULL AUTO_INCREMENT;
COMMIT;

