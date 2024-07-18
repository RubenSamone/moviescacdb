document.getElementById('registerForm').addEventListener('submit', function(event) 
{
    event.preventDefault();

    const name = document.getElementById('name').value;
    const username = document.getElementById('username').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    const user = { name, username, email, password };

    let users = JSON.parse(localStorage.getItem('users')) || [];
    users.push(user);

    localStorage.setItem('users', JSON.stringify(users));

    alert('Usuario registrado exitosamente');
    this.reset();

    // Redirigir al index.html después del registro exitoso
    window.location.href = 'logear.html';
});