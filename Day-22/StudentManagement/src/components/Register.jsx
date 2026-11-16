// import { useEffect, useState } from "react";
// import { Link } from "react-router-dom";

// const API = "http://localhost:8080/students";

// function Register() {

//     const [student, setStudent] = useState({
//         name: "",
//         email: "",
//         password: "",
//         phone: ""
//     });

//     const [students, setStudents] = useState([]);
//     const [message, setMessage] = useState("");

//     // Get All Students
//     const fetchStudents = async () => {
//         try {
//             const response = await fetch(API);
//             const data = await response.json();
//             setStudents(data);
//         } catch (error) {
//             console.error("Error fetching students:", error);
//         }
//     };

//     useEffect(() => {
//         fetchStudents();
//     }, []);

//     // Handle Input
//     const handleChange = (e) => {
//         setStudent({
//             ...student,
//             [e.target.name]: e.target.value
//         });
//     };

//     // Register Student
//     const handleSubmit = async (e) => {
//         e.preventDefault();

//         try {
//             const response = await fetch(`${API}/register`, {
//                 method: "POST",
//                 headers: {
//                     "Content-Type": "application/json"
//                 },
//                 body: JSON.stringify(student)
//             });

//             const result = await response.text();

//             setMessage(result);

//             if (result === "Registration successful") {

//                 setStudent({
//                     name: "",
//                     email: "",
//                     password: "",
//                     phone: ""
//                 });

//                 fetchStudents();
//             }

//         } catch (error) {
//             setMessage("Unable to connect to server");
//             console.error(error);
//         }
//     };

//     return (
//         <div className="portal">

//             <h1>Student Registration Portal</h1>

//             <p className="login-link">
//                 Already registered?
//                 <Link to="/"> Login Here</Link>
//             </p>

//             <div className="form-section">

//                 <h2>Register Student</h2>

//                 <form onSubmit={handleSubmit}>

//                     <input
//                         type="text"
//                         name="name"
//                         placeholder="Enter your name"
//                         value={student.name}
//                         onChange={handleChange}
//                         required
//                     />

//                     <input
//                         type="email"
//                         name="email"
//                         placeholder="Enter your email"
//                         value={student.email}
//                         onChange={handleChange}
//                         required
//                     />

//                     <input
//                         type="password"
//                         name="password"
//                         placeholder="Enter your password"
//                         value={student.password}
//                         onChange={handleChange}
//                         required
//                     />

//                     <input
//                         type="tel"
//                         name="phone"
//                         placeholder="Enter your phone number"
//                         value={student.phone}
//                         onChange={handleChange}
//                         pattern="[0-9]{10}"
//                         maxLength="10"
//                         required
//                     />

//                     <button type="submit">Submit</button>

//                 </form>

//                 <p className="message">{message}</p>

//             </div>

//             <div className="table-section">

//                 <h2>Students Registered</h2>

//                 <table>
//                     <thead>
//                         <tr>
//                             <th>ID</th>
//                             <th>Name</th>
//                             <th>Email</th>
//                             <th>Phone</th>
//                         </tr>
//                     </thead>

//                     <tbody>

//                         {students.length > 0 ? (

//                             students.map((s) => (
//                                 <tr key={s.id}>
//                                     <td>{s.id}</td>
//                                     <td>{s.name}</td>
//                                     <td>{s.email}</td>
//                                     <td>{s.phone}</td>
//                                 </tr>
//                             ))

//                         ) : (
//                             <tr>
//                                 <td colSpan="4">
//                                     No students registered yet
//                                 </td>
//                             </tr>
//                         )}

//                     </tbody>
//                 </table>

//             </div>

//         </div>
//     );
// }

// export default Register;


import { useState } from "react";
import { Link } from "react-router-dom";

const API = "http://localhost:8080/students";

function Register() {

    const [student, setStudent] = useState({
        name: "",
        email: "",
        password: "",
        phone: ""
    });

    const [message, setMessage] = useState("");

    const handleChange = (e) => {
        setStudent({
            ...student,
            [e.target.name]: e.target.value
        });
    };

    const handleRegister = async (e) => {
        e.preventDefault();

        try {
            const response = await fetch(`${API}/register`, {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(student)
            });

            const result = await response.text();

            setMessage(result);

            if (response.ok) {
                setStudent({
                    name: "",
                    email: "",
                    password: "",
                    phone: ""
                });
            }

        } catch (error) {
            setMessage("Unable to connect to server");
        }
    };

    return (
        <div>

            <h1>Student Registration Portal</h1>

            <form onSubmit={handleRegister}>

                <input
                    type="text"
                    name="name"
                    placeholder="Enter your name"
                    value={student.name}
                    onChange={handleChange}
                    required
                />

                <input
                    type="email"
                    name="email"
                    placeholder="Enter your email"
                    value={student.email}
                    onChange={handleChange}
                    required
                />

                <input
                    type="password"
                    name="password"
                    placeholder="Enter your password"
                    value={student.password}
                    onChange={handleChange}
                    required
                />

                <input
                    type="tel"
                    name="phone"
                    placeholder="Enter your phone number"
                    value={student.phone}
                    onChange={handleChange}
                    pattern="[0-9]{10}"
                    required
                />

                <button type="submit">Submit</button>

            </form>

            <p>{message}</p>

            <p>
                Already registered?
                <Link to="/"> Login Here</Link>
            </p>

        </div>
    );
}

export default Register;
