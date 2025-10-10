import React from 'react'
import '../styles/JSXDemo.css';
export default function JSXDemo() {
    const name = "React 19";
  const currentYear = new Date().getFullYear();
  const date = new Date()
  const skills = ["Hooks", "JSX", "Components", "Props"];
  const name1 = "John Doe";
    const age = 28;
    const isLoggedIn = true;
    // 🔹 Function 1: Add two numbers
  function addNumbers(a, b) {
    return a + b;
  }

  // 🔹 Function 2: Convert text to uppercase
  function convertToUppercase(text) {
    return text.toUpperCase();
  }

  const num1 = 10;
  const num2 = 25;
  const text = "jsx is awesome";
  return (
      <div className="jsx-container">
      <h1 className="jsx-heading">Welcome to {name}!</h1>

      <p className="jsx-intro">
        JSX lets you write HTML inside JavaScript — it’s powerful and expressive.
      </p>

      {skills.length > 0 ? (
        <div className="jsx-section">
          <h3>Key Features:</h3>
          <ul className="jsx-list">
            {skills.map((skill, index) => (
              <li key={index}>{skill}</li>
            ))}
          </ul>
        </div>
      ) : (
        <p>No skills found.</p>)}

        <hr />
        <p>© {currentYear} — Built using {name} 🚀</p>

         <p>My name is<strong>{name1} </strong>and I am <strong>{age}</strong> years old.</p>
      <p>Is user logged in?<strong> {isLoggedIn.toString()}</strong></p>
      <p>Current Time is : <strong>{new Date().toLocaleTimeString()}</strong></p>
            <p>Addition is :<strong> {100+500} </strong></p>
            <p>My skills are: <strong>{skills.join(", ")}</strong></p>
            <p>Today's Date is : <strong>{date.toLocaleDateString()}</strong></p>
              {/* 🔹 Function 1 Output */}
      <div className="jsx-section">
        <h3>Add Two Numbers</h3>
        <p>
          The sum of {num1} and {num2} is:{" "}
          <strong>{addNumbers(num1, num2)}</strong>  {/*  function call*/}
        </p>
      </div>

      {/* 🔹 Function 2 Output */}
      <div className="jsx-section">
        <h3>Convert Text to Uppercase</h3>
        <p>
          Original Text: <em>{text}</em>
        </p>
        <p>
          Uppercase: <strong>{convertToUppercase(text)}</strong>
        </p>
      </div>
    </div>    
  )
}
