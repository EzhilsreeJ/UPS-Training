import { useState } from "react";
import { Link } from "react-router-dom";

const API = "http://localhost:8080/students";

function Login() {

    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [message, setMessage] = useState("");
    const [student, setStudent] = useState(null);

    const handleLogin = async (e) => {
        e.preventDefault();
        setStudent(null);
        setMessage("");

        try {
            const response = await fetch(`${API}/login`, {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({ email, password })
            });

            if (response.ok) {
                const data = await response.json();
                setStudent(data);
                setMessage("Login successful!");
            } else {
                setMessage(await response.text());
            }

        } catch (error) {
            setMessage("Unable to connect to server");
        }
    };

    return (
        <div className="container">

            <h2>Student Login</h2>

            <form onSubmit={handleLogin}>

                <input
                    type="email"
                    placeholder="Enter your email"
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}
                    required
                />

                <input
                    type="password"
                    placeholder="Enter your password"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                    required
                />

                <button type="submit">Login</button>

            </form>

            <p className="message">{message}</p>

            {student && (
                <div className="user-details">
                    <h3>Welcome, {student.name}!</h3>
                    <p>ID: {student.id}</p>
                    <p>Email: {student.email}</p>
                    <p>Phone: {student.phone}</p>
                </div>
            )}

            <p>
                Don't have an account?
                <Link to="/register"> Register Here</Link>
            </p>

        </div>
    );
}

export default Login;