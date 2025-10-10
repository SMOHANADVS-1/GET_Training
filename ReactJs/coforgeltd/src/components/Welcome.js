import React from 'react'
//child component
export default function Welcome(props) {
  return (
     <div className="card">
      <h2>Welcome, {props.name} 👋</h2>
      <p>You are a {props.role} at {props.company}.</p>
      <p>Experience: {props.experience} years</p>
    </div>
  )
}
