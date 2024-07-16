document.getElementById("registerForm").addEventListener("submit", function(event) 
{
    event.preventDefault();

    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;
    const email = document.getElementById("email").value;

    fetch("register", 
    {
        method: "POST",
        headers: 
        {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ username, password, email })
    })
    .then(response => response.json())
    .then(data => 
    {
        if (data.success) 
        {
            alert("Registration successful! You can now log in.");
            window.location.href = "logear.html";
        } 
        else 
        {
            alert("Registration failed: " + data.message);
        }
    });
});