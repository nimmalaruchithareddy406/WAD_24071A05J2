import { Link, Routes, Route } from "react-router-dom";

import Home from "./pages/Home";
import Register from "./pages/Register";
import Login from "./pages/Login";
import Exam from "./pages/Exam";
import Result from "./pages/Result";
import Profile from "./pages/Profile";

function Footer() {
  return (
    <footer>
      copyright@24071A05J2
    </footer>
  );
}

function App() {
  return (
    <div>

      <nav>
        <h2>Online Examination System</h2>

        <div>
          <Link to="/">Home</Link>
          <Link to="/register">Register</Link>
          <Link to="/login">Login</Link>
          <Link to="/exam">Exam</Link>
          <Link to="/result">Result</Link>
          <Link to="/profile">Profile</Link>
        </div>
      </nav>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/register" element={<Register />} />
        <Route path="/login" element={<Login />} />
        <Route path="/exam" element={<Exam />} />
        <Route path="/result" element={<Result />} />
        <Route path="/profile" element={<Profile />} />
      </Routes>

      <Footer />

    </div>
  );
}

export default App;