function Exam() {
  return (
    <div className="container">

      <h2>Online Exam</h2>

      <form>

        <p>1. HTML stands for?</p>

        <input type="text" placeholder="Enter Answer" />

        <p>2. React is a ?</p>

        <input type="text" placeholder="Enter Answer" />

        <p>3. Which command is used to run Vite app?</p>

        <input type="text" placeholder="Enter Answer" />

        <button type="button">
          Submit Exam
        </button>

      </form>

    </div>
  );
}

export default Exam;