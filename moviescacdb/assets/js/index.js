const apiKey = '80d07820';
const apiUrl = 'https://www.omdbapi.com/';

// Obtenemos el elemento de búsqueda a través del id.
const buttonSearch = document.getElementById('buttonSearch');

// Asociamos un event listener al botón de búsqueda para ejecutar la función que traerá los resultados de la API.
buttonSearch.addEventListener('click', searchMovies);

// Definimos la función searchMovies para buscar las películas
async function searchMovies() 
{
    // Obtenemos el término de búsqueda desde el input
    const searchTerm = document.getElementById('inputSearch').value;

    // Verificamos si el término de búsqueda está vacío
    if (!searchTerm.trim()) 
    {
        alert('El campo de búsqueda está vacío. Por favor, introduce una palabra.');
        return; // Salimos de la función si el campo está vacío
    }

    // Obtenemos la lista de películas para mostrar los resultados
    const movieList = document.getElementById('movieList');
    movieList.innerHTML = ''; // Limpiamos el contenido previo

    try 
    {
        const response = await fetch(`${apiUrl}?apiKey=${apiKey}&s=${searchTerm}`);
        const data = await response.json(); // Convertimos la respuesta de la API a formato JSON

        if (data.Response === 'True') 
        { // Iteramos los resultados y creamos respectivos elementos HTML para mostrar las películas.
            data.Search.forEach(async movie => 
            {
                // Realizaremos una petición a la API para obtener la información de la película
                const movieDetailsResponse = await fetch(`${apiUrl}?apiKey=${apiKey}&i=${movie.imdbID}`);
                const movieDetails = await movieDetailsResponse.json();

                // Creamos los elementos HTML para representar la información de la película
                const article = document.createElement('article'); // Generamos un nuevo elemento
                article.classList.add('movie-list__card'); // Asignamos la clase correspondiente

                const cardImg = document.createElement('div');
                cardImg.classList.add('card__img');

                const moviePoster = document.createElement('img');
                moviePoster.src = movieDetails.Poster; // Asignamos el atributo src, la ruta del póster de la película
                moviePoster.alt = `${movie.Title} Poster`; // Asignamos el atributo alt, el título de la película
                moviePoster.classList.add('movie-img'); // Añadimos la clase para el manejo de visibilidad

                // Solo mostramos la imagen cuando esté cargada correctamente
                moviePoster.onload = () => {
                    moviePoster.classList.add('loaded');
            };

            const movieTitle = document.createElement('h4');
            movieTitle.classList.add('card__movie-title');
            movieTitle.textContent = `${movie.Title} (${movie.Year})`; // Asignamos el texto del título de la película

            const cardMovieTitleBox = document.createElement('div');
            cardMovieTitleBox.classList.add('card__title-box');

            // Estructuramos los elementos HTML creados de acuerdo a su jerarquía en el DOM
            movieList.appendChild(article);
            article.appendChild(cardImg);
            cardImg.appendChild(moviePoster);
            cardImg.appendChild(cardMovieTitleBox);
            cardMovieTitleBox.appendChild(movieTitle);
            });
        } 
        else 
        { // Si no se encuentran películas para mostrar, mostramos un mensaje de error
            const p = document.createElement('p');
            p.innerHTML = '<i class="bx bx-info-circle"></i> No se encontraron películas';
            movieList.appendChild(p);
            p.classList.add('movies-app__alert');
        }
    } 
    catch (error) 
    {
        // En caso de error de conexión con la API, mostramos un mensaje de error por la consola
        console.error('Error al buscar películas: ', error);
    }
}