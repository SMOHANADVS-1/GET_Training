import React from 'react'
import Welcome from './Welcome';
import '../styles/PropsDemo.css';


export default function PropsDemo() {
  return (
    <div className="container">
      <h1>🎓 Props Demonstration in React</h1>
      <ul>
        <li>Props (Passing Data Between Components)</li>
         <li>Demonstrate component reusability and data flow.</li>
          <li>Passing values using attributes</li>
           <li>Accessing props inside child components</li>
           <li>String, number, and array props</li>
      </ul>
      <hr />

      <Welcome name="Rajashekar" role="Full Stack Trainer" company="TechMentor" experience="10" />
      <Welcome name="Aditi" role="Frontend Developer" company="InfyTech" experience="4" />
      <Welcome name="Karan" role="Backend Engineer" company="CodeWave" experience="6" />
    </div>
  )
}
