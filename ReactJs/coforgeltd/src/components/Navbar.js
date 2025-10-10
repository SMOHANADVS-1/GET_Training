import React from 'react'
import { Link } from 'react-router'
import '../styles/Navbar.css'

export default function Navbar() {
  return (
    <div>
        <nav className="navbar">
            <ul className="nav-list">
                <li className="nav-item">
                     <Link to="/" className="nav-link">Home</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="jsx1" className="nav-link">JSX Demo</Link> {/* <a href='/'> */}         
                </li>

                <li className="nav-item">
                     <Link to="/profile" className="nav-link">Profile</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/props" className="nav-link">PropsDemo</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/abc" className="nav-link">StatesDemo</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/addNum" className="nav-link">Addition</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/login" className="nav-link">Login</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/hooks" className="nav-link">React Hooks </Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/listdemo" className="nav-link">List Demo </Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/survey" className="nav-link">Survey Form </Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/rest1" className="nav-link">Rest Api Demo </Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/customers" className="nav-link">Add Customers</Link> {/* <a href='/'> */}         
                </li>
                <li className="nav-item">
                     <Link to="/display" className="nav-link">Customers RestAPI</Link> {/* <a href='/'> */}         
                </li>
            </ul>
        </nav>
 </div> 
  )
}
