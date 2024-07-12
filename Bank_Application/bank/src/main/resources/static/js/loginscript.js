const form = document.getElementById('login-form');

form.addEventListener('submit', (event) => {
  event.preventDefault();

  // Simulate login logic (replace with your actual logic)
  const username = document.getElementById('username').value;
  const password = document.getElementById('password').value;

  if (username === 'admin' && password === 'password123') {
    alert('Login successful!');
    // Redirect to another page or perform other actions after successful login
  } else {
    alert('Invalid username or password!');
  }
});
