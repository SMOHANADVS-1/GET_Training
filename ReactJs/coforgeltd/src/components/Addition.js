import React, { useState, useEffect } from 'react'; //
import '../styles/Addition.css';

const Addition = () => {
    // Define and initialize state using useState() hooks.
    // Use clear, descriptive variable names.
    const [num1, setNum1] = useState('');
    const [num2, setNum2] = useState('');
    const [result, setResult] = useState(null); //
    const [error, setError] = useState(''); //
    const [message, setMessage] = useState('');

    // Functional Component Lifecycle method implementation -useEffect()
    // Executed when component is initialized (componentDidMount equivalent).
    useEffect(() => {
        myMessage();
    }, []); // Empty dependency array ensures it runs only once.

    // Sets the welcome message.
    const myMessage = () => {
        setMessage('React Hooks - Future of ReactJS');
    };

    // Performs the addition and handles validation.
    const myAddition = () => {
        // Convert input values to numbers for addition.
        const number1 = parseFloat(num1);
        const number2 = parseFloat(num2);

        //
        // Check if inputs are valid numbers.
        if (isNaN(number1) || isNaN(number2)) {
            setError('Please enter valid numbers');
            setResult(null); // Reset result on error.
        } else {
            setError(''); // Clear any previous error.
            setResult(number1 + number2); // Set the calculated sum.
        }
    };

    return (
        <div className="container">
            <h2>Add Two Numbers - Functional Component - using useState() & useEffect() React Hooks</h2>
            <h3>{message}</h3>
            <hr />
            <form className="form">
                <label>Enter First Number:</label>
                <input
                    type="number"
                    value={num1}
                    onChange={(e) => setNum1(e.target.value)} //
                    className="input-field"
                />
                <label>Enter Second Number:</label>
                <input
                    type="number"
                    value={num2}
                    onChange={(e) => setNum2(e.target.value)} //
                    className="input-field"
                />
                <button type="button" onClick={myAddition} className="add-button">
                    Add
                </button>
                {/* Conditionally render error and result messages */}
                {error && <p className="error">{error}</p>}
                {result !== null && <p className="result">Result: {result}</p>}
            </form>
        </div>
    );
};

export default Addition;
