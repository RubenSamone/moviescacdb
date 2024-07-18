document.getElementById('loginForm').addEventListener('submit', function(event) 
{
    event.preventDefault();

    // Obtener los datos ingresados por el usuario
    const username = document.getElementById('loginUsername').value;
    const password = document.getElementById('loginPassword').value;

    // Obtener los usuarios almacenados en el almacenamiento local
    const users = JSON.parse(localStorage.getItem('users')) || [];

    // Buscar el usuario por su nombre de usuario
    const user = users.find(user => user.username === username);

    if (!user) {
        alert('El usuario no existe');
        return;
    }

    // Validar la contraseña
    if (user.password !== password) {
        alert('Contraseña incorrecta');
        return;
    }

    // Usuario autenticado exitosamente
    alert('Inicio de sesión exitoso');

    // Redirigir al usuario a la página de inicio después de iniciar sesión
    window.location.href = 'index.html';
});